// Write a program to add two numbers entered by the user.

import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("Numbers before adding: a = " + a + ", b = " + b);

        int c = a + b;
        System.out.println("Numbers after adding: a + b = " + c);
    }
}
