/* Lesson 5 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L5_Activity_One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a String:");
        String input = scanner.nextLine();

        System.out.println("Input an integer:");
        int n = scanner.nextInt();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < n; j++) {
                result += input.charAt(i);
            }
        }

        System.out.println(result);
    }
}
