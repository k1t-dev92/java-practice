package algorithm;

import java.util.Scanner;
import java.util.Random;

public class RandomPermutation {
    private static final int ARRAY_CAPACITY = 1000;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Random random = new Random();

            int[] numbers = new int[ARRAY_CAPACITY];

            System.out.print("n = ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                numbers[i] = i;
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < n; i++) {
                int randMax = random.nextInt(n);

                int tempValue = numbers[i];
                numbers[i] = numbers[randMax];
                numbers[randMax] = tempValue;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }
}