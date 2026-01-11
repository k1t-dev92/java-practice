package algorithm;

import java.util.Scanner;

public class VowelOnlyPrinter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a word >> ");
            String text = scanner.nextLine();

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}