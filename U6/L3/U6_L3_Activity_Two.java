public class U6_L3_Activity_Two {

    public static void removeVowels(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String result = "";
            for (int j = 0; j < words[i].length(); j++) {
                String letter = words[i].substring(j, j + 1);
                if (
                    !letter.equals("a") &&
                    !letter.equals("e") &&
                    !letter.equals("i") &&
                    !letter.equals("o") &&
                    !letter.equals("u")
                ) {
                    result += letter;
                }
            }
            System.out.println(result);
        }
    }
}
