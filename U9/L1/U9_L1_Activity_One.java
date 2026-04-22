public class U9_L1_Activity_One {

    public static void printUpToEnd(int n) {
        // Base case: if n <= 0, stop (never print 0 or negatives)
        if (n <= 0) return;

        // Recurse first so we print smallest matching number first
        printUpToEnd(n - 10);

        // Print on the way back up
        System.out.print(n + " ");
    }
}
