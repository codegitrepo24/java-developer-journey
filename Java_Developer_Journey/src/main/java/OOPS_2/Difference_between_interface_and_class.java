package main.java.OOPS_2;

// Interface Example
interface Animal {

    // Interface methods are abstract and public by default
    void makeSound(); // Abstract method

    // Static method in interface
    static void description(){
        System.out.println("An animal interface with abstract methods and static methods.");
    }

    // Default method in interface
    default void eat(){
        System.out.println("Animals eat food to survive.");
    }

    
}

// Class Example
class Dog implements Animal{
    // Implementing the interface method
    public void makeSound(){
        System.out.println("The dog Bark bark");
    }

    // Overriding the default method
    public void eat(){
        System.out.println("The dog eats bones.");
    }
}

// Abstarct class Example
abstract class Vehicle{
     // Abstract method (to be implemented by subclasses)
    abstract void start();

    // Concrete method
    void stop(){
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle{
    // Implementing the abstract method
    void start(){
        System.out.println("The car starts with an ignition key.");
    }
}
public class Difference_between_interface_and_class {

    public static void main(String[] args) {
        // Using Interface
        System.out.println("Interface Example: ");
        Animal.description(); // Static method in interface
        Animal dog = new Dog(); // Create a Dog object
        dog.makeSound(); // Call the abstract method
        dog.eat(); // Call the default method

        System.out.println("\nAbstract Class Example: ");
        Vehicle myCar = new Car(); // Create a Car object
        myCar.start(); // Call the abstract method
        myCar.stop(); // Call the concrete method
    }

    
} 