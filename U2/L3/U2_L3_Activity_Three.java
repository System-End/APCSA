/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L3_Activity_Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String one = scan.nextLine().toLowerCase();
        System.out.println("Enter second word:");
        String two = scan.nextLine().toLowerCase();
        System.out.println("Result: " + one.compareTo(two));
    }
}
