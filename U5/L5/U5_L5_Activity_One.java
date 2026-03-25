public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String ssn;

    public Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return (
            "SSN: " +
            ssn +
            "\n\tName: " +
            firstName +
            " " +
            lastName +
            "\n\tAge: " +
            age
        );
    }
}
