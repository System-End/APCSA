/* Lesson 8 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L8_Activity_Two {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first x-coordinate:");
        Double x1 = scan.nextDouble();
        System.out.println("Enter the second x-coordinate:");
        Double x2 = scan.nextDouble();
        System.out.println("Enter the first y-coordinate:");
        Double y1 = scan.nextDouble();
        System.out.println("Enter the second y-coordinate:");
        Double y2 = scan.nextDouble();
        Double slope = (y2 - y1) / (x2 - x1);
        System.out.println("Slope: " + slope);
    }
}
