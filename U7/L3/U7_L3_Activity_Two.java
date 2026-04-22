import java.util.ArrayList;

public class U7_L3_Activity_Two {

    public static void printStatistics(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        double average = (double) sum / list.size();

        int maxCount = 0;
        int mode = 0;
        boolean noSingleMode = false;

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = list.get(i);
                noSingleMode = false;
            } else if (count == maxCount && list.get(i) != mode) {
                noSingleMode = true;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        if (noSingleMode) {
            System.out.println("Mode: no single mode");
        } else {
            System.out.println("Mode: " + mode);
        }
    }
}
