import java.util.ArrayList;
import java.util.Scanner;

public class U7_L1_Activity_One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Please enter words, enter STOP to stop the loop.");

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            words.add(input);
            input = scanner.nextLine();
        }

        System.out.println(words.size());
        System.out.println(words);

        if (words.size() > 2) {
            String first = words.get(0);
            words.set(words.size() - 1, first);
            words.remove(0);
        }

        System.out.println(words);
    }
}
