/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;
import shapes.*;

public class U2_L6_Activity_One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        System.out.print("> ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println(
            "A circle with a radius of " +
                radius +
                " has a circumference of " +
                circle.getCircumference() +
                " and an area of " +
                circle.getArea()
        );
    }
}
