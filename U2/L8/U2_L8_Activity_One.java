/* Lesson 8 Coding Activity Question 1 */

import java.util.Scanner;
import testing.Math;

public class U2_L8_Activity_One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int rn = scan.nextInt();
        System.out.println((int) (Math.random() * (rn + 1)) + 2);
        System.out.println((int) (Math.random() * (rn + 1)) + 2);
        System.out.println((int) (Math.random() * (rn + 1)) + 2);

        scan.close();
    }
}
