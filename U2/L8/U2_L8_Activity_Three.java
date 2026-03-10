/* Lesson 8 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L8_Activity_Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two doubles:");
        Double d1 = scan.nextDouble();
        Double d2 = scan.nextDouble();
        System.out.println("Difference: " + Math.abs(Math.round(d1 - d2)));
    }
}
