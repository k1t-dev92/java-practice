package algorithm;

import java.util.Scanner;

public class DescriptiveStatistics {
    private static final int DATA_COUNT = 10;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] values = new int[DATA_COUNT];
            double sum = 0.0, sumOfSquares = 0.0;
            for (int i = 0; i < DATA_COUNT; i++) {
                values[i] = scanner.nextInt();
                sum += values[i];
                sumOfSquares += values[i] * values[i];
            }

            double average = sum / DATA_COUNT;
            double variance = (sumOfSquares / DATA_COUNT) - (average * average);
            double standardDeviation = Math.sqrt(variance);

            System.out.println("ave = " + average);
            System.out.println("var = " + variance);
            System.out.println("stdev = " +  ((double)Math.round(standardDeviation * 100))/100);
        }
    }
}