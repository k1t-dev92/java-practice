package algorithm;

import java.util.Scanner;

public class AscendingDescendingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementCount = scanner.nextInt();

        int[] numbers = new int[elementCount];
        for (int i = 0; i < elementCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        int tempValue;
        for (int i = 0; i < elementCount; i++) {
            for (int j = i + 1; j < elementCount; j++) {
                if (numbers[i] > numbers[j]) {
                    tempValue = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempValue;
                }
            }
        }

        System.out.print(" Ascending: ");
        for (int i = 0; i < elementCount; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Descending: ");
        for (int i = elementCount - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    
        scanner.close();
    }
}