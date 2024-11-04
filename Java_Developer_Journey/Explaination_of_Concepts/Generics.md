
# Generics in Java

Generics in Java allow types (classes and interfaces) to be parameters when defining classes, interfaces, and methods. This ensures type safety by catching errors at compile time rather than runtime. Generics were introduced in Java 5 to make code more robust and less error-prone. The main types of generics in Java are:

1. [Generic Classes](#1-generic-classes)
2. [Generic Methods](#2-generic-methods)
3. [Bounded Types](#3-bounded-types)

---

## 1. Generic Classes

A generic class is defined with type parameters, allowing the class to operate on different types without sacrificing type safety.

**Syntax**:
```java
class ClassName<T> { /* ... */ }
```

Here, `T` is a placeholder for the type parameter specified when an object of this class is created.

**Example of a Generic Class**:
```java
// A generic Box class that can store any type of object
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>(); // Box for Strings
        stringBox.setContent("Hello Generics");
        System.out.println(stringBox.getContent());

        Box<Integer> integerBox = new Box<>(); // Box for Integers
        integerBox.setContent(123);
        System.out.println(integerBox.getContent());
    }
}
```

### Real-World Example:
Imagine a storage container that can hold different items. Instead of having separate containers for each type (Books, Clothes, etc.), you can have a generic `Container` class that can hold any type of item specified during creation.

---

## 2. Generic Methods

Generic methods define their own type parameters, making them independent of the class's type parameters.

**Syntax**:
```java
<T> returnType methodName(T param) { /* ... */ }
```

**Example of a Generic Method**:
```java
public class GenericMethodExample {

    // A generic method that prints any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4 };
        String[] stringArray = { "Hello", "World" };

        printArray(intArray); // Prints Integer array
        printArray(stringArray); // Prints String array
    }
}
```

### Real-World Example:
Consider a printing service where you need to print receipts, invoices, or shipping labels. A generic print method could handle any of these objects and print them accordingly.

---

## 3. Bounded Types

Bounded types restrict the types that can be passed as arguments to a generic class or method using the `extends` keyword.

**Syntax**:
```java
class ClassName<T extends SuperClass> { /* ... */ }
```

A bounded type parameter restricts the type to a specific class or its subclasses (in the case of `extends` for classes or interfaces).

**Example of a Bounded Type**:
```java
class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public double getDoubleValue() {
        return number.doubleValue();
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        NumberBox<Integer> integerBox = new NumberBox<>(10); // Allowed, Integer is a subclass of Number
        NumberBox<Double> doubleBox = new NumberBox<>(5.5);  // Allowed, Double is a subclass of Number

        System.out.println(integerBox.getDoubleValue());
        System.out.println(doubleBox.getDoubleValue());
    }
}
```

### Real-World Example:
Consider a financial application where calculations are performed only on numeric data types. Using bounded generics, you can ensure that only numeric types like `Integer`, `Double`, or `Float` are allowed.

---

## Benefits of Generics in Java

1. **Type Safety**: Generics enforce type checks at compile-time, reducing runtime errors.
2. **Code Reusability**: Generic classes and methods are more reusable since they work with different data types.
3. **Avoid Casting**: Generics eliminate the need for explicit type casting, making the code cleaner and easier to read.

---

## Summary

Generics in Java allow creating type-safe classes and methods that work with any data type, enhancing code reusability and maintainability. The three main types of generics are generic classes, generic methods, and bounded types.
