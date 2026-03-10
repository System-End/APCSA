/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L3_Activity_Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two integers:");
        System.out.print("> ");
        int a = sc.nextInt();
        System.out.print("> ");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = ?");
        System.out.print("> ");
        int answer = sc.nextInt();

        if (answer == a + b) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong");
        }
    }
}
