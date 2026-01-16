package algorithm;

import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a word >> ");
            String word = scanner.nextLine();

            if (word.length() == 0) {
                System.out.println();
                return;
            }

            char currentChar = word.charAt(0);
            int runLength = 1;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) == currentChar) {
                    runLength++;
                } else {
                    System.out.print("" + currentChar + runLength);
                    currentChar = word.charAt(i);
                    runLength = 1;
                }
            }
            System.out.println("" + currentChar + runLength);
        }
    }
}