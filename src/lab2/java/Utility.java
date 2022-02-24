package lab2.java;

import lab2.java.exceptions.DivideByZero;
import lab2.java.exceptions.FileNotFoundExc;
import lab2.java.exceptions.TooLargeMatrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utility {

    public static int divide(int dividend, int divisor) throws DivideByZero {
        if (divisor == 0) {
            throw new DivideByZero();
        }
        return dividend / divisor;
    }

    public static int readSizeOfMatrix() throws FileNotFoundExc, TooLargeMatrix, InputMismatchException {
        try{
            File file = new File("src/lab2/resources/input.txt");
            Scanner scanner = new Scanner(file);
            int size = scanner.nextInt();
            if (size > 1_000_000) {
                throw new TooLargeMatrix();
            }
            if (size == 0)
            {
                throw new IllegalArgumentException();
            }
            return size;
        }
        catch(FileNotFoundException e){
            throw new FileNotFoundExc();
        }
    }
}
