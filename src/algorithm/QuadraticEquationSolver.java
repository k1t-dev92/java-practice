package algorithm;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("a = ");
            int a = scanner.nextInt();
            System.out.print("b = ");
            int b = scanner.nextInt();
            System.out.print("c = ");
            int c = scanner.nextInt();

            int discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
                System.out.println("x1 = " + x1 + ", x2 = " + x2);

            } else if (discriminant == 0) {
                double x1 = -b / (2.0 * a);
                System.out.println("x1 = " + x1 + " (double root)");

            } else {
                double realPart = (-b) / (2.0 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2.0 * a);

                System.out.printf("x1 = %.6f%+.6fi, x2 = %.6f%+.6fi%n", realPart, imaginaryPart, realPart, -imaginaryPart);
            }
        }
    }
}
