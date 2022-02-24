package lab7.java;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException();
        }
        int n = Integer.parseInt(args[0]);

        //BlockingQueue<String> queue = new SynchronousQueue<>(true);
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        ExecutorService writers = Executors.newFixedThreadPool(n, new WriterThreadFactory());
        ExecutorService readers = Executors.newFixedThreadPool(n, new ReaderThreadFactory());

        for (int i = 0; i < n; i++) {
            writers.execute(() -> {
                try {
                    lab6.java.Utils.pause(500, 1000);
                    System.out.println(Thread.currentThread().getName() + ": write message");
                    queue.put("message from: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            readers.execute(() -> {
                try {
                    lab6.java.Utils.pause(500, 8000);
                    System.out.print(Thread.currentThread().getName() + " read ");
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        writers.shutdown();
        readers.shutdown();
    }
}
