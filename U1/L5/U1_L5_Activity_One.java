package U1.L5;

/* Unit 1 - Lesson 5 - Coding Activity Question 1 */

import java.util.Scanner;

class U1_L5_Activity_One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a three digit number:");
        int num = scan.nextInt();
        int num1 = num / 100;
        int num2 = (num / 10) % 10;
        int num3 = num % 10;
        System.out.println(num1 + "\n" + num2 + "\n" + num3);
    }
}
