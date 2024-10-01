package main.java.Basics_of_Java;

public class Static_Variables {
    static int a = 10;
    public static void main(String[] args) {
        int b = 10;
        System.out.println(a);
        sum(b);
    }
    public static void sum(int num)
    {
        System.out.println(a+num);
    }
    
}
