/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U1_L3_Activity_Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
            "Java is an object-oriented programming language, true or false?"
        );
        boolean q1 = scan.nextBoolean();
        System.out.println(
            "There are only 2 possible values which can be held by a boolean variable, true or false?"
        );
        boolean q2 = scan.nextBoolean();
        System.out.println(
            "\nQuestion 1 - Your answer: " + q1 + ". Correct answer: true"
        );
        System.out.println(
            "Question 2 - Your answer: " + q2 + ". Correct answer: true"
        );
    }
}
