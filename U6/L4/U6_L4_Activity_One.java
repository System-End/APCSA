public class U6_L4_Activity_One {

    public static String insert(String[] words, String newWord, int place) {
        if (place < 0 || place >= words.length) {
            return "you need a valid number";
        }

        for (int i = words.length - 1; i > place; i--) {
            words[i] = words[i - 1];
        }
        words[place] = newWord;

        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i];
        }
        return result;
    }
}
