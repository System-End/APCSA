import java.util.Scanner;

public class runner_U9_L1_Activity_One {

    public static void main(String[] args) {
        System.out.println("Enter positive integer:");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        U9_L1_Activity_One.printUpToEnd(i);
        System.out.println();
    }
}
