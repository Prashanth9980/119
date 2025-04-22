import java.util.Scanner;

class Student {
    String name;
    int id;
    String contactNumber;
    String email;

    // Constructor
    Student(String name, int id, String contactNumber, String email) {
        this.name = name;
        this.id = id;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name          : " + name);
        System.out.println("ID            : " + id);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email         : " + email);
    }
}

public class StudentDetailsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Contact Number: ");
        String contactNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        // Create Student object
        Student student = new Student(name, id, contactNumber, email);

        // Display details
        student.displayDetails();

        sc.close();
    }
}
