package algorithm;

import java.util.Scanner;

public class UpperLowerSwap {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String text = scanner.nextLine();
            char[] chars = text.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (Character.isUpperCase(c)) {
                    chars[i] = Character.toLowerCase(c);
                } else if (Character.isLowerCase(c)) {
                    chars[i] = Character.toUpperCase(c);
                }
            }
            System.out.println(new String(chars));
        }
    }
}