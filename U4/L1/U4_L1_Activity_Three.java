/* Lesson 1 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L1_Activity_Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word:");
        String word = scan.nextLine();
        String result = "";

        int i = 0;
        while (i + 1 < word.length()) {
            result += word.substring(i, i + 2);
            i += 3;
        }
        if (i < word.length()) {
            result += word.substring(i, i + 1);
        }

        System.out.println(result);
    }
}
