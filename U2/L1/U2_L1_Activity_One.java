/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L1_Activity_One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your favorite number?");
        int favoriteNumber = scanner.nextInt();

        System.out.println(
            "Your name is " +
                name +
                " and you like the number " +
                favoriteNumber +
                "."
        );
    }
}
