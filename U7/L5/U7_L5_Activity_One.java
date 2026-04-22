public class U7_L5_Activity_One {

    public static void sortAndPrintReverse(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[maxPos]) > 0) {
                    maxPos = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
}
