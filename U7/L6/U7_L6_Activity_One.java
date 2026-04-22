public class U7_L6_Activity_One {

    public static void sortAndPrintReverse(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Standard insertion sort, but reversed comparison for descending order
            String key = arr[i];
            int j = i - 1;

            // Move elements that are LESS than key one position ahead
            // (compareTo < 0 means arr[j] comes before key alphabetically,
            //  so in descending order, key should go before arr[j])
            while (j >= 0 && arr[j].compareTo(key) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            // Print array after each insertion
            for (int k = 0; k < arr.length; k++) {
                if (k < arr.length - 1) {
                    System.out.print(arr[k] + " ");
                } else {
                    System.out.print(arr[k]);
                }
            }
            System.out.println();
        }
    }
}
