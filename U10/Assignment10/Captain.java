public class Captain extends UltimatePlayer {

    private boolean type; // true = offense, false = defense

    public Captain(
        String firstName,
        String lastName,
        String position,
        boolean type
    ) {
        super(firstName, lastName, position);
        this.type = type;
    }

    public int throwDisc(int pow) {
        if (pow < 1) pow = 1;
        if (pow > 10) pow = 10;
        return pow * 5;
    }

    public String toString() {
        String captainType = type ? "offense" : "defense";
        return super.toString() + "\n   Captain: " + captainType;
    }
}
