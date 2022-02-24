package lab2.java.exceptions;

public class TooLargeMatrix extends Exception {
    public TooLargeMatrix() {
        super("Matrix's size is too large");
    }
}
