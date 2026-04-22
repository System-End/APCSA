public class DoubleCone extends Cone {

    private String flavor2;
    private String topping;

    // Both scoops same flavor
    public DoubleCone(String f, boolean w) {
        super(f, w);
        flavor2 = f;
        topping = "";
    }

    // Two different flavors
    public DoubleCone(String f1, String f2, boolean w) {
        super(f1, w);
        flavor2 = f2;
        topping = "";
    }

    // Sets both scoops to same flavor
    public void setFlavor(String f) {
        super.setFlavor(f);
        flavor2 = f;
    }

    // Sets each scoop independently
    public void setFlavor(String f1, String f2) {
        super.setFlavor(f1);
        flavor2 = f2;
    }

    // Sets the topping
    public void addTopping(String t) {
        topping = t;
    }

    public String toString() {
        // Build "double waffle cone" or "double cone"
        String base = "double ";
        if (getWaffle()) base += "waffle cone with ";
        else base += "cone with ";

        // Build flavor part
        String flavorPart;
        if (getFlavor().equals(flavor2)) flavorPart = getFlavor() + " x2";
        else flavorPart = getFlavor() + " and " + flavor2;

        // Build topping part
        String toppingPart = "";
        if (!topping.equals("")) toppingPart = " with " + topping;

        return base + flavorPart + toppingPart;
    }
}
