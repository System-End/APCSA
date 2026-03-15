import java.util.Scanner;

class Assignment4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the message to be shortened");
        String message = scanner.nextLine();
        message = message.toLowerCase();

        int vowelsRemoved = 0;
        int repeatsRemoved = 0;
        String alg1 = "";
        String vowels = "aeiou";

        for (int i = 0; i < message.length(); i++) {
            String c = message.substring(i, i + 1);
            boolean isVowel = vowels.contains(c);
            boolean isAtStartOfWord =
                (i == 0) || message.substring(i - 1, i).equals(" ");

            if (isVowel && !isAtStartOfWord) {
                vowelsRemoved++;
            } else if (
                !isVowel &&
                i > 0 &&
                !c.equals(" ") &&
                c.equals(message.substring(i - 1, i))
            ) {
                repeatsRemoved++;
            } else {
                alg1 += c;
            }
        }

        System.out.println("\nAlgorithm 1");
        System.out.println("Vowels removed: " + vowelsRemoved);
        System.out.println("Repeats removed: " + repeatsRemoved);
        System.out.println("Algorithm 1 message: " + alg1);
        System.out.println(
            "Algorithm 1 characters saved: " +
                (message.length() - alg1.length())
        );

        String alg2 = "";
        int uniqueChars = 0;

        for (int i = 0; i < message.length(); i++) {
            String c = message.substring(i, i + 1);
            if (c.equals(" ")) continue;

            boolean alreadySeen = false;
            for (int j = 0; j < i; j++) {
                if (c.equals(message.substring(j, j + 1))) {
                    alreadySeen = true;
                    break;
                }
            }

            if (!alreadySeen) {
                uniqueChars++;
                int count = 0;
                for (int k = 0; k < message.length(); k++) {
                    if (c.equals(message.substring(k, k + 1))) count++;
                }
                alg2 += count + c;
            }
        }

        System.out.println("\nAlgorithm 2");
        System.out.println("Unique characters found: " + uniqueChars);
        System.out.println("Algorithm 2 message: " + alg2);
        System.out.println(
            "Algorithm 2 characters saved: " +
                (message.length() - alg2.length())
        );
    }
}
