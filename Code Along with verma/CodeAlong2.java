import java.util.Scanner;

public class CodeAlong2 {

    public static void main(String[] args) {
        String s1 = "hello 12345 time; 3:45"; // declared and intialized string
        String s2 = s1; // declaring s1 is a var of type string
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        String s3 = new /* new mem ref */ String(s1);
        System.out.println(s3);
        System.out.println(s1 == s3); // same data, different memory refrence
        String s4 = "hello 12345 time; 3:45";
        System.out.println(s1 == s4); // already exists, default to existing mem ref
        System.out.println("hello\nworld\njava");
        System.out.println("hello\n\tworld\n\t\tjava");

        // String methods
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s3));
        String s5 = "abc";
        String s6 = "aac";
        System.out.println(s5.compareTo(s6));
        System.out.println(s6.compareTo(s5));
        System.out.println(s6.toUpperCase());
        s6 = s6.toUpperCase();
        System.out.println(s6);

        //s1 = "hello 12345 time; 3:45";
        System.out.println(s1.indexOf('3'));
        System.out.println(s1.indexOf("3:45"));
        System.out.println(s1.indexOf('H'));
        //System.out.println(s1.charAt(25));
        System.out.println(s1.length());
    }
}
