/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import assignment2.Airplane;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Airplane plane1 = new Airplane();

        Airplane plane2 = new Airplane("AAA02", 15.8, 128, 30000);

        Scanner scan = new Scanner(System.in);
        System.out.println(
            "Enter the details of the third airplane (call-sign, distance, bearing and altitude):"
        );

        String callsign = scan.nextLine();
        double distance = scan.nextDouble();
        int bearing = scan.nextInt();
        int altitude = scan.nextInt();

        callsign = callsign.toUpperCase();

        Airplane plane3 = new Airplane(callsign, distance, bearing, altitude);

        System.out.println();
        System.out.println("Initial Positions:");
        System.out.println("\"Airplane 1\": " + plane1.toString());
        System.out.println("\"Airplane 2\": " + plane2.toString());
        System.out.println("\"Airplane 3\": " + plane3.toString());

        System.out.println();
        System.out.println("Initial Distances:");
        double dist12 = plane1.distTo(plane2);
        double dist13 = plane1.distTo(plane3);
        double dist23 = plane2.distTo(plane3);

        System.out.println(
            "The distance between Airplane 1 and Airplane 2 is " +
                Math.round(dist12 * 100.0) / 100.0 +
                " miles."
        );
        System.out.println(
            "The distance between Airplane 1 and Airplane 3 is " +
                Math.round(dist13 * 100.0) / 100.0 +
                " miles."
        );
        System.out.println(
            "The distance between Airplane 2 and Airplane 3 is " +
                Math.round(dist23 * 100.0) / 100.0 +
                " miles."
        );

        System.out.println();
        System.out.println("Initial Height Differences:");
        int heightDiff12 = Math.abs(plane1.getAlt() - plane2.getAlt());
        int heightDiff13 = Math.abs(plane1.getAlt() - plane3.getAlt());
        int heightDiff23 = Math.abs(plane2.getAlt() - plane3.getAlt());

        System.out.println(
            "The difference in height between Airplane 1 and Airplane 2 is " +
                heightDiff12 +
                " feet."
        );
        System.out.println(
            "The difference in height between Airplane 1 and Airplane 3 is " +
                heightDiff13 +
                " feet."
        );
        System.out.println(
            "The difference in height between Airplane 2 and Airplane 3 is " +
                heightDiff23 +
                " feet."
        );

        plane1.gainAlt();
        plane1.gainAlt();
        plane1.gainAlt();

        plane2.loseAlt();
        plane2.loseAlt();

        plane3.loseAlt();
        plane3.loseAlt();
        plane3.loseAlt();
        plane3.loseAlt();

        plane1.move(dist23, 65);
        plane2.move(8.0, 135);
        plane3.move(5.0, 55);

        System.out.println();
        System.out.println("New Positions: ");
        System.out.println("\"Airplane 1\": " + plane1.toString());
        System.out.println("\"Airplane 2\": " + plane2.toString());
        System.out.println("\"Airplane 3\": " + plane3.toString());

        System.out.println();
        System.out.println("New Distances:");
        dist12 = plane1.distTo(plane2);
        dist13 = plane1.distTo(plane3);
        dist23 = plane2.distTo(plane3);

        System.out.println(
            "The distance between Airplane 1 and Airplane 2 is " +
                Math.round(dist12 * 100.0) / 100.0 +
                " miles."
        );
        System.out.println(
            "The distance between Airplane 1 and Airplane 3 is " +
                Math.round(dist13 * 100.0) / 100.0 +
                " miles."
        );
        System.out.println(
            "The distance between Airplane 2 and Airplane 3 is " +
                Math.round(dist23 * 100.0) / 100.0 +
                " miles."
        );

        System.out.println();
        System.out.println("New Height Differences:");
        heightDiff12 = Math.abs(plane1.getAlt() - plane2.getAlt());
        heightDiff13 = Math.abs(plane1.getAlt() - plane3.getAlt());
        heightDiff23 = Math.abs(plane2.getAlt() - plane3.getAlt());

        System.out.println(
            "The difference in height between Airplane 1 and Airplane 2 is " +
                heightDiff12 +
                " feet."
        );
        System.out.println(
            "The difference in height between Airplane 1 and Airplane 3 is " +
                heightDiff13 +
                " feet."
        );
        System.out.println(
            "The difference in height between Airplane 2 and Airplane 3 is " +
                heightDiff23 +
                " feet."
        );
    }
}
