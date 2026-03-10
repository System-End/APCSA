/* Write a class WordCheck that is supposed to check if words that are valid. A word is considered valid if it’s within the max and min limit range, and does not contain a certain string.
Constructor that accepts 3 parameters, max and min length of a valid word, and a String that isn’t allowed in the words.
Constructor that accepts 1 String parameter that isn’t allowed in the word; min and max lengths are defaulted to 5 and 12 in this case.
Method isValid that accepts a String word and returns true if word is valid, false otherwise.
An accessor method getValidCount that returns the number of valid words checked so far.
Accessors and Mutators for max, min, String not allowed
Example of class runs:
WordCheck W1 = new WordCheck(4, 8, “$”);
W1.isValid(“Hi”); //returns false as word is too short
W1.isValid(“Hello”); //returns true as word is valid
W1.isValid(“Hibernate”); //returns false as word is too long
W1.isValid(“$Bills”); //returns false as word contains “$”
W1.isValid(“Monday”); //returns true as word is valid
W1.getValidCount(); //return 2 for two valid words so far
WordCheck W2 = new WordCheck(“Meep”); //any words with length 5-12 and no occurrence of “Meep” will be valid for W2
*/
class WordCheck {

    // instance var
    private int max;
    private int min;
    private String NA;
    private int validCount; // could be set to zero here instead of line 29
    // create word checker tracking var that tracks # of word checkers made
    public static int wordCheckCount = 0;

    // first constructor
    public WordCheck(int min, int max, String NA) {
        this.max = max;
        this.min = min;
        this.NA = NA;
        // this keyword point to copy of var, used for distingugh between params
        this.validCount = 0;
        wordCheckCount++;
    }

    public WordCheck(String NA) {
        // one option
        // this.min = 5;
        // this.max = 12;
        // this.NA = NA;
        //  easier option
        this(5, 12, NA);
    }

    public boolean isValid(String word) {
        if (
            word.length() >= min &&
            word.length() <= max &&
            word.indexOf(NA) == -1 /* can also use !word.contains(NA) */
        ) {
            validCount++;
            return true;
        }
        return false;
    }

    // accessors & mutators, fancy way fo saying getters & setters
    public int getMax() {
        return this.max;
    }

    public void setMax(int m) {
        this.max = m;
    }

    public int getMin() {
        return this.min;
    }

    public void setMin(int m) {
        if (this.max > m) {
            this.min = m;
        }
    }

    public String getNA() {
        return this.NA;
    }

    public void setNA(String no) {
        this.NA = no;
    }

    public int getValidCount() {
        return this.validCount;
    }
}

public class check {

    public static void main(String args[]) {
        WordCheck W1 = new WordCheck(4, 8, "$");
        System.out.println(W1.isValid("Hi")); //returns false as word is too short
        System.out.println(W1.isValid("Hello")); //returns true as word is valid
        System.out.println(W1.isValid("Hibernate")); //returns false as word is too long
        System.out.println(W1.isValid("$Bills")); //returns false as word contains “$”
        System.out.println(W1.isValid("Monday")); //returns true as word is valid
        System.out.println(W1.getValidCount()); //return 2 for two valid words so far
        WordCheck W2 = new WordCheck("Meep"); //any words with length 5-12 and no occurrence of “Meep” will be valid for W2

        WordCheck W3 = new WordCheck(2, 12, "$");
        System.out.println(W3.isValid("Meow"));
        System.out.println(W3.isValid("$3"));
        System.out.println(W3.isValid("Cats meow"));
        System.out.println(W3.isValid("Dogs bark"));
        System.out.println(W3.getValidCount());
        WordCheck W4 = new WordCheck("meow");
        System.out.println(WordCheck.wordCheckCount);
    }
}
