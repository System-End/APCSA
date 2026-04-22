import java.util.ArrayList;

public class U7_L5_Activity_Two {

    public static void selectSortReverse(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int maxPos = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > list.get(maxPos)) {
                    maxPos = j;
                }
            }

            int temp = list.get(i);
            list.set(i, list.get(maxPos));
            list.set(maxPos, temp);
        }
    }
}
