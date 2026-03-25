public class U6_L5_Activity_Three {

    public static double avg(int[] arr) {
        double s = 0;
        for (int n : arr) {
            s += n;
        }
        return s / arr.length;
    }
}
