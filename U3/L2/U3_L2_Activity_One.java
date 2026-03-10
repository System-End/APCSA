/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L2_Activity_One
{
  public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter five numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();

        double average = (a + b + c + d + e) / 5.0;

        if (average >= 89.95) {
            System.out.println("ABOVE AVERAGE");
        }
    }
}
