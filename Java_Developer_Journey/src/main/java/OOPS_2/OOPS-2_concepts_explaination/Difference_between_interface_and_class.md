# Difference Between Interface and Class in Java

## 1. **Definition**
- **Interface:**
  - An interface is a blueprint of a class that contains only abstract methods (prior to Java 8) or a combination of abstract, default, and static methods (Java 8 and later).
  - It is used to specify a contract that implementing classes must follow.

- **Class:**
  - A class is a blueprint for creating objects that encapsulates data (fields) and behavior (methods).
  - It can contain both concrete (fully defined) and abstract methods.

---

## 2. **Key Differences**

| **Aspect**               | **Interface**                                                                                      | **Class**                                                                                   |
|--------------------------|----------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| **Purpose**              | Defines a contract that other classes must adhere to.                                              | Serves as a blueprint for creating objects.                                                |
| **Method Types**         | Abstract methods (default prior to Java 8), default methods, and static methods.                   | Can have concrete methods, abstract methods (if declared abstract), and static methods.    |
| **Field Modifiers**      | Fields are `public`, `static`, and `final` by default.                                             | Fields can have any access modifier (`private`, `protected`, `public`) and be mutable.     |
| **Inheritance**          | A class can implement multiple interfaces.                                                        | A class can extend only one class.                                                        |
| **Access Modifiers**     | Methods are `public` by default.                                                                  | Methods can have any access modifier (`private`, `protected`, `public`).                  |
| **Object Instantiation** | Interfaces cannot be instantiated directly.                                                       | Classes can be instantiated (if not abstract).                                            |
| **Constructors**         | Interfaces do not have constructors.                                                              | Classes can have constructors for initialization.                                         |
| **Multiple Inheritance** | Supports multiple inheritance through interface implementation.                                    | Does not support multiple inheritance directly (due to the diamond problem).              |

---

## 3. **When to Use**

### Use an Interface:
- When you need to define a contract or behavior that multiple classes can implement.
- When you need to achieve multiple inheritance.
- Example: **`Comparable`**, **`Runnable`** interfaces in Java.

### Use a Class:
- When you want to encapsulate data and provide functionality.
- When object instantiation is required.
- Use abstract classes when:
  - You need to provide some shared implementation.
  - You want to define a common base class.

---

## 4. **Example Code**

### Interface Example
```java
interface Animal {
    void makeSound(); // Abstract method

    static void description() {
        System.out.println("An animal interface with abstract methods and static methods.");
    }

    default void eat() {
        System.out.println("Animals eat food to survive.");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats bones.");
    }
}
```

### Abstract Class Example
```java
abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("The vehicle stops.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The car starts with an ignition key.");
    }
}
```

---

## 5. **Conclusion**
- Interfaces and classes serve different purposes in Java.
- **Interfaces** provide a way to define contracts and achieve multiple inheritance.
- **Classes** allow encapsulation of data and behavior, with the ability to implement interfaces and extend other classes.
- Choosing between them depends on the use case and design requirements of your application.

