/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L2_Activity_One
{
  public static void main(String[] args)
  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int i = a;
        while (i <= b) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
