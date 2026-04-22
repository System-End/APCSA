import java.util.ArrayList;
import java.util.Scanner;

public class runner_U7_L2_Activity_Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println("Enter ArrayList length:");
        int len = scan.nextInt();
        System.out.println("Enter values:");
        for (int i = 0; i < len; i++) {
            nums.add(scan.nextInt());
        }
        System.out.println(
            "Evens list: " + U7_L2_Activity_Three.getEvens(nums)
        );
        System.out.println("Original list: " + nums);
    }
}
import java.util.ArrayList;

public class U7_L2_Activity_Three {
    public static ArrayList<Integer> getEvens(ArrayList<Integer> vals) {
        ArrayList<Integer> evens = new ArrayList<Integer>();

        for (int i = 0; i < vals.size(); i++) {
            if (vals.get(i) % 2 == 0) {
                evens.add(vals.get(i));
            }
        }

        return evens;
    }
}
