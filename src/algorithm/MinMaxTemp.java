package algorithm;

import java.util.Scanner;

public class MinMaxTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementCount = scanner.nextInt();

        int[] numbers = new int[elementCount];
        for (int i = 0; i < elementCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        int tempValue;
        for (int i = 1; i < elementCount; i++) {
            if (numbers[0] > numbers[i]) {
                tempValue = numbers[0];
                numbers[0] = numbers[i];
                numbers[i] = tempValue;
            }
        }

        System.out.println("min = " + numbers[0]);

        for (int i = 1; i < elementCount; i++) {
            if (numbers[0] < numbers[i]) {
                tempValue = numbers[0];
                numbers[0] = numbers[i];
                numbers[i] = tempValue;
            }
        }

        System.out.println("max = " + numbers[0]);

        scanner.close();
    }
}
