/* Lesson 1 1/2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_5_Activity_Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
