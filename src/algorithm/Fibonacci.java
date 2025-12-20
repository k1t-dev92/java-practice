package algorithm;

import java.util.Scanner;

public class Fibonacci {
    private static final int MAX_N = 92;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int FIB_SIZE = MAX_N + 1;
            int[] fibonacci = new int[FIB_SIZE];
            fibonacci[0] = 0;
            fibonacci[1] = 1;

            System.out.print("n = ");
            int n = scanner.nextInt();

            for (int i = 2; i <= n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            System.out.println("f(" + n + ") = " +fibonacci[n]);
        }
    }
}