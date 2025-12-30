package algorithm;

import java.util.Scanner;

public class BaseNToDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter an integer >> ");
            int number = scanner.nextInt();
            System.out.print("Enter an base >> ");
            int base = scanner.nextInt();

            System.out.print(number + "(" + base + ") = ");

            int decimal = 0;
            int power = 1;
            while (number > 0) {
                int digit = number % 10;
                decimal += digit * power;
                power *= base;
                number /= 10;
            }
            
            System.out.println(decimal + "(10)\n");
        }
    }
}