# Introduction to Data Types in Java

Java is a statically and strongly-typed language, which means that each type of data is predefined as part of the programming language. A variable's data type is an attribute that tells the compiler how the programmer intends to use the variable. It determines the operations that can be performed on the data and the type of values that can be stored.

## Types of Data in Java

Java has two main categories of data types:

1. **Primitive Data Type**
2. **Non-Primitive Data Type (Object Data Type)**

## 1. Primitive Data Type

Primitive data types are predefined by the programming language and do not include additional complex methods. They are the most basic data types in Java. Java supports eight primitive data types:

- **Boolean data type**: Represents a single bit of data, which can be either `true` or `false`.
- **byte data type**: An 8-bit signed integer ranging from -128 to 127.
- **char data type**: A single 16-bit Unicode character enclosed in single quotes, e.g., `'A'` or `'a'`.
- **short data type**: A 16-bit signed integer ranging from -32,768 to 32,767.
- **int data type**: A 32-bit signed integer ranging from -2,147,483,648 to 2,147,483,647.
- **long data type**: A 64-bit signed integer ranging from -2^63 to 2^63-1.
- **float data type**: A 32-bit single-precision floating-point number. Ends with `f`, e.g., `3.14f`.
- **double data type**: A 64-bit double-precision floating-point number. Ends with `d`, e.g., `3.14d`.

## 2. Non-Primitive Data Type

Non-primitive data types, also known as object or reference data types, are not predefined by Java but are created by the programmer. They store memory addresses of variable values rather than the values themselves. Java supports the following non-primitive data types:

- **Arrays**: Homogeneous data structures that store multiple values of the same type with indexed access.
- **Strings**: Objects representing sequences of characters, managed by the `String` class in the `java.lang` package.
- **Classes**: Blueprints or prototypes containing fields (variables), properties, and methods to represent the behavior of an object.
- **Interfaces**: Similar to classes, but with all methods declared as abstract, containing only definitions and signatures without implementations.

This basic understanding of data types in Java will help you effectively utilize and manipulate data within your programs.
