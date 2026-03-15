/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_Activity_Two {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        System.out.println("Enter the Scores:");
        int score = scan.nextInt();

        while (score != -1) {
            if (score > largest) {
                largest = score;
            }
            score = scan.nextInt();
        }

        System.out.println("\nThe largest score is " + largest);
    }
}
