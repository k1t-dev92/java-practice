package algorithm;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a word >> ");
            String text = scanner.nextLine();
            
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != ' ') {
                    System.out.print(text.charAt(i));
                }
            }
            System.out.println();
        }
    }
}