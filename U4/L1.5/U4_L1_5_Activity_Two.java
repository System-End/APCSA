/* Lesson 1 1/2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_5_Activity_Two {

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " positive integers: " + sum);
    }
}
