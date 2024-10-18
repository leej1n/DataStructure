import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Sort Students by Name");
            System.out.println("5. Search for Student");
            System.out.println("6. Display Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add new student
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student marks: ");
                    double marks = scanner.nextDouble();
                    Student student = new Student(id, name, marks);
                    management.addStudent(student);
                    break;
                case 2:
                    // Edit the student
                    scanner = new Scanner(System.in);
                    System.out.print("Enter the ID of the student to edit: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new marks: ");
                    marks = scanner.nextDouble();
                    management.editStudent(id, newName, marks);
                    break;
                case 3:
                    // Delete the student
                    System.out.print("Enter the ID of the student to delete: ");
                    id = scanner.nextInt();
                    management.deleteStudent(id);
                    break;
                case 4:
                    // Sort students by name
                    management.sortStudentsByName();

                    System.out.println("After sorting:");
                    management.displayStudents();
                    break;
                case 5:
                    // Search for a student
                    System.out.print("Enter the ID of the student to search: ");
                    id = scanner.nextInt();

                    Student foundStudent = management.searchStudent(id);
                    if (foundStudent != null) {
                        System.out.println("Student found:");
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("Student with ID " + id + " not found.");
                    }
                    break;
                case 6:
                    // Display students
                    management.displayStudents();
                    break;
                case 7:
                    // Exit the system
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}