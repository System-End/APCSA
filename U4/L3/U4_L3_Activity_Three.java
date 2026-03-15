/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L3_Activity_Three {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 50:");
        int num = scanner.nextInt();

        if (num <= 0 || num >= 50) {
            System.out.println("error");
        } else {
            for (int i = num; i <= 50; i++) {
                System.out.print(i);
                if (i == 50) {
                    System.out.println();
                } else if ((i - num) % 5 == 4) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
