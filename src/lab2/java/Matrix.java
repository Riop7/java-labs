package lab2.java;

import java.util.Random;

import static lab2.java.Utility.divide;

public class Matrix {
    private final int size;
    private int[][] matrix;

    Matrix(int size) {
        this.size = size;
        matrix = new int[size][size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(size + size) - size;
            }
        }
    }

    public void rotate90() {
        int[][] tempMatrix = new int[size][size];
        int[] tempArray = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tempMatrix[size - j - 1][i] = matrix[i][j];
            }
        }
        matrix = tempMatrix;
    }

    public void  divideMembers() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int leftMember = (j == 0) ? (matrix[i][size - 1]) : (matrix[i][j - 1]);
                int rightMember = matrix[i][(j + 1) % size];
                try {
                    matrix[i][j] = divide(matrix[i][j], leftMember + rightMember);
                } catch (ArithmeticException e) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.append(matrix[i][j]).append(" ");
            }
            result.append("\n");
        }
        result.append("\n");
        return result.toString();
    }
}
