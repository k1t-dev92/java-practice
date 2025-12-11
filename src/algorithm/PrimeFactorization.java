package algorithm;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer >> ");
        int number = scanner.nextInt();

        System.out.print(number + " = ");
        int i = 2;
        do {
            if (number % i == 0) {
                System.out.print(i);
                number /= i;

                if (number != 1) {
                    System.out.print("*");
                }
            } else {
                i++;
            }
        } while(number != 1);
        System.out.println();
        
        scanner.close();
    }
}