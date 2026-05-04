import java.util.Arrays;
import java.util.List;

// Using Java 17 Record - concise way to define immutable data carriers
record Student(String name, int marks) {}

public class Student17 {
    public static void main(String[] args) {
        // List of students: (Name, Marks)
        List<Student> students = Arrays.asList(
            new Student("Ravi", 85),
            new Student("Anu", 92),
            new Student("Kiran", 78),
            new Student("Meena", 90)
        );
        
        // Sort students based on marks (ascending order)
        System.out.println("Students sorted by marks (ascending):");
        students.stream()
            .sorted((s1, s2) -> Integer.compare(s1.marks(), s2.marks()))
            .forEach(s -> System.out.println(s.name() + " - " + s.marks()));
    }
}
