public static int insertSort(ArrayList<Integer> list) {
    int count = 0;

    for (int i = 1; i < list.size(); i++) {
        int key = list.get(i);
        int j = i - 1;

        while (j >= 0 && list.get(j) > key) {
            list.set(j + 1, list.get(j));
            j--;
            count++;
        }

        // If j >= 0, the while loop exited because list.get(j) <= key
        // That comparison happened but wasn't counted in the loop, so add 1
        // If j < 0, we slid off the front — no final comparison occurred
        if (j >= 0) {
            count++;
        }

        list.set(j + 1, key);
    }

    return count;
}
