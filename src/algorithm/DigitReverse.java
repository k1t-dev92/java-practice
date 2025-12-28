package algorithm;

import java.util.Scanner;

public class DigitReverse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter an integer >> ");
            int number = scanner.nextInt();

            int reverse = 0;
            do {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            } while (number != 0);

            System.out.println("DigitReverse = " + reverse);
        }
    }
}