package main.java.Basics_of_Java;

import java.util.Scanner;

/**
 * Arithmetic_Operator
 */
public class Arithmetic_Operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter operators(+, -, *, /, %)");
        char operator = sc.next().charAt(0); // charAt(index): Returns the character at the specified position (index)
                                             // in a string. In this case, charAt(0) gets the first character of the
                                             // string.

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        double answer = 0;

        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;

            case '-':
                answer = num1 - num2;
                break;

            case '*':
                answer = num1 * num2;
                break;

            case '/':

                if (num2 != 0) {
                    answer = num1 / num2;
                } else {
                    System.out.println("Error:Division by zero is not allowed.");

                }
                break;

            case '%':

                if (num2 != 0) {
                    answer = num1 % num2;
                } else {
                    System.out.println("Error:Division by zero is not allowed.");

                }

                break;
            default:
                System.out.println("Invalid Operation:please choose (+, -, *, /, %).");
                return;
        }

        System.out.println("The answer of operation is: " + answer);

        sc.close();

    }
}