/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L2_Activity_One {

    public static void main(String[] args) {
        Scanner food = new Scanner(System.in);
        System.out.println("What is your favorite food?");
        String foodlike = food.nextLine();
        System.out.println("I like to eat " + foodlike + " as well!");
    }
}
