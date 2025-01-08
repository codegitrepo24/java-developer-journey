# Interface in Java

An **interface** in Java is a blueprint for a class that contains **abstract methods**, **default methods**, **static methods**, and **constants**. It is used to achieve **abstraction** and **multiple inheritance** in Java.

## Properties of Interfaces in Java

1. **Abstract Methods**: All methods in an interface are implicitly public and abstract unless they are static or default.
2. **Multiple Inheritance**: A class can implement multiple interfaces.
3. **Constants**: Fields in an interface are implicitly public, static, and final.
4. **Default Methods**: Introduced in Java 8, these methods have a default implementation.
5. **Static Methods**: Also introduced in Java 8, static methods can be called without an object of the implementing class.

## Syntax
```java
interface InterfaceName {
    // Abstract method
    void method1();

    // Default method
    default void method2() {
        System.out.println("Default method in Interface");
    }

    // Static method
    static void method3() {
        System.out.println("Static method in Interface");
    }
}
```

## Applications of Interfaces

1. **Achieving Abstraction**: Interfaces allow you to define behaviors that a class must implement.
2. **Multiple Inheritance**: A class can implement multiple interfaces, which overcomes the limitation of single inheritance in Java.
3. **Polymorphism**: Interfaces provide a way to achieve runtime polymorphism.
4. **Loose Coupling**: Interfaces provide flexibility and maintainability by separating implementation from behavior.

## Example
```java
// Defining an interface
interface Vehicle {
    void start();
    void stop();

    default void honk() {
        System.out.println("Vehicle is honking!");
    }

    static void serviceInfo() {
        System.out.println("Vehicles need regular servicing.");
    }
}

// Implementing the interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.honk();
        car.stop();

        Vehicle.serviceInfo();
    }
}
```

## Key Points
- Interfaces cannot have constructors or instance methods.
- A class that implements an interface must provide implementations for all its abstract methods.
- An interface can extend another interface.
- Interfaces promote loose coupling and are a key part of designing scalable applications.

By understanding and applying interfaces, you can create flexible and maintainable Java applications.
