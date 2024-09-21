# How to Run a Java Program with Scanner Class
 - This document explains how to use the Scanner class in Java to get user input and run your program accordingly.

## Introduction

 - Imagine a calculator limited to adding only 1 and 2. It wouldn't be very helpful, right? Just like we need a versatile 
 - calculator, our programs often need user input to perform different tasks. The Scanner class in Java helps us achieve this by  
 - allowing users to provide input.

### What is the Scanner Class?

 - The Scanner class, part of the java.util package, is used to get user input of various types like integers, doubles, and 
 - strings. It provides methods to parse and process this input, making it a valuable tool for reading different kinds of data.   
 - By creating a Scanner object and associating it with an input source (like the console), developers can easily interact with 
 - users.

### Java Scanner Class Declaration

 - To use the Scanner class, you typically declare it like this:

Java: 
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
Use code with caution.

 - This code creates a Scanner object named scanner that is linked to the standard input stream (System.in), allowing you to read 
   user input from the console.

### How to Get the Java Scanner Class

#### Import the Package: 
 - Include the java.util package at the beginning of your program to use the Scanner class.

#### Create a Scanner Object: 
 - Use the Scanner class constructor to create an object, specifying the input source. Common sources include System.in for 
   console input or a File object for reading from files.

Java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
Use code with caution.

Java Scanner Class Constructors

The Scanner class offers various constructors to initialize a Scanner object with different input sources:

 - Scanner(InputStream source): Initializes a Scanner to read from an input stream, such as System.in.
 - Scanner(File source): Initializes a Scanner to read from a specified file.
 - Scanner(String source): Initializes a Scanner to read from a string.
 - Scanner(Readable source): Initializes a Scanner to read from any object implementing the Readable interface.
 - Scanner(Path source): Initializes a Scanner to read from a specified file path.
These constructors provide flexibility in setting up the Scanner object to read input from diverse sources.

### Java Scanner Class Methods

 - The Scanner class offers various methods to read user input of different data types. Here's a table outlining commonly used 
   methods:

#### Method	Description
 - nextInt()  ----->	Reads an integer value from the user.
 - nextDouble()  ----->	Reads a floating-point number from the user.
 - nextBoolean()  ----->	Reads a boolean value (true or false) from the user.
 - nextLine()  ----->	Reads a line of text (including spaces) from the user.
 - next()  ----->	Reads a single character from the user.
 - nextByte()  ----->	Reads a byte value from the user.
 - nextDouble()  ----->	Reads a double-precision floating-point number from the user.
 - nextShort()  ----->	Reads a short integer value from the user.
 - nextLong()  ----->	Reads a long integer value from the user.


### Drawbacks of the Scanner Class

 - While the Scanner class is a convenient way to get user input, it has some drawbacks:

 - Non-Thread-Safe: It's not suitable for multithreaded environments where multiple threads might access the Scanner object 
   simultaneously.
 - Limited Buffer Memory: It has a small buffer (1KB) which might cause issues when dealing with large amounts of data.
 - Slower Parsing: It parses the input stream slowly, making it less efficient for high-performance I/O operations.
 - Not Synchronized: It's not synchronized, so access from multiple