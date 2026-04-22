import java.util.ArrayList;

public class Game {

    public static void play(GameWheel wheel) {
        Slice spin1 = wheel.spinWheel();
        Slice spin2 = wheel.spinWheel();
        Slice spin3 = wheel.spinWheel();

        int total =
            spin1.getPrizeAmount() +
            spin2.getPrizeAmount() +
            spin3.getPrizeAmount();

        boolean tripleColor =
            spin1.getColor().equals(spin2.getColor()) &&
            spin2.getColor().equals(spin3.getColor());
        if (tripleColor) {
            total *= 2;
        }

        System.out.println("Total prize money: $" + total);
        System.out.println();
        System.out.println("Spin 1 - " + spin1.toString());
        System.out.println("Spin 2 - " + spin2.toString());
        System.out.println("Spin 3 - " + spin3.toString());

        if (tripleColor) {
            // Capitalize first letter for the message
            String color = spin1.getColor();
            String colorCap =
                color.substring(0, 1).toUpperCase() + color.substring(1);
            System.out.println("Three " + color + "s = double your money!");
        }
    }
}
