package algorithm;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a word >> ");
            String text = scanner.nextLine();

            for (int i = text.length() - 1; i >= 0; i--) {
                System.out.print(text.charAt(i));
            }
            System.out.println();
        }
    }
}