// Car class
class Car {
    int noOfGear;
    String color;

    // Parameterized constructor for Car
    public Car(int noOfGear, String color) {
        this.noOfGear = noOfGear;
        this.color = color;
    }

    // Method to print Car information
    public void printCarInfo() {
        System.out.println("noOfGear: " + noOfGear);
        System.out.println("color: " + color);
    }
}

// RaceCar class extending Car
class RaceCar extends Car {
    int maxSpeed;

    // Parameterized constructor for RaceCar
    public RaceCar(int noOfGear, String color, int maxSpeed) {
        // Call the superclass (Car) constructor
        super(noOfGear, color);
        this.maxSpeed = maxSpeed;
    }

    // Method to print RaceCar information
    public void printRaceCarInfo() {
        printCarInfo();  // Calling Car's print method to avoid code duplication
        System.out.println("maxSpeed: " + maxSpeed);
    }
}

// Main class to test the code
public class Car_Class {
    public static void main(String[] args) {
        // Create an object of RaceCar with sample inputs
        RaceCar raceCar = new RaceCar(5, "red", 1000);

        // Call the printRaceCarInfo method
        raceCar.printRaceCarInfo();
    }
}
