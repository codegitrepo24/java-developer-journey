# **Constructors in Java**

## **Introduction**

A **constructor** in Java is a special method used to initialize objects. When you create an object of a class, a constructor gets invoked automatically. It helps set initial values to the object attributes at the time of creation. Constructors have the same name as the class and no return type.

There are three types of constructors in Java:
1. **Default Constructor**
2. **Parameterized Constructor**
3. **Copy Constructor**

---

## **Types of Constructors**

### 1. **Default Constructor**
A **default constructor** is automatically provided by Java if no constructor is defined. If the programmer explicitly defines one, it initializes the attributes with default values.

#### **Example:**
```java
class Student {
    String name;
    int rollNumber;

    // Default Constructor
    public Student() {
        name = "Unknown";
        rollNumber = 0;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student student1 = new Student(); // Calls default constructor
        student1.display();
    }
}
```
**Explanation:**  
When `new Student()` is called, the **default constructor** initializes `name` to `"Unknown"` and `rollNumber` to `0`.

---

### 2. **Parameterized Constructor**
A **parameterized constructor** allows passing arguments to initialize the object with specific values at the time of creation.

#### **Example:**
```java
class Student {
    String name;
    int rollNumber;

    // Parameterized Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student student2 = new Student("Alice", 101); // Calls parameterized constructor
        student2.display();
    }
}
```
**Explanation:**  
When `new Student("Alice", 101)` is called, the constructor assigns `"Alice"` to `name` and `101` to `rollNumber`.

---

### 3. **Copy Constructor**
A **copy constructor** creates a new object by copying the data from another object of the same class.

#### **Example:**
```java
class Student {
    String name;
    int rollNumber;

    // Parameterized Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Copy Constructor
    public Student(Student other) {
        this.name = other.name;
        this.rollNumber = other.rollNumber;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student student2 = new Student("Alice", 101); // Parameterized constructor
        Student student3 = new Student(student2); // Copy constructor
        student3.display();
    }
}
```
**Explanation:**  
The copy constructor `new Student(student2)` copies the data from `student2` into `student3`.

---

## **Diagram Explanation**

Below is a simple UML diagram representing the `Student` class with all types of constructors:

![Constructor UML Diagram](https://files.oaiusercontent.com/file-viZ8SLSpjQ9gLiTPXB9VOwaj?se=2024-10-29T12%3A41%3A05Z&sp=r&sv=2024-08-04&sr=b&rscc=max-age%3D604800%2C%20immutable%2C%20private&rscd=attachment%3B%20filename%3D556a134c-6d33-433e-9075-b66592712adc.webp&sig=YOhqdFkZ6ENa9tkGym2tpfgPsD04a5SSz9PqUaqhMEk%3D)

---

## **How Constructors Work**

1. **When is a Constructor Invoked?**  
   - When you create an object using the `new` keyword, the constructor is invoked automatically.

2. **Can a Class Have Multiple Constructors?**  
   - Yes, this is called **constructor overloading**. Each constructor must have a different parameter list.

3. **Difference between Constructor and Method**  
   - Constructors do not have a return type, while methods do.
   - Constructors are called only once when the object is created, but methods can be called multiple times.

---

## **Real-World Example: Student Database System**

Here’s a real-world problem demonstrating all constructor types:

### **Problem:**
You need to create a **Student Database System**. The system should:
1. Use a **default constructor** to initialize unknown students.
2. Use a **parameterized constructor** to create students with known details.
3. Use a **copy constructor** to duplicate a student’s record.

### **Program Overview:**

- **Class:** `Student`
- **Attributes:** `name`, `rollNumber`, `marks`
- **Constructors:** Default, Parameterized, Copy
- **Methods:** `display()`

This structure ensures encapsulation, reusability, and ease of initialization.

---

## **Summary**

In this guide, we explored the three types of constructors in Java:
1. **Default Constructor**: Initializes attributes with default values.
2. **Parameterized Constructor**: Allows initialization with specific values.
3. **Copy Constructor**: Copies data from one object to another.

### **Key Points to Remember:**
- A constructor has the same name as the class.
- It does not have a return type.
- Java automatically provides a default constructor if no other constructor is defined.

By using constructors effectively, we can initialize objects in different ways, making our programs more flexible and readable.