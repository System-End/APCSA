/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String item = scan.nextLine();
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        System.out.println(
            item.substring(0, n) + item.substring(item.length() - n)
        );
    }
}
