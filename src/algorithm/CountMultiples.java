package algorithm;

import java.util.Scanner;

public class CountMultiples {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter two integers >> ");
            int rangeStart = scanner.nextInt();
            int rangeEnd = scanner.nextInt();

            System.out.print("Enter a base >> ");
            int multipleBase = scanner.nextInt();

            int tempValue;
            if (rangeStart > rangeEnd) {
                tempValue = rangeStart;
                rangeStart = rangeEnd;
                rangeEnd = tempValue;
            }

            int multipleCount = 0;
            for (int i = rangeStart; i <= rangeEnd; i++) {
                if (i % multipleBase == 0 ) {
                    multipleCount++;
                }
            }

            System.out.println("There are " + multipleCount + " multiples of " + multipleBase + " in [" + rangeStart + ", " + rangeEnd + "].");
        }
    }
}