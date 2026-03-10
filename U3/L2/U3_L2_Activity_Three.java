/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L2_Activity_Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the temperature?");
        double temp = sc.nextDouble();

        if (temp < 97 || temp > 99) {
            System.out.println("NOT NORMAL");
        }
    }
}
