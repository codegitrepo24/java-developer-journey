

# Control Flow Statements in Java

Control flow statements are fundamental components of the Java programming language that dictate the order in which the code is executed. Java provides several types of control flow statements that enable developers to control the execution flow of their programs based on certain conditions, iterations, and jumps. Understanding these statements is essential for creating dynamic and flexible Java applications.

## Types of Control Flow Statements

Java categorizes control flow statements into three main types:

1. **Selection Statements**: Used to select a specific block of code to execute based on a condition.
2. **Iteration Statements**: Used to repeat a block of code multiple times based on a condition.
3. **Jump Statements**: Used to alter the flow of control by jumping to a different part of the code.

### 1. Selection Statements

Selection statements allow the program to execute different code blocks based on specific conditions. The primary selection statements in Java are:

- **if statement**: Executes a block of code if the specified condition is true.
- **if-else statement**: Executes one block of code if the condition is true, and another block if it is false.
- **switch statement**: Selects one of many blocks of code to be executed based on the value of an expression.

**Example**: Check if a number is even or odd.

```java
if (number % 2 == 0) {
    System.out.println(number + " is even.");
} else {
    System.out.println(number + " is odd.");
}
```

### 2. Iteration Statements

Iteration statements allow the program to execute a block of code multiple times until a specified condition is met. The primary iteration statements in Java are:

- **for loop**: Repeats a block of code a specific number of times.
- **while loop**: Repeats a block of code while a specified condition is true.
- **do-while loop**: Similar to the while loop, but guarantees that the block of code will be executed at least once.

**Example**: Calculate the factorial of a number using a for loop.

```java
for (int i = 1; i <= factorialNumber; i++) {
    factorial *= i;
}
```

### 3. Jump Statements

Jump statements alter the flow of control by allowing the program to jump to different parts of the code. The primary jump statements in Java are:

- **break statement**: Exits from the current loop or switch statement.
- **continue statement**: Skips the current iteration of a loop and proceeds to the next iteration.
- **return statement**: Exits from the current method and optionally returns a value.

**Example**: Find the first positive integer that is a multiple of 7.

```java
for (int i = 1; i <= 100; i++) {
    if (i % 7 == 0) {
        System.out.println("The first positive integer that is a multiple of 7 is: " + i);
        break; // Exit the loop
    }
}
```

