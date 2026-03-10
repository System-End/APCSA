/* Lesson 1 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L1_Activity_Four {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int x = scan.nextInt();
        if (x % 2 == 0 && x % 3 == 0) {
            System.out.println("Divisible by 2!\n Divisible by 3!");
        } else if (x % 2 == 0) {
            System.out.println("Divisible by 2!");
        } else if (x % 3 == 0) {
            System.out.println("Divisible by 3!");
        }
    }
}
