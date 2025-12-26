package algorithm;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter an integer >> ");
            int number = scanner.nextInt();

            int digits = 0;
            do {
                digits++;
                number /= 10;
            } while (number != 0);

            System.out.println("DigitCount = " + digits);
        }
    }
}