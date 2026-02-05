/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;

public class U2_L5_Activity_Two {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type a number for length and width:");
        double firstInput = input.nextDouble();
        System.out.println("Type a length:");
        double secondInput = input.nextDouble();
        System.out.println("Type a width:");
        double thirdInput = input.nextDouble();
        Rectangle rect1 = new Rectangle(firstInput, firstInput);
        Rectangle rect2 = new Rectangle(secondInput, thirdInput);
        System.out.println(rect1);
        System.out.println(rect2);
    }
}
