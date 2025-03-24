// Write a program to swap two numbers without using a third variable.

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println(("Enter second number:"));
        int b = sc.nextInt();

        System.out.println("Numbers before swapping: a = " + a + ", b = " + b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(("Numbers after swapping: a = " + a +", b = "+b));
        sc.close();
        
    }
}
