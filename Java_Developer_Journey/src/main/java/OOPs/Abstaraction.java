package main.java.OOPs;

interface Animal{
    void sound(); // Abstract method
}

class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("The dog barks.");
    }
}
public class Abstaraction {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Polymorphism with interface
        animal.sound();
    }
}
