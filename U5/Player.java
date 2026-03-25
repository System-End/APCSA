public class Player {

    private static int numPlayers = 0;

    private int x;
    private int y;
    private int z;
    private int direction;
    private int hp;
    private String name;

    public Player() {
        numPlayers++;
        this.name = "P" + numPlayers;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.hp = 20;
        this.direction = 1;
    }

    public Player(String name, int x, int y, int z) {
        numPlayers++;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.hp = 20;
        this.direction = 1;
    }

    public Player(String name, int x, int y, int z, int health, int direction) {
        numPlayers++;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.hp = (health < 0) ? 0 : health;
        this.direction = (direction < 1 || direction > 6) ? 1 : direction;
    }

    public static int getNumPlayers() {
        return numPlayers;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getHp() {
        return hp;
    }

    public int getDirection() {
        return direction;
    }

    public String toString() {
        return (
            "Name: " +
            name +
            "\n" +
            "Health: " +
            hp +
            "\n" +
            "Coordinates: X " +
            x +
            " Y " +
            y +
            " Z " +
            z +
            "\n" +
            "Direction: " +
            direction
        );
    }

    public void setHp(int hp) {
        this.hp = (hp < 0) ? 0 : hp;
    }

    public void setDirection(int direction) {
        if (direction >= 1 && direction <= 6) {
            this.direction = direction;
        }
    }

    public void move(int direction, int units) {
        switch (direction) {
            case 1:
                x += units;
                break;
            case 2:
                x -= units;
                break;
            case 3:
                y += units;
                break;
            case 4:
                y -= units;
                break;
            case 5:
                z += units;
                break;
            case 6:
                z -= units;
                break;
        }
    }

    public void teleport(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void teleport(Player player) {
        this.x = player.getX();
        this.y = player.getY();
        this.z = player.getZ();
    }

    public void attack(Player player, int damage) {
        player.setHp(player.getHp() - damage);
        this.hp += damage / 2;
    }

    public double getDistance(int x, int y, int z) {
        int dx = this.x - x;
        int dy = this.y - y;
        int dz = this.z - z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double getDistance(Player player) {
        return getDistance(player.getX(), player.getY(), player.getZ());
    }
}
