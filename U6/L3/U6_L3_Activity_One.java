public class U6_L3_Activity_One {

    public static String findShortest(String[] words) {
        String shortest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }
        return shortest;
    }
}
