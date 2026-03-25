/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L4_Activity_Four {

    public static int substringCount(String str, String sub) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }

    // You can uncomment and add to the main method to test your code
    // You will need to remove/comment out this method before checking your code for a score
    /*
  public static void main(String[] args){

  }
  */
}
