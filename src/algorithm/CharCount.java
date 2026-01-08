package algorithm;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a word >> ");
            String text = scanner.nextLine();

            System.out.print("Enter a target >> ");
            String target = scanner.nextLine();
            if (target.length() == 0) {
                System.out.println("empty");
                return;
            }

            char targetChar = target.charAt(0);

            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == targetChar) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}