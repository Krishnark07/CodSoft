import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class studentmanagement {
    private ArrayList<Student> students;
    private int nextStudentId = 1;

    public studentmanagement() {
        students = new ArrayList<>();
    }
    
    public void addStudent(String name, int age) {
        students.add(new Student(nextStudentId, name, age));
        nextStudentId++;
    }
    
    public void displayAllStudents() {
        for (Student student : students) {
            student.displayStudent();
        }
    }
    
    public void updateStudent(int id, String name, int age) {
        for (Student student : students) {
            if (student.getId() == id) {
                student = new Student(id, name, age);
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        studentmanagement sms = new studentmanagement();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Student Management System");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Exit");
                System.out.print("Select an option: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student age: ");
                        int age = scanner.nextInt();
                        sms.addStudent(name, age);
                        break;
                    case 2:
                        sms.displayAllStudents();
                        break;
                    case 3:
                        System.out.print("Enter student ID to update: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter new name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter new age: ");
                        age = scanner.nextInt();
                        sms.updateStudent(id, name, age);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}
