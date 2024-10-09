package main.java.Basics_of_Java;

import java.util.Scanner;

public class Control_Flow_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Selection Statements
        // Real-time problem: Determine if a number is even or odd
        System.out.print("Enter the number check if it's even or odd: ");
        int number = sc.nextInt();

        if(number %2 == 0){
            System.out.println(number + " is even.");
        }
        else
        {
            System.out.println(number + " is odd.");
        }

        // Iteration Statements
        // Real-time problem: Calculate the factorial of a number
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int factorialNumber = sc.nextInt();
        long factorial = 1;

        for(int i = 1; i <= factorialNumber; i++){
            factorial *= i;
        }

        System.out.println("Factorial of "+ factorialNumber + " is " + factorial);

        // Jump Statements
        // Real-time problem: Find the first positive integer that is a multiple of 7
        System.out.println("Enter the first positive integer that is a multiple of 7...");
        int positiveInteger = sc.nextInt();
        for(positiveInteger = 1; positiveInteger <= 100; positiveInteger++)
        {
            if(positiveInteger % 7 == 0)
            {
                System.out.println("The first positive integer that is a multiple of 7 is: " + positiveInteger);
                break;  // Using break to exit the loop once the first multiple is found 
            }
        }

        sc.close();

    }
}
