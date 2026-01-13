package algorithm;

import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter two integers >> ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int tempValue;
            if (num1 > num2) {
                tempValue = num1;
                num1 = num2;
                num2 = tempValue;
            }

            int sum = 0;
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }

            System.out.println(sum);
        }
    }
}