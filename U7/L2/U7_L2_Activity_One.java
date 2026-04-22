import java.util.ArrayList;
import java.util.Scanner;

public class U7_L2_Activity_One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Please enter words, enter STOP to stop the loop.");

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            words.add(input);
            input = scanner.nextLine();
        }

        System.out.println(words);

        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i) + words.get(words.size() - 1 - i));
        }
    }
}
