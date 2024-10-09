package main.java.Basics_of_Java;

import java.util.Scanner;

public class Largest_of_3_Numbers {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the first number: ");
     double num1 = sc.nextInt();

     System.out.println("Enter the second number: ");
     double num2 = sc.nextInt();

     System.out.println("Enter the third number: ");
     double num3 = sc.nextInt();

     if((num1 >= num2) && (num1 >= num3)){
        System.out.println("The largest number is: " + num1);
     }
     else if ((num2 >= num1) && (num2 >= num3)) {
        System.out.println("The largest number is: " + num2);
        
     }
     else
     {
        System.out.println("The largest number is: " + num3);
     }

     sc.close();

    }
}
