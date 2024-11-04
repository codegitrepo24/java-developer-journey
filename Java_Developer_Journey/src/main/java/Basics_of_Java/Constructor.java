package main.java.Basics_of_Java;

public class Constructor {
    String name;
    int rollNumber;
    double marks;

    // Default Constructor
    public Constructor() {
        this.name = "Unknown";
        this.rollNumber = 0;
        this.marks = 0.0;
    }

    // Parameterized Constructor
    public Constructor(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public Constructor(Constructor other) {
        this.name = other.name;
        this.rollNumber = other.rollNumber;
        this.marks = other.marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }

    // Method to update marks
    public void updateMarks(double newMarks) {
        this.marks = newMarks;
    }

    public static void main(String[] args) {
        Constructor student1 = new Constructor();
        student1.displayDetails();

        // Using Parameterized Constructor
        Constructor student2 = new Constructor("Alice", 101, 87.5);
        student2.displayDetails();

        // Using Copy Constructor
        Constructor student3 = new Constructor(student2);
        System.out.println("Copy of Alice's data:");
        student3.displayDetails();

        // Update marks of the copied student and display again
        student3.updateMarks(90.0);
        System.out.println("After updating marks:");
        student3.displayDetails();
    }


}
