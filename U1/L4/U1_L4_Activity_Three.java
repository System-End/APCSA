/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a circumference:");
        double cir = scan.nextDouble();
        double rad = cir / (2 * 3.14);
        double area = 3.14 * rad * rad;
        System.out.println("Radius: " + rad + "\nArea: " + area);
    }
}
