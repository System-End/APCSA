/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;

public class U2_L6_Activity_Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of sides:");
        System.out.print("> ");
        int numSides = scanner.nextInt();

        System.out.println("Enter the side length:");
        System.out.print("> ");
        double sideLength = scanner.nextDouble();

        RegularPolygon polygon = new RegularPolygon(numSides, sideLength);

        System.out.println(
            "Area with " + numSides + " sides: " + polygon.getArea()
        );

        System.out.println("Incrementing the number of sides by two");
        polygon.addSides(2);

        System.out.println(
            "Area with " +
                polygon.getNumSides() +
                " sides: " +
                polygon.getArea()
        );
    }
}
