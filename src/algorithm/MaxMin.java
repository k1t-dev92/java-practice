package algorithm;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementCount = scanner.nextInt();

        int[] numbers = new int[elementCount];
        for (int i = 0; i < elementCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0], min = numbers[0];
        for (int i = 1; i < elementCount; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        scanner.close();
    }
}