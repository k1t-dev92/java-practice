package algorithm;

import java.util.Scanner;

public class StringFirstLastChar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a word >> ");
            String text = scanner.nextLine();
            
            if (text.length() == 0) {
                System.out.println("empty");
            } else {
                System.out.println(text.charAt(0));
                System.out.println(text.charAt(text.length() - 1));
            }
        }
    }
}