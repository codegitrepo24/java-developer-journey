package main.java.OOPs;

class Animal {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Animal animal = new Cat();  // Runtime polymorphism
        animal.sound();
    }
}
