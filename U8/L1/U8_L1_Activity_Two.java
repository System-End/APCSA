public class U8_L1_Activity_Two {

    public static int[][] productTable(int rows, int cols) {
        int[][] table = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                table[r][c] = r * c;
            }
        }
        return table;
    }
}
