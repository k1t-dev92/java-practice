package io;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer >> ");
        int i_num = scanner.nextInt();

        System.out.print("Please enter a real number >> ");
        double d_num = scanner.nextDouble();

        System.out.print("Please enter a word >> ");
        String str = scanner.next();

        System.out.println("i_num = " + i_num);
        System.out.println("d_num = " + d_num);
        System.out.println("str = " + str);

        scanner.close();
    }
}