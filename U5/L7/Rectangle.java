public class Rectangle {

    private double base;
    private double height;

    public Rectangle() {
        base = 1;
        height = 1;
    }

    public Rectangle(double base, double height) {
        this.base = (base > 0) ? base : 1;
        this.height = (height > 0) ? height : 1;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getArea() {
        return base * height;
    }

    public double getPerimeter() {
        return 2 * base + 2 * height;
    }

    public double getDiagonal() {
        return Math.sqrt(base * base + height * height);
    }

    public boolean equals(Rectangle other) {
        return this.base == other.base && this.height == other.height;
    }

    @Override
    public String toString() {
        return "Rectangle[base=" + base + ",height=" + height + "]";
    }
}
