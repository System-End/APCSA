/* Lesson 7 Coding Activity Question 3 */

import java.util.Scanner;
import shapes.*;

public class U3_L7_Activity_Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(
            "Enter the side length of the first regular polygon:"
        );
        double len1 = scan.nextDouble();
        RegularPolygon poly1 = new RegularPolygon(len1);

        System.out.println("Enter the number of sides of the second polygon:");
        int sides2 = scan.nextInt();
        System.out.println("Enter the side length of the second polygon:");
        double len2 = scan.nextDouble();
        RegularPolygon poly2 = new RegularPolygon(sides2, len2);

        if (poly1.equals(poly2)) {
            System.out.println("Congruent Regular Polygons!");
        } else {
            System.out.println("Different Regular Polygons");
        }
    }
}
