package algorithm;

import java.util.Scanner;

public class DivisorsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int sumOfDivisors = 0;
        int countOfDivisors = 0;
        System.out.print("divisors:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sumOfDivisors += i;
                countOfDivisors++;
            }
        }
        System.out.println();
        
        System.out.println("sum = " + sumOfDivisors);
        System.out.println("count = " + countOfDivisors);

        scanner.close();
    }
}