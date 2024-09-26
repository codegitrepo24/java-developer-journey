package Java_Developer_Journey.src.main.java.Basics_of_Java;

public class Find_Area_of_Rectangle {
    public static int area(int length, int breadth)
    {
        return length * breadth;
    }
    
    public static void main(String[] args) {
        int length = 4;
        int breadth = 20;

        System.out.println("The area of Rectangle: " + area(length, breadth));
    }
}
