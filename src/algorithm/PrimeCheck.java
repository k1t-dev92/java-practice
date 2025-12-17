package algorithm;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Input an integer >> ");
            int num = scanner.nextInt();

            boolean isPrime = true;

            if (num == 1) {
                isPrime = false;
            }

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}
