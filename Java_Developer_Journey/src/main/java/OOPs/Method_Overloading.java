package main.java.OOPs;

class Calculator {
    // Overloaded add method with two parameters
	int add(int a, int b){
        return a+b;
    }

    // Overloaded add method with three parameters
    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class Method_Overloading{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2,3));
        System.out.println(calc.add(5,10,20));
    }}




