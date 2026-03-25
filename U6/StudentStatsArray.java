public class StudentStatsArray {

    private final Student[] students;

    public StudentStatsArray(Student[] students) {
        this.students = students;
    }

    // Returns the average gpa of the students
    public double averageGpa() {
        double sum = 0;
        for (Student s : students) {
            sum += s.getGpa();
        }
        return sum / students.length;
    }

    // Returns the gpa range of the students
    public double getGpaRange() {
        double min = students[0].getGpa();
        double max = students[0].getGpa();
        for (Student s : students) {
            if (s.getGpa() < min) min = s.getGpa();
            if (s.getGpa() > max) max = s.getGpa();
        }
        return max - min;
    }

    // Returns the name of the student that has the longest length
    public String getLongestName() {
        String longest = students[0].getName();
        for (Student s : students) {
            if (s.getName().length() > longest.length()) {
                longest = s.getName();
            }
        }
        return longest;
    }

    // Returns a count of the number freshman students
    public int getNumFreshman() {
        int count = 0;
        for (Student s : students) {
            if (s.getYear() == 1) count++;
        }
        return count;
    }

    // Returns the index of the first student with a name equal to name.
    // Returns -1 if not found
    public int search(String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) return i;
        }
        return -1;
    }

    // Returns the index of the first student with a gpa greater than or equal to the gpa
    // Returns -1 if not found
    public int search(double gpa) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGpa() >= gpa) return i;
        }
        return -1;
    }

    // Returns 1 if the students are sorted in ascending order by their gpa; -1 if they
    // are sorted in descending order; 0 otherwise.
    public int sortStatus() {
        boolean ascending = true;
        boolean descending = true;
        for (int i = 0; i < students.length - 1; i++) {
            double curr = students[i].getGpa();
            double next = students[i + 1].getGpa();
            if (curr > next) ascending = false;
            if (curr < next) descending = false;
        }
        if (ascending) return 1;
        if (descending) return -1;
        return 0;
    }

    // Returns the array of students in JSON like format
    public String toString() {
        String result = "[\n";
        for (int i = 0; i < students.length; i++) {
            result += students[i].toString() + ",\n";
        }
        result += "]";
        return result;
    }
}
