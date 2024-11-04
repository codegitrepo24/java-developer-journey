package main.java.OOPs;

class Car{
    String brand;
    int year;

    void displayInfo(){
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
public class Class_vs_Object {
   public static void main(String[] args) {
       Car car = new Car(); // Object creation
       car.brand = "Toyota";
       car.year = 2021;
       car.displayInfo();
   } 
}
