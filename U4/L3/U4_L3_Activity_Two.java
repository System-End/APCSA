/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L3_Activity_Two {

    public static void main(String[] args) {
        for (int i = 17; i <= 73; i++) {
            System.out.print(i);
            if (i == 73) {
                System.out.println();
            } else if ((i - 17) % 10 == 9) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
