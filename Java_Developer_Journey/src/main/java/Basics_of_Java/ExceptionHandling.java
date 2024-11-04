package main.java.Basics_of_Java;

// Custom Exception for demonstration
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    // Simulate banking operations to demonstrate multiple exception types
    public static void transferFunds(double balance, double amount) throws InsufficientFundsException {
        if (balance > amount) {
            throw new InsufficientFundsException("Insufficient Funds! Available balance: " + balance);
        }

        System.out.println("Transfer of " + amount + " completed successfully!");
    }

    public static void main(String[] args) {
        // Example: Handling multiple exceptions in Java
        try {
            // 1. Arithmetic Exception (Unchecked Exception)
            int result = 10 / 0; // Division by zero

            // 2. Array Index Out of Bounds (Unchecked Exception)
            int[] arr = new int[5];
            System.out.println(arr[10]);// Invalid index

            // 3. Null Pointer Exception (Unchecked Exception)
            String str = null;
            System.out.println(str.length());// Accessing length of null string

            // 4. File Handling Example (Checked Exception)
            java.io.FileInputStream file = new java.io.FileInputStream("nonexistent.txt");

            // 5. Custom Exception: Insufficient Funds
            transferFunds(500, 1000); // Transfer amount greater than balance

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access an object that is null");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: The specified file could not be found.");
        } catch (InsufficientFundsException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block: This always executes.");
        }
    }

}
