public class U9_L2_Activity_One {

    public static String stringReverse(String word) {
        // Base case: empty string or single character, nothing to reverse
        if (word.length() <= 1) {
            return word;
        }
        // Take the first character, move it to the end, recurse on the rest
        return stringReverse(word.substring(1)) + word.charAt(0);
    }
}
