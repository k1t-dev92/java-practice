package io;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter an integer >> ");
            int userInput1 = scanner.nextInt();

            System.out.print("Please enter a real number >> ");
            double userInput2 = scanner.nextDouble();

            System.out.print("Please enter a userInput3 >> ");
            String userInput3 = scanner.next();

            System.out.println("userInput1 = " + userInput1);
            System.out.println("userInput2 = " + userInput2);
            System.out.println("userInput3 = " + userInput3);
        }
    }
}