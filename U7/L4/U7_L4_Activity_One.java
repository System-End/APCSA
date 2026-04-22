import java.util.ArrayList;

public class U7_L4_Activity_One {

    public static int countSecondInitial(
        ArrayList<String> list,
        String letter
    ) {
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            if (word.length() >= 2) {
                String secondChar = word.substring(1, 2);
                if (secondChar.equalsIgnoreCase(letter)) {
                    count++;
                }
            }
        }

        return count;
    }
}
