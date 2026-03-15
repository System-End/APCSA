/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L2_Activity_Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = scanner.nextInt();

        int place = 1;
        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit * place);
            place *= 10;
            n /= 10;
        }
    }
}
