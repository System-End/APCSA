/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L4_Activity_Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 0 && b >= 0 && a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both are positive and even.");
        } else {
            System.out.println("At least one is negative or odd.");
        }
    }
}
