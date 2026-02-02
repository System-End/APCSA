/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input two decimal numbers:");
        double dec1 = scan.nextDouble();
        double dec2 = scan.nextDouble();
        int dec3 = (int) (dec1 + 0.5);
        int dec4 = (int) (dec2 + 0.5);
        int ans = (int) (dec3 + dec4);
        System.out.println("Answer: " + dec3 + " + " + dec4 + " = " + ans);
    }
}
