import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class U8_L3_Activity_One {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("tests.txt"));

        String highName = "";
        String lowName = "";
        int highGrade = Integer.MIN_VALUE;
        int lowGrade = Integer.MAX_VALUE;
        double total = 0;
        int count = 0;

        while (scan.hasNextLine()) {
            String line = scan.nextLine().trim();

            // Skip blank lines
            if (line.length() == 0) continue;

            // Split on whitespace: ["Liam", "Smith", "85"]
            String[] parts = line.split(" ");

            String name = parts[0] + " " + parts[1];
            int grade = Integer.parseInt(parts[2]);

            if (grade > highGrade) {
                highGrade = grade;
                highName = name;
            }
            if (grade < lowGrade) {
                lowGrade = grade;
                lowName = name;
            }

            total += grade;
            count++;
        }

        scan.close();

        System.out.println(
            "The highest grade is: " + highGrade + " by " + highName
        );
        System.out.println(
            "The lowest grade is: " + lowGrade + " by " + lowName
        );
        System.out.println("The average grade is: " + (total / count));
    }
}
