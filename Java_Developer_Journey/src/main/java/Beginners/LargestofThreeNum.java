// Write a program to find the largest of three numbers

import java.util.Scanner;

public class LargestofThreeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = sc.nextInt();

        System.out.println("Numbers before comapring: num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);

        if(num1>=num2 && num1>=num3){
            System.out.println("Largest number is: " + num1);
        }
        else if(num2>num1 && num2>=num3){
            System.out.println("Largest number is: " + num2);
        }
        else{
            System.out.println("Largest number is: " + num3);
        }

        sc.close();

    }
}
