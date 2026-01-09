package algorithm;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("a(≠0) =");
            int a = scanner.nextInt();

            if (a == 0) {
                System.out.println("a must be non-zero.");
                return;
            }
            
            System.out.print("b = ");
            int b = scanner.nextInt();
            System.out.print("c = ");
            int c = scanner.nextInt();

            int discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
                System.out.printf("x1 = %.2f, x2 = %.2f%n", x1, x2);

            } else if (discriminant == 0) {
                double x1 = -b / (2.0 * a);
                System.out.printf("x1 = %.2f (double root)%n", x1);

            } else {
                double realPart = (-b) / (2.0 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2.0 * a);
                System.out.printf("x1 = %.2f%+.2fi, x2 = %.2f%+.2fi%n", realPart, imaginaryPart, realPart, -imaginaryPart);
            }
        }
    }
}
