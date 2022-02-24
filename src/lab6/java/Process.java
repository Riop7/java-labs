package lab6.java;

import java.util.Random;

public class Process {

    private static State state = State.RUNNING;
    private static final Object mutex = new Object();
    private static Thread abstractProgram = new Thread(new AbstractProgram());


    static class AbstractProgram implements Runnable {

        @Override
        public void run() {
            Thread daemon = new Thread(() -> {
                while (true) {
                    Utils.pause(1000, 5000);
                    if (abstractProgram.isInterrupted()) {
                        break;
                    }
                    synchronized (mutex) {
                        System.out.println("Состояние программы сейчас " + state.toString());
                        state = State.values()[new Random().nextInt(State.values().length)];
                        System.out.println("Демон изменил состояние программы на: " + state.toString());
                        mutex.notify();
                    }
                }
            });
            daemon.setDaemon(true);
            daemon.start();

            while (!Thread.currentThread().isInterrupted()) {
                someWork();
            }
        }

        private void someWork() {
            int aboba = 0;
            aboba++;
        }
    }

    static class Supervisor implements Runnable {

        @Override
        public void run() {
            System.out.println("Супервизор запустился");
            abstractProgram.start();
            while (!abstractProgram.isInterrupted()) {
                synchronized (mutex) {
                    try {
                        mutex.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    switch (state) {
                        case FATAL_ERROR -> stopProgram();
                        case UNKNOWN, STOPPING -> runProgram();
                        default -> System.out.println("Супервизор ничего не сделал");
                    }
                }
            }
        }

        private void runProgram() {
            state = State.RUNNING;
            System.out.println("Супервизор перезапустил программу");
        }

        private void stopProgram() {
            abstractProgram.interrupt();
            System.out.println("Супервизор остановил программу");
        }
    }

    public static void main(String[] args) {
        new Thread(new Supervisor()).start();
    }
}