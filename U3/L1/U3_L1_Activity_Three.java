/* Lesson 1 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L1_Activity_Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two integers:");
        int x = scan.nextInt();
        int x1 = scan.nextInt();
        if (x * 2 == x1) {
            System.out.println("YES");
        }
    }
}
