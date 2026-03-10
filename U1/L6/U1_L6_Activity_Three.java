/* Lesson 6 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a decimal number:");
        double dec = scan.nextDouble();
        dec *= 1000;
        int dec1 = (int) dec;
        System.out.println(
            "Answer: " +
                ((dec1 / 100) % 10) +
                " " +
                ((dec1 / 10) % 10) +
                " " +
                (dec1 % 10)
        );
    }
}
