package algorithm;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt(); 

        for (int i = 1; i <= num1 * num2; i++) {
            if ((i % num1 == 0) && (i % num2 == 0)) {
                System.out.println("LCM = " + i);
                break;
            }
        }

        scanner.close();
    }
}