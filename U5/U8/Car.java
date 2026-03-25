public class Car {

    private static int nextID = 1;

    private int carID;
    private String make;
    private String model;
    private int year;
    private double mpg;

    public Car() {
        make = "None";
        model = "None";
        year = 2000;
        mpg = 0;
        carID = nextID;
        nextID++;
    }

    public Car(String make, String model, int year, double mpg) {
        this.make = make;
        this.model = model;

        if (year > 2022) {
            this.year = 2022;
        } else if (year < 1885) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (mpg < 0) {
            this.mpg = 0;
        } else {
            this.mpg = mpg;
        }

        carID = nextID;
        nextID++;
    }

    public String toString() {
        return (
            "ID: " +
            carID +
            "\nMake: " +
            make +
            "\nModel: " +
            model +
            "\nYear: " +
            year +
            "\nMPG: " +
            mpg
        );
    }
}
