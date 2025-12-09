package algorithm;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt(); 
        
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        System.out.println("GCD = " + num1);
        
        scanner.close();
    }
}