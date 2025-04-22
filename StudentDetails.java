class Student {
    String name;
    int rollNumber;
    int age;

    // Constructor to initialize student details
    Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // Creating student objects with details directly in the program
        Student student1 = new Student("John Doe", 101, 20);
        Student student2 = new Student("Jane Smith", 102, 22);
        
        // Display student details
        System.out.println("Student 1 Details:");
        student1.displayDetails();
        
        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
    }
}
