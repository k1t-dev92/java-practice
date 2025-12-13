package algorithm;

import java.util.Random;

public class MinMaxRandomArray {
    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 100;
    private static final int COUNT = 10;

    public static void main(String[] args) {
        Random rand = new Random();

        int[] rArray = new int[COUNT];

        for (int i = 0; i < rArray.length; i++) {
            rArray[i] = rand.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
            System.out.print(rArray[i] + " ");
        }
        System.out.println();

        int max = rArray[0];
        int min = rArray[0];
        for (int i = 1; i < rArray.length; i++) {
            if (max < rArray[i]) {
                max = rArray[i];
            }
            if (min > rArray[i]) {
                min = rArray[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}