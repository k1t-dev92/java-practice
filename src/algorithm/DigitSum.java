package algorithm;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter an integer >> ");
            int number = scanner.nextInt();

            int DigitSum = 0;
            do {
                DigitSum += number % 10;
                number /= 10;
            } while (number > 0);

            System.out.println("DigitSum = " + DigitSum);
        }
    }
}