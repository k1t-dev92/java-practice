package algorithm;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter an integer >> ");
            int number = scanner.nextInt();
            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println(number + "! = " + factorial);
        }
    }
}