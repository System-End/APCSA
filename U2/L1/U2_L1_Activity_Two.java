/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L1_Activity_Two {

    public static void main(String[] args) {
        String order = "apple pie";

        System.out.println("The current order is " + order);

        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "I want to eat something else, what do you want to eat?"
        );
        order = scanner.nextLine();

        System.out.println("The order has changed to " + order);
    }
}
