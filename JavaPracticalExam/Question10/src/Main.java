import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 21));
        students.add(new Student("David", 19));
        students.add(new Student("Eve", 23));

        System.out.println("Students before sorting:");
        iterateStudents(students);

        Collections.sort(students, (s1, s2) -> s1.getAge() - s2.getAge());

        System.out.println("\nStudents after sorting by age:");
        iterateStudents(students);
    }

    private static void iterateStudents(ArrayList<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
