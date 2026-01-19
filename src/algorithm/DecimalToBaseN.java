package algorithm;

import java.util.Scanner;

public class DecimalToBaseN {
    private static final int NUM = 1000;
    private static final int DECIMAL = 10;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] number = new int[NUM];

            System.out.print("Enter an integer >> ");
            int decimal = scanner.nextInt();
            System.out.print("Enter an base >> ");
            int base = scanner.nextInt();
            if (base < 2 || base > 16) {
                return;
            }

            System.out.print(decimal + "(" + DECIMAL + ") = ");

            int i = 0;
            do {
                number[i] = decimal % base;
                decimal /= base;
                i++;
            } while (decimal > 0);

            for (int j = i - 1; j >= 0; j--) {
                switch (number[j]) {
                    case 10:
                        System.out.print("A");
                        break;
                    case 11:
                        System.out.print("B");
                        break;
                    case 12:
                        System.out.print("C");
                        break;
                    case 13:
                        System.out.print("D");
                        break;
                    case 14:
                        System.out.print("E");
                        break;
                    case 15:
                        System.out.print("F");
                        break;
                    default:
                        System.out.print(number[j]);
                        break;
                }
            }
            System.out.println("(" + base + ")");
        }
    }
}