// name of class MUST ALWAYS match file name
/* this is a multiline comment
comment contd etc etc
*/
/* public is an access modifier (public,private,protected)
public - anybody has access
private - only in that file
protected - class modifier & child can access
*/
// higlighted pink = keyword
import java.util.Scanner; // "." is an operator; fancy way of saying inside folder "java" there is folder "util" inside is a calss called "Scanner"

public class HelloWorld {

    // identifying "HelloWorld" is a publicclass and can be used in any folder
    // {} marks a block - open bracket always needs to have a closing bracket
    public static void main(String[] args) {
        // java starts here - always looks for "public static void"
        /* public means is main method and can be accessed in any folder
      static means it belongs to a class
      void means the method does not reutn anything. void is return type
      main is name of method
      inside the parentheses says the method
      [] are paramaters
      */
        // two forward slashes = single line comment
        // Prints "Hello, World" to the terminal window.
        // whatever is inside the () is outputted to console
        System.out.println("Hello, World"); // "println" prints and then creates a new line
        System.out.print("Hi Class"); // always needs to have a semicolon at end of cmd
        Scanner scan = new Scanner(System.in); // scan be anything
        System.out.println("Enter your name");
        String name = scan.nextLine(); // prompts user for input
        System.out.println("Hello " + name); // takes user input and appends it to string
        // polymorphism: taking multiple forms
        System.out.println(5 + 7);
        System.out.println("What do you want to do?");
        String todo = scan.nextLine();
        System.out.println("You want to do " + todo + " today, right?");
    }
}
