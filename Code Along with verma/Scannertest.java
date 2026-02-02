import java.util.Scanner;

public class Scannertest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: "); // Getting int input
        int n = s.nextInt();
        System.out.println("integer " + n);
        System.out.print("Enter double: "); // Getting double input
        double d = s.nextDouble();
        System.out.println("double " + d);
    }
}
