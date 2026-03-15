/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L2_Activity_Three {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxLat = -90;
        double minLat = 90;
        double maxLon = -180;
        double minLon = 180;

        int continueInput = 1;

        while (continueInput == 1) {
            System.out.println("Please enter the longitude:");
            double lon = scanner.nextDouble();

            System.out.println("Please enter the latitude:");
            double lat = scanner.nextDouble();

            if (lat < -90 || lat > 90 || lon < -180 || lon > 180) {
                System.out.println("Incorrect Latitude or Longitude");
            } else {
                if (lat > maxLat) maxLat = lat;
                if (lat < minLat) minLat = lat;
                if (lon > maxLon) maxLon = lon;
                if (lon < minLon) minLon = lon;
            }

            System.out.println("Would you like to enter another location?");
            continueInput = scanner.nextInt();
        }

        System.out.println("Farthest North: " + maxLat);
        System.out.println("Farthest South: " + minLat);
        System.out.println("Farthest East: " + maxLon);
        System.out.println("Farthest West: " + minLon);

        scanner.close();
    }
}
