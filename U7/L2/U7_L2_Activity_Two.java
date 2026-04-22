import java.util.ArrayList;

public class U7_L2_Activity_Two {

    public static int highestNum(ArrayList<Integer> list) {
        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }
}
