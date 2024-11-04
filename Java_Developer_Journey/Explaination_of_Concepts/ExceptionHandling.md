
# Exception Handling in Java

Exception handling is a mechanism in Java that allows the program to handle unexpected or error-prone scenarios effectively without disrupting the program flow. Java provides several exception-handling techniques to catch, throw, and manage exceptions.

## Keywords in Exception Handling

1. **try**: Wraps code that may throw an exception.
2. **catch**: Catches and processes the specific exception.
3. **finally**: Executes code after `try-catch` regardless of an exception.
4. **throw**: Allows for manually throwing an exception.
5. **throws**: Declares exceptions a method might throw.

## Types of Exceptions

1. **Checked Exceptions**: Handled at compile-time; must be caught or declared (e.g., `IOException`).
2. **Unchecked Exceptions**: Handled at runtime; includes errors like `NullPointerException`.
3. **Custom Exceptions**: User-defined exceptions to manage specific scenarios.

## Example Program: Banking System Exception Handling

Here’s an example that demonstrates handling different exceptions in a simple banking system.

```java
// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {
    public static void transferFunds(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Funds! Available balance: " + balance);
        }
        System.out.println("Transfer of " + amount + " completed successfully!");
    }

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Arithmetic Exception
            int[] arr = new int[5];
            System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str.length()); // NullPointerException
            java.io.FileInputStream file = new java.io.FileInputStream("nonexistent.txt");
            transferFunds(500, 1000); // Custom InsufficientFundsException

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer encountered.");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (InsufficientFundsException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block: Always executes.");
        }
    }
}
```

## UML Diagram for Exception Handling

Here's a UML diagram that represents the class structure and exception flow:

![UML Exception Handling Diagram](https://files.oaiusercontent.com/file-q5RdCcI82lUo0vgHE0zcV7xg?se=2024-11-01T06%3A07%3A55Z&sp=r&sv=2024-08-04&sr=b&rscc=max-age%3D604800%2C%20immutable%2C%20private&rscd=attachment%3B%20filename%3Dcb4fa6ff-299d-4be6-b723-36cce9463da2.webp&sig=AFrhSsxvCXp7qyCtWneYAzwYajM4oXqV%2BMSOTXaoq7M%3D)

---

### Explanation

- **Checked Exception**: `FileNotFoundException` is an example of a compile-time checked exception.
- **Unchecked Exceptions**: Examples include `ArithmeticException` and `NullPointerException`.
- **Custom Exception**: `InsufficientFundsException` is thrown to handle specific business logic errors.
- **Finally Block**: Ensures code within `finally` runs regardless of exceptions.

---

## Advantages of Exception Handling

- **Improved Readability**: Clear separation of error-handling code.
- **Maintains Program Flow**: Prevents abrupt termination.
- **Custom Error Messages**: Allows meaningful, user-friendly error feedback.

## Disadvantages of Exception Handling

- **Performance Overhead**: Slows down program execution.
- **Complexity**: Overusing exceptions can make code harder to maintain.

## Applications

1. **Banking Systems**: Manages account operations such as insufficient funds or invalid transactions.
2. **File Operations**: Handles file access and missing files.
3. **Networking**: Catches and manages issues like network timeouts or connection failures.

---

## Conclusion

Exception handling in Java enhances program stability and user experience by managing errors smoothly, allowing developers to write robust, fault-tolerant applications.