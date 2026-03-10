/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L3_Activity_One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
