/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L2_Activity_Two
{
  public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Smallest is: " + Math.min(a, b));
    }
}