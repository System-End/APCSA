public class U6_L2_Activity_Two {

    public static int numDivisibleBy3(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        return count;
    }
}
