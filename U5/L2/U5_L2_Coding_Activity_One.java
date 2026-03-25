/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U5_L2_Activity_One {

    public static void timeOfDay(int hour) {
        switch (hour) {
            case 0:
                System.out.println("midnight");
                break;
            case 12:
                System.out.println("noon");
                break;
            case 18:
                System.out.println("dusk");
                break;
            default:
                if (hour < 12) {
                    System.out.println("morning");
                } else if (hour < 18) {
                    System.out.println("afternoon");
                } else {
                    System.out.println("evening");
                }
        }
    }
    /* Add the method timeOfDay() here */

    // You can uncomment and add to the main method to test your code
    // You will need to remove/comment out this method before checking your code for a score
    /*
  public static void main(String[] args){

  }
  */
}
