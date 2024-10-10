## Java Functions and Control Flow - README

### Introduction to Functions in Java

In Java, a **function** (also called a **method**) is a block of code that performs a specific task. Functions help reduce redundancy, make the code easier to maintain, and improve readability. Java provides various types of methods, including instance methods, static methods, and constructors, each with a different purpose and functionality.

Functions in Java can be broadly classified into two categories:

1. **Instance Methods**: These are methods that belong to an instance of a class and are used to perform actions specific to that object.
2. **Static Methods**: These belong to the class itself and can be called without creating an object of the class.
3. **Constructors**: Special methods used to initialize objects when they are created.

### Purpose of Functions

- **Code Reusability**: By defining common functionalities in a method, you can call the method wherever needed, avoiding the repetition of code.
- **Modularity**: Breaks down complex tasks into smaller, more manageable pieces.
- **Readability**: Functions provide clarity in code and make it easier to understand.
- **Maintainability**: Changes can be made in one place without affecting the rest of the program.

### Types of Methods in Java

#### 1. Instance Methods
Instance methods are tied to the instance of a class. They operate on instance variables and require an object to be called. For example:

```java
public void deposit(double amount) {
    if(amount > 0) {
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
    } else {
        System.out.println("Invalid amount. Deposit failed.");
    }
}
```

#### 2. Static Methods
Static methods belong to the class rather than an instance of the class. These methods can be called without creating an object of the class and usually operate on static data members. Example:

```java
public static double calculateInterest(double balance) {
    double interestRate = 0.05; // 5% interest rate
    return balance * interestRate;
}
```

#### 3. Constructor
A constructor is a special type of method that gets invoked when a class object is created. It is used to initialize the state of an object.

```java
public Methods(double initialBalance) {
    this.balance = initialBalance;
}
```





