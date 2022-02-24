package lab2.java;

import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

import lab2.java.exceptions.TooLargeMatrix;
import static lab2.java.Utility.readSizeOfMatrix;

public class Main {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("src/lab2/resources/out.txt", false)) {
            int size = readSizeOfMatrix();
            Matrix matrix = new Matrix(size);
            for (int i = 0; i < 3; i++) {
                fileWriter.append(matrix.toString());
                matrix.rotate90();
                matrix.divideMembers();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception");
        } catch(OutOfMemoryError | TooLargeMatrix  | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}