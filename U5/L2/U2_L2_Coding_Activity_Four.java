/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four {

    public static void coinConverter(int pennies) {
        int dollars = pennies / 100;
        pennies = pennies % 100;

        int quarters = pennies / 25;
        pennies = pennies % 25;

        int dimes = pennies / 10;
        pennies = pennies % 10;

        int nickels = pennies / 5;
        pennies = pennies % 5;

        System.out.println("Dollar Bills: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }

    /* Add the method coinConverter() here */

    // You can uncomment and add to the main method to test your code
    // You will need to remove/comment out this method before checking your code for a score
    /*
  public static void main(String[] args){

  }
  */
}
