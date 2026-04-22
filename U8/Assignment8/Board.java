public class Board {

    private String[][] squares;

    public Board() {
        squares = new String[10][10];
        for (int r = 0; r < squares.length; r++) for (
            int c = 0;
            c < squares[r].length;
            c++
        ) squares[r][c] = "-";
    }

    public String toString() {
        String result = "";
        for (int r = 0; r < squares.length; r++) {
            for (int c = 0; c < squares[r].length; c++) {
                result += squares[r][c];
                if (c < squares[r].length - 1) result += " ";
            }
            result += "\n";
        }
        return result;
    }

    public boolean addShip(int row, int col, int len, boolean horizontal) {
        if (horizontal) {
            // Check all bounds carefully
            if (
                row < 0 || row > 9 || col < 0 || col > 9 || col + len > 10
            ) return false;

            // Check for existing ships
            for (int c = col; c < col + len; c++) if (
                squares[row][c].equals("b")
            ) return false;

            // Place the ship
            for (int c = col; c < col + len; c++) squares[row][c] = "b";
        } else {
            // Check all bounds carefully
            if (
                col < 0 || col > 9 || row < 0 || row > 9 || row + len > 10
            ) return false;

            // Check for existing ships
            for (int r = row; r < row + len; r++) if (
                squares[r][col].equals("b")
            ) return false;

            // Place the ship
            for (int r = row; r < row + len; r++) squares[r][col] = "b";
        }
        return true;
    }

    public boolean foundShip(int len) {
        // Check horizontally
        for (int r = 0; r < 10; r++) {
            int count = 0;
            for (int c = 0; c < 10; c++) {
                if (squares[r][c].equals("b")) {
                    count++;
                    if (count == len) {
                        boolean beforeOk =
                            (c - len < 0) || !squares[r][c - len].equals("b");
                        boolean afterOk =
                            (c + 1 >= 10) || !squares[r][c + 1].equals("b");
                        if (beforeOk && afterOk) return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // Check vertically
        for (int c = 0; c < 10; c++) {
            int count = 0;
            for (int r = 0; r < 10; r++) {
                if (squares[r][c].equals("b")) {
                    count++;
                    if (count == len) {
                        boolean beforeOk =
                            (r - len < 0) || !squares[r - len][c].equals("b");
                        boolean afterOk =
                            (r + 1 >= 10) || !squares[r + 1][c].equals("b");
                        if (beforeOk && afterOk) return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        return false;
    }

    public int shoot(int row, int col) {
        if (row < 0 || row > 9 || col < 0 || col > 9) return -1;

        if (squares[row][col].equals("-")) {
            squares[row][col] = "m";
            return 0;
        } else if (squares[row][col].equals("b")) {
            squares[row][col] = "x";
            return 1;
        } else {
            return 2;
        }
    }

    public boolean gameOver() {
        for (int r = 0; r < squares.length; r++) for (
            int c = 0;
            c < squares[r].length;
            c++
        ) if (squares[r][c].equals("b")) return false;
        return true;
    }
}
