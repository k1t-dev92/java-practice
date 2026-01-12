package algorithm;

import java.util.Scanner;

public class WhitespaceRemover {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a word >> ");
            String text = scanner.nextLine();

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != ' ' && text.charAt(i) != '\t') {
                    System.out.print(text.charAt(i));
                }
            }
            System.out.println();
        }
    }
}