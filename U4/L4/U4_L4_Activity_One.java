/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L4_Activity_One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input String:");
        String input = scanner.nextLine();
        String lower = input.toLowerCase();

        int count = 0;
        for (int i = 0; i < lower.length() - 1; i++) {
            if (lower.charAt(i) == 'p') {
                char next = lower.charAt(i + 1);
                if (
                    next == 'a' ||
                    next == 'e' ||
                    next == 'i' ||
                    next == 'o' ||
                    next == 'u'
                ) {
                    count++;
                }
            }
        }

        System.out.println(
            "Contains p followed by a vowel " + count + " times."
        );
    }
}
