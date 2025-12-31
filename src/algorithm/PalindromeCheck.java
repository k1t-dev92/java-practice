package algorithm;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String word = scanner.nextLine();
            System.out.println(word);
            
            int left = 0;
            int right = word.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                char leftChar = word.charAt(left);
                char rightChar = word.charAt(right);

                if (leftChar != rightChar) {
                    isPalindrome = false;
                    break;
                } else {
                    left++;
                    right--;
                }
            }

            if (isPalindrome) {
                System.out.println(isPalindrome);
            } else {
                System.out.println(isPalindrome);
            }
        }
    }
}