/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = scan.nextLine();
        System.out.println(
            "How many characters would you like to delete at the end?"
        );
        int del = scan.nextInt();
        System.out.println(word.substring(0, word.length() - del));
    }
}
