import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManagement {
    private ArrayList<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void editStudent(int id, String newName, double newMarks) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setMarks(newMarks);
                student.setRank();
                return;
            }
        }
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return;
            }
        }
    }

    public void sortStudentsByName() {
        Collections.sort(students, Comparator.comparing(Student::getName));
    }

    public Student searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("----------------------------------------");
            System.out.println("ID\tName\tMarks\tRank");
            System.out.println("----------------------------------------");
            for (Student student : students) {
                System.out.println(student);
            }
            System.out.println("----------------------------------------");
        }
    }
}