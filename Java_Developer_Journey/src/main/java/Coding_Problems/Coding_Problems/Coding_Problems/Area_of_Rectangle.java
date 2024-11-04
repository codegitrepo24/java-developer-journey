package main.java.Coding_Problems.Coding_Problems.Coding_Problems;

import java.util.Scanner;

public class Area_of_Rectangle{
    int length;
    int breadth;

    int getArea(){
        return length * breadth;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        int l = sc.nextInt();

        System.out.println("Enter the Breadth: ");
        int b = sc.nextInt();

        Area_of_Rectangle area = new Area_of_Rectangle();

        area.length = l ;       
        area.breadth = b;

        System.out.println("The area of Rectangle: " + area.getArea());

    }
}

