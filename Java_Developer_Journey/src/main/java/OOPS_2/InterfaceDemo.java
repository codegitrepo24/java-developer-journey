package main.java.OOPS_2;


// Defining an interface
interface Vehicle{
    // Abstract methods (implicitly public and abstract)
     void start();
     void stop();

    // Default method (introduced in Java 8)
     default void honk(){
        System.out.println("Vehicle is honking");
     }

    // Static method (introduced in Java 8)
     static void serviceInfo(){
        System.out.println("Vehicle service is available");
     }
}

// Defining another interface
interface ElectricVehicle{
    void charge();
}

// A class implementing multiple interfaces
class Car implements Vehicle, ElectricVehicle{
    public void start(){
        System.out.println("Car has started");
    }
    public void stop(){
        System.out.println("Car has stopped");
    }
    public void charge(){
        System.out.println("Car is charging");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
         // Creating an instance of Car
        Car mycar  = new Car();

        // Using methods from Vehicle interface
        mycar.start();
        mycar.honk();           
        mycar.stop();

        // Using methods from ElectricVehicle interface
        mycar.charge();

        // Using static method from Vehicle interface
        Vehicle.serviceInfo();
        
    }

    
}
