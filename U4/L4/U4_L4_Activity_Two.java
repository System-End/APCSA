/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L4_Activity_Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String lower = input.toLowerCase();

        String result = "";
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c != 'e' && c != 't' && c != 'a' && c != 'i' && c != 'o') {
                result += c;
            }
        }

        System.out.println(result);
    }
}
