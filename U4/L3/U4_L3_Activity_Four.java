/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U4_L3_Activity_Four {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("error");
        } else {
            int start = num - (num % 3);
            for (int i = start; i >= 0; i -= 3) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
