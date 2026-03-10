import java.lang.Math;

public class code2 {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        // 5 random ints
        int a = (int) (Math.random() * (10 - 1 + 1) /* range size */ + 1);
        int b = (int) (Math.random() * (10 - 1 + 1) + 1);
        int c = (int) (Math.random() * (10 - 1 + 1) + 1);
        int d = (int) (Math.random() * (10 - 1 + 1) + 1);
        int e = (int) (Math.random() * (10 - 1 + 1) + 1);
        System.out.println(a + b + c + d + e);
        // create a array of ints
        int numlist[] = new int[5]; // declared new list and intialized with size of 5
        System.out.println(numlist); // prints memory
        int sum = 0;
        for (int i = 0; i < numlist.length; i++) {
            numlist[i] = (int) (Math.random() * (10) + 1);
            System.out.println(numlist[i]); // prints the list
            sum += numlist[i]; // adds each var to sum each time loop runs
        }
        System.out.println(sum);
        System.out.println(numlist.length); // lgnth is an attr not method
        // arrayss have one attr and no methods

        //arrays of strings
        // String names[] = new String[]; / array are static data type
        // dimesion missing
        String names[] = { "alice", "esther", "emma", "lily", "branden" }; //declaration, instationation, initialzation in one step
        System.out.println(names[1]);
        System.out.println(names[names.length - 1]); //last value/index in list
        // properly format names
        for (int i = 0; i < names.length; i++) {
            System.out.println(
                names[i].substring(0, 1).toUpperCase() +
                    names[i].substring(1).toLowerCase()
            );
        }

        //traverse backqrds and print names that are more than 3 letters long
        for (int i = names.length - 1; i >= 0; i--) {
            if (names[i].length() > 3) {
                System.out.println(names[i]);
            }
        }
        //traverse and print only names with letter "a" in it
        for (int i = 0; i < names.length; i++) {
            if (names[i].indexOf("a") >= 0) {
                System.out.println(names[i]);
            }
        }
        // for each loop is a simple loop just for traversal
        // access one element at a time in a temp placeholder
        for (String s : names) {
            System.out.println(s);
        }
    }
}
