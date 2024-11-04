package main.java.OOPs;

/**
 * Encapsulation refers to binding the data (variables) and the methods that
 * operate on the data within a single unit (class). It helps in data hiding by
 * restricting access to certain components using access modifiers (private,
 * public, protected).
 */
public class Encapsulation {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("John");
        System.out.println("The name of the Student:" + obj.getName());
    }
}
