/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L6_Activity_One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the numerator:");
        int num = scan.nextInt();
        System.out.println("Please enter the denominator:");
        int den = scan.nextInt();
        Double fra = (double) num / den;
        System.out.println("The decimal value is: " + fra);
    }
}
