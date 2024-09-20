package Java_Developer_Journey.src.main.java.Basics_of_Java;

public class Instance_Variables {

    public int a;

    public Instance_Variables(int b) {
        a = b;
    }

    public void display() {
        System.out.println(a);
    }

    public static void main(String args[]) {
        Instance_Variables obj = new Instance_Variables(10);
        obj.display();
    }

}
