package algorithm;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("n = ");
            int n = scanner.nextInt();

            System.out.print("r = ");
            int r = scanner.nextInt();

            int nMinusR = n - r;

            int nFactorial = 1;
            for (int i = 1; i <= n; i++) {
                nFactorial *= i;
            }

            int rFactorial = 1;
            for (int i = 1; i <= r; i++) {
                rFactorial *= i;
            }

            int nMinusRFactorial = 1;
            for (int i = 1; i <= nMinusR; i++) {
                nMinusRFactorial *= i;
            }

            int combination = nFactorial / (rFactorial * nMinusRFactorial);

            System.out.println(n + "C" + r + " = " + combination);
        }
    }
}