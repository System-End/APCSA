/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;
import shapes.*;
import testing.Math;

public class U5_L3_Activity_Two {

    /* Add the method randomize here */
    public static void randomize(Rectangle r) {
        int length = (int) (Math.random() * 6) * 2 + 10;
        int width = (int) (Math.random() * 4) * 2 + 7;
        r.setLength(length);
        r.setWidth(width);
    }

    // You can uncomment and add to the main method to test your code
    // You will need to remove/comment out this method before submitting your code
    /*
  public static void main(String[] args){

  }
  */
}
