/* Unit 1 - Lesson 5 - Coding Activity Question 2 */

import java.util.Scanner;

class U1_L5_Activity_Two {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a four digit number:");
        int num = scan.nextInt();
        System.out.println(num % 10);
        num /= 10;
        System.out.println(num % 10);
        num /= 10;
        System.out.println(num % 10);
        num /= 10;
        System.out.println(num);
    }
}
