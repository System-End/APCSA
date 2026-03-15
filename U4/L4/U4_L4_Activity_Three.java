/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L4_Activity_Three {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings:");
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if (first.length() != second.length()) {
            System.out.println("error");
        } else {
            String result = "";
            for (int i = first.length() - 1; i >= 0; i--) {
                result += second.charAt(i);
                result += first.charAt(i);
            }
            System.out.println(result);
        }
    }
}
