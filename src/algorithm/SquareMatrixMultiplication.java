package algorithm;

import java.util.Scanner;

public class SquareMatrixMultiplication {
    private static final int MATRIX_SIZE = 3;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[][] matrixA = new int[MATRIX_SIZE][MATRIX_SIZE];
            int[][] matrixB = new int[MATRIX_SIZE][MATRIX_SIZE];
            int[][] matrixC = new int[MATRIX_SIZE][MATRIX_SIZE];

            System.out.println("Enter matrix A(" + MATRIX_SIZE + "*" + MATRIX_SIZE + ")");
            for (int i = 0; i < MATRIX_SIZE; i++) {
                for (int j = 0; j < MATRIX_SIZE; j++) {
                    matrixA[i][j] = scanner.nextInt();
                }
            }
            System.out.println();

            System.out.println("Enter a matrixB(" + MATRIX_SIZE + "*" + MATRIX_SIZE + ")");
            for (int i = 0; i < MATRIX_SIZE; i++) {
                for (int j = 0; j < MATRIX_SIZE; j++) {
                    matrixB[i][j] = scanner.nextInt();
                }
            }
            System.out.println();

            for (int i = 0; i < MATRIX_SIZE; i++) {
                for (int j = 0; j < MATRIX_SIZE; j++) {
                    for (int k = 0; k < MATRIX_SIZE; k++) {
                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            System.out.println("matrixC(" + MATRIX_SIZE + "*" + MATRIX_SIZE + ")");
            for (int i = 0; i < MATRIX_SIZE; i++) {
                for (int j = 0; j < MATRIX_SIZE; j++) {
                    System.out.print(matrixC[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}