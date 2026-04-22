import java.util.ArrayList;

public class GameWheel {

    private ArrayList<Slice> slices;
    private int currentPos;

    // Returns a string with each numbered slice on a new line
    public String toString() {
        String result = "";
        for (int i = 0; i < slices.size(); i++) {
            result += i + " - " + slices.get(i).toString() + "\n";
        }
        return result;
    }

    // Helper: extracts all slices of a given color into a new ArrayList
    private ArrayList<Slice> getByColor(String color) {
        ArrayList<Slice> colorList = new ArrayList<Slice>();
        for (Slice s : slices) {
            if (s.getColor().equals(color)) {
                colorList.add(s);
            }
        }
        return colorList;
    }

    // Helper: shuffles an ArrayList of Slices in place (Fisher-Yates)
    private void shuffleList(ArrayList<Slice> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Slice temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    // Helper: sorts an ArrayList of Slices by prize amount (insertion sort)
    private void sortList(ArrayList<Slice> list) {
        for (int i = 1; i < list.size(); i++) {
            Slice key = list.get(i);
            int j = i - 1;
            while (
                j >= 0 && list.get(j).getPrizeAmount() > key.getPrizeAmount()
            ) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    /* Helper: rebuilds slices from separate color lists, preserving the
     * color pattern (black at multiples of 5, red at odd, blue at even)
     */
    private void rebuildWheel(
        ArrayList<Slice> blacks,
        ArrayList<Slice> reds,
        ArrayList<Slice> blues
    ) {
        int blackIdx = 0,
            redIdx = 0,
            blueIdx = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {
                slices.set(i, blacks.get(blackIdx++));
            } else if (i % 2 == 1) {
                slices.set(i, reds.get(redIdx++));
            } else {
                slices.set(i, blues.get(blueIdx++));
            }
        }
    }

    // Randomizes slice positions without changing the color pattern
    public void scramble() {
        ArrayList<Slice> blacks = getByColor("black");
        ArrayList<Slice> reds = getByColor("red");
        ArrayList<Slice> blues = getByColor("blue");

        shuffleList(blacks);
        shuffleList(reds);
        shuffleList(blues);

        rebuildWheel(blacks, reds, blues);
    }

    // Sorts slices by prize amount within each color group
    public void sort() {
        ArrayList<Slice> blacks = getByColor("black");
        ArrayList<Slice> reds = getByColor("red");
        ArrayList<Slice> blues = getByColor("blue");

        sortList(blacks);
        sortList(reds);
        sortList(blues);

        rebuildWheel(blacks, reds, blues);
    }

    /* COMPLETED METHODS - YOU DO NOT NEED TO CHANGE THESE */
    public GameWheel() {
        this(getStandardPrizes());
    }

    public GameWheel(int[] prizes) {
        currentPos = 0;
        slices = new ArrayList<Slice>();
        for (int i = 0; i < 20; i++) {
            int pa = 0;
            String col = "blue";
            if (i < prizes.length) pa = prizes[i];
            if (i % 5 == 0) col = "black";
            else if (i % 2 == 1) col = "red";
            slices.add(new Slice(col, pa));
        }
    }

    public Slice spinWheel() {
        int power = (int) (Math.random() * 50 + 1);
        int newPos = (currentPos + power) % slices.size();
        currentPos = newPos;
        return slices.get(currentPos);
    }

    public Slice getSlice(int i) {
        int sliceNum = i;
        if (i < 0 || i > 19) sliceNum = 0;
        return slices.get(sliceNum);
    }

    private static int[] getStandardPrizes() {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) arr[i] = i * 1000;
            else if (i % 2 == 1) arr[i] = i * 100;
            else arr[i] = i * 200;
        }
        return arr;
    }
}
