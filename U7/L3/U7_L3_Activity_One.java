import java.util.ArrayList;

public class U7_L3_Activity_One {

    public static void shiftLeft(ArrayList<String> list) {
        String first = list.get(0);
        list.remove(0);
        list.add(first);
    }
}
