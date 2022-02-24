package lab4.java;

public class Chordata {

    @PrivateMethod(countOfInvokes = 2)
    private void run() {
        System.out.println("I am running!");
    }

    @PrivateMethod(countOfInvokes = 3)
    private void jump() {
        System.out.println("I am jumping!");
    }

    @PrivateMethod(countOfInvokes = 5)
    private void swim() {
        System.out.println("I am swimming!");
    }

    @PrivateMethod(countOfInvokes = 1)
    private void haha() {
        System.out.println("I am haha");
    }
}
