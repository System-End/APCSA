/* Assignment 1 - Calculating Grades */
import java.util.Scanner;

class Assignment1
{
  public static void main(String[] args)
  {

     Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the course name.");
        String courseName = scanner.nextLine();

        System.out.println("Please enter the average time spent in a week for this course in minutes.");
        int totalMinutes = scanner.nextInt();

        System.out.println("Please enter the homework grades for this course.");
        int hw1 = scanner.nextInt();
        int hw2 = scanner.nextInt();
        int hw3 = scanner.nextInt();
        int hw4 = scanner.nextInt();

        System.out.println("Please enter the quiz grades for this course.");
        double quiz1 = scanner.nextDouble();
        double quiz2 = scanner.nextDouble();

        System.out.println("Please enter the final exam grade for this course.");
        double finalExam = scanner.nextDouble();

        double avgHomework = (hw1 + hw2 + hw3 + hw4) / 4.0;

        double avgQuiz = (quiz1 + quiz2) / 2.0;

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        double overallGradeDouble = (avgHomework * 0.35) + (avgQuiz * 0.15) + (finalExam * 0.50);

        int overallGrade = (int) Math.round(overallGradeDouble);

        System.out.println("Course name: " + courseName);
        System.out.println("Weekly time spent: " + hours + "h" + minutes);
        System.out.println("Average homework grade: " + avgHomework);
        System.out.println("Average quiz grade: " + avgQuiz);
        System.out.println("Final exam grade: " + finalExam);
        System.out.println("Overall grade: " + overallGrade);

  }
}
