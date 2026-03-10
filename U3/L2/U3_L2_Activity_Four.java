/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L2_Activity_Four {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two test scores:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a < 0 || a > 100) {
            System.out.println("Not Valid");
        }
        if (b < 0 || b > 100) {
            System.out.println("Not Valid");
        }
    }
}
