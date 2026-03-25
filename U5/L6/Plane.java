public class Plane {

    private int location;

    public Plane() {
        location = 0;
    }

    public Plane(int loc) {
        if (loc >= -2000 && loc <= 2000) {
            location = loc;
        } else {
            location = 0;
        }
    }

    public void upward() {
        if (location + 100 > 2000) {
            location = 2000;
        } else {
            location += 100;
        }
    }

    public void downward() {
        if (location - 100 < -2000) {
            location = -2000;
        } else {
            location -= 100;
        }
    }

    public int getLocation() {
        return location;
    }

    public String toString() {
        int spaces = (location + 2000) / 100;
        String result = "";
        for (int i = 0; i < spaces; i++) {
            result += " ";
        }
        result += "@";
        return result;
    }
}
