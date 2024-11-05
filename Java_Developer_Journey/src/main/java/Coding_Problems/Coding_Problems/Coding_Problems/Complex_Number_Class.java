import java.util.Scanner;

class ComplexNumber {
    int real;
    int imaginary;

    // Constructor
    ComplexNumber(int real, int imaginary) {

        this.real = real;
        this.imaginary = imaginary;

    }

    // Method to add another complex number to the current complex number
    public void plus(ComplexNumber other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    // Method to multiply another complex number with the current complex number
    public void multiply(ComplexNumber other) {
        int newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        int newImaginary = (this.real * other.real) + (this.imaginary * other.imaginary);
        this.real = newReal;
        this.imaginary = newImaginary;
    }

    // Method to print the complex number in the specified format
    public void print() {
        System.out.println(this.real + " + i" + this.imaginary);
    }

}

public class Complex_Number_Class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the first complex number
        System.err.println("Enter the real and imaginary parts of the first complex number (C1):");
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();
        ComplexNumber C1 = new ComplexNumber(real1, imaginary1);

        // Taking input for the second complex number
        System.err.println("Enter the real and imaginary parts of the second complex number (C2):");
        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();
        ComplexNumber C2 = new ComplexNumber(real2, imaginary2);

        // Taking input for the operation
        System.out.println("Enter 1 for addition or 2 for multiplication: ");
        int operation = sc.nextInt();

        if (operation == 1) {
            C1.plus(C2);
            System.out.print("Result after addition: ");
            C1.print();

        }

        else if (operation == 2) {
            // Perform multiplication
            C1.multiply(C2);
            System.out.print("Result after multiplication: ");
            C1.print();
        } else {
            System.out.println("Invalid operation choice. Please enter 1 or 2.");
        }

        // Close the scanner
        sc.close();

    }
}