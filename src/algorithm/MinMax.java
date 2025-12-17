package algorithm;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int elementCount = scanner.nextInt();

            int[] numbers = new int[elementCount];
            for (int i = 0; i < elementCount; i++) {
                numbers[i] = scanner.nextInt();
            }

            int min = numbers[0];
            int max = numbers[0];
            for (int i = 1; i < elementCount; i++) {
                if (min > numbers[i]) {
                    min = numbers[i];
                }
                if (max < numbers[i]) {
                    max = numbers[i];
                }
            }

            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }
    }
}