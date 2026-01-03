package algorithm;

import java.util.Scanner;
import java.util.Random;

public class MonteCarloPi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            Random random = new Random();

            System.out.print("N = ");
            int n = scanner.nextInt();
            
            int insideCount = 0;
            for (int i = 0; i < n; i++) {
                double x = random.nextDouble();
                double y = random.nextDouble();

                if (x * x + y * y <= 1.0) {
                    insideCount++;
                }
            }

            double piEstimate = 4.0 * insideCount / n;
            System.out.println("π = " + piEstimate);
        }
    }
}