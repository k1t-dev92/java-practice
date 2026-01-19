package algorithm;

import java.util.Scanner;

public class BaseNToDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter an integer >> ");
            String word = scanner.nextLine();

            System.out.print("Enter an base >> ");
            int base = scanner.nextInt();
            if (base < 2 || base > 16) {
                return;
            }

            int decimal = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                int digit;
                if (c >= '0' && c <= '9') {
                    digit = c - '0';
                } else if (c >= 'A' && c <= 'F') {
                    digit = 10 + (c - 'A');
                } else {
                    return;
                }

                if (digit >= base) {
                    return;
                }

                decimal = decimal * base + digit;
            }
            
            System.out.println(word + "(" + base + ") = " + decimal + "(10)");
        }
    }
}