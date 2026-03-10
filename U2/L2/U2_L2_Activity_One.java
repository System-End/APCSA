/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L2_Activity_One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What type of item are you buying?");
        String itemType = scan.nextLine();

        System.out.println("How many are you buying?");
        int numberOfItems = scan.nextInt();

        System.out.println("How much does each one weigh?");
        double weightPerItem = scan.nextDouble();

        System.out.println(
            numberOfItems +
                " " +
                itemType +
                " at " +
                weightPerItem +
                " pounds each will weigh " +
                (numberOfItems * weightPerItem) +
                " pounds total"
        );
    }
}
