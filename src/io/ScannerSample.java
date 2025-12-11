package io;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer >> ");
        int intNumber = scanner.nextInt();

        System.out.print("Please enter a real number >> ");
        double doubleNumber = scanner.nextDouble();

        System.out.print("Please enter a word >> ");
        String word = scanner.next();

        System.out.println("intNumber = " + intNumber);
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("word = " + word);

        scanner.close();
    }
}