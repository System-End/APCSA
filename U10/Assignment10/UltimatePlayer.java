public class UltimatePlayer extends Person {

    private int jerseyNumber;
    private String position;
    private static int nextJersey = 1;

    public UltimatePlayer(String firstName, String lastName, String position) {
        super(firstName, lastName);
        if (
            position.equals("handler") || position.equals("cutter")
        ) this.position = position;
        else this.position = "handler";

        this.jerseyNumber = nextJersey;
        nextJersey++;
    }

    public String getPosition() {
        return position;
    }

    public int throwDisc(int pow) {
        if (pow < 1) pow = 1;
        if (pow > 10) pow = 10;
        return pow * 4;
    }

    public String toString() {
        return (
            super.toString() +
            "\n   Jersey #: " +
            jerseyNumber +
            "\n   Position: " +
            position
        );
    }
}
