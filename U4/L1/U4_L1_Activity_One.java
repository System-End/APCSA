/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L1_Activity_One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter any numbers (Enter 5 to stop)");
        int num = scan.nextInt();

        while (num != 5) {
            sum += num;
            num = scan.nextInt();
        }

        System.out.println("Sum is " + sum);
    }
}
