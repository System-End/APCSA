/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L3_Activity_Four {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the temperature?");
        double temp = sc.nextDouble();

        if (temp >= 97 && temp <= 99) {
            System.out.println("Temperature is OK");
        } else {
            System.out.println("NOT NORMAL");
        }
    }
}
