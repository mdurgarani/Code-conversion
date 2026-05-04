import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private int marks;
    
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public String getName() {
        return name;
    }
    
    public int getMarks() {
        return marks;
    }
    
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
            .sorted((s1, s2) -> Integer.compare(s1.getMarks(), s2.getMarks()))
            .forEach(s -> System.out.println(s.getName() + " - " + s.getMarks()));
    }
}
