public class U8_L1_Activity_One {

    public static int sumOfDiag(int[][] mat) {
        int sum = 0;
        // Stop when either dimension is exceeded (handles non-square arrays)
        for (int i = 0; i < mat.length && i < mat[0].length; i++) {
            sum += mat[i][i];
        }
        return sum;
    }
}
