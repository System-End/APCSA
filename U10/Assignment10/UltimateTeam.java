// Don't forget, you will need to import the ArrayList class to implement the UltimateTeam class
import java.util.ArrayList;

public class UltimateTeam {

    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    public UltimateTeam(
        ArrayList<UltimatePlayer> players,
        ArrayList<Coach> coaches
    ) {
        this.players = players;
        this.coaches = coaches;
    }

    public String getCutters() {
        String result = "";
        for (UltimatePlayer p : players)
            if (p.getPosition().equals("cutter")) result += p.toString() + "\n";
        return result;
    }

    public String getHandlers() {
        String result = "";
        for (UltimatePlayer p : players)
            if (p.getPosition().equals("handler")) result +=
                p.toString() + "\n";
        return result;
    }

    public String toString() {
        String result = "COACHES\n";
        for (Coach c : coaches) result += c.toString() + "\n";

        result += "\nPLAYERS\n";
        for (UltimatePlayer p : players) result += p.toString() + "\n";

        return result;
    }
}
