public class SpecialityCoffee extends Coffee {

    private String flavor;

    // Default constructor: small, non-skinny, 1-shot latte with vanilla
    public SpecialityCoffee() {
        super("small", false, 1, "latte");
        flavor = "vanilla";
    }

    // Constructor with size, type, flavor - other values set to default
    public SpecialityCoffee(String size, String type, String flavor) {
        super(size, false, 1, type);
        this.flavor = flavor;
    }

    // Full constructor with all 5 attributes
    public SpecialityCoffee(
        String size,
        boolean isSkinny,
        int shots,
        String type,
        String flavor
    ) {
        super(size, isSkinny, shots, type);
        this.flavor = flavor;
    }

    // Appends "with <flavor>" to the Coffee toString
    public String toString() {
        return super.toString() + " with " + flavor;
    }
}
