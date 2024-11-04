package main.java.OOPs;

class Inheritance {
    void eat() {
        System.out.println("The animal eats the food.");
    }
}

class Dog extends Inheritance {
    void bark() {
        System.out.println("The dog barks.");
    }

    public class Main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat(); // Inherited method from Animal class
            dog.bark(); // Method from Dog class
        }

    }
}
