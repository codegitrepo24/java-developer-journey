package main.java.Basics_of_Java;
import java.util.Scanner;
public class ScannerClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  //creating scanner object
        System.out.println("Enter your full name: ");
        String name = sc.nextLine(); //String input
        System.out.println("Enter your age: ");
        int age = sc.nextInt(); // integer input
        System.out.println("Enter your Salary: ");
        double salary = sc.nextDouble(); //double-type input
        System.out.println("Are you happy today? True/False: ");
        boolean mood = sc.nextBoolean(); //boolean input

        System.out.println();

        System.out.println("Name: " + name + "\nAge: "+age+"\nSalary: "+salary+"\nHappy?"+mood);
        sc.close();

    }
}