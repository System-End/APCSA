/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L4_Activity_Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the latitude:");
        double lat = sc.nextDouble();
        System.out.println("Please enter the longitude:");
        double lon = sc.nextDouble();

        boolean latValid = lat >= -90 && lat <= 90;
        boolean lonValid = lon >= -180 && lon <= 180;

        if (!latValid) {
            System.out.println("latitude is incorrect");
        }
        if (!lonValid) {
            System.out.println("longitude is incorrect");
        }
        if (latValid && lonValid) {
            System.out.println("The location: " + lat + ", " + lon);
        }
    }
}
