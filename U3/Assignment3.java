import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome. What is your name?");
        String name = scan.nextLine();

        System.out.println(
            "Hello " + name + ". Are you ready to crack the code?"
        );
        String ready = scan.nextLine();

        if (ready.equalsIgnoreCase("yes")) {
            System.out.println("\nPHASE 1");
            System.out.println("Enter a string:");
            String s = scan.nextLine();

            if (s.length() == 3) {
                System.out.println("Correct!");

                System.out.println("\nPHASE 2");
                System.out.println("Enter a number:");
                int n1 = scan.nextInt();

                if (n1 == 19 || (n1 >= 35 && n1 < 78)) {
                    System.out.println("Correct!");

                    System.out.println("\nPHASE 3");
                    System.out.println("Enter a number:");
                    int n2 = scan.nextInt();

                    if (n2 > 0 && (n2 % 2 == 0 || n2 % 10 == 1)) {
                        System.out.println("Correct!");
                        System.out.println("You have cracked the code!");
                    } else {
                        System.out.println("Sorry, that was incorrect!");
                        System.out.println("Better luck next time!");
                    }
                } else {
                    System.out.println("Sorry, that was incorrect!");
                    System.out.println("Better luck next time!");
                }
            } else {
                System.out.println("Sorry, that was incorrect!");
                System.out.println("Better luck next time!");
            }
        }
    }
}
