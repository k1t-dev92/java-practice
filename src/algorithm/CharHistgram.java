package algorithm;

import java.util.Scanner;

public class CharHistgram {
    private static final int ALPHABET_SIZE = 26;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a word >> ");
            String word = scanner.nextLine();

            int[] counts = new int[ALPHABET_SIZE];
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if (c < 'a' || c > 'z') {
                    return;
                } else {
                    int index = c - 'a';
                    counts[index]++;
                }
            }

            for (int i = 0; i < ALPHABET_SIZE; i++) {
                char letter = (char)('a' + i);
                System.out.println(letter + ": " + counts[i]);
            }
        }
    }
}