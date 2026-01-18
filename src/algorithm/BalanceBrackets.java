package algorithm;

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceBrackets {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter brackets >> ");
            String brackets = scanner.nextLine();

            Deque<Character> stack = new ArrayDeque<>();
            for (int i = 0; i < brackets.length(); i++) {
                char c = brackets.charAt(i);

                if (c != '(' && c != ')' && c != '[' && c != ']' && c != '{' && c != '}') {
                    System.out.println(false);
                    return;
                }

                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    if (stack.isEmpty()) {
                        System.out.println(false);
                        return;
                    }

                    char open = stack.pop();

                    if (c == ')' && open != '(') {
                        System.out.println(false);
                        return;
                    } else if (c == ']' && open != '[') {
                        System.out.println(false);
                        return;
                    } else if (c == '}' && open != '{') {
                        System.out.println(false);
                        return;
                    }
                }
            }
            System.out.println(stack.isEmpty());
        }
    }
}