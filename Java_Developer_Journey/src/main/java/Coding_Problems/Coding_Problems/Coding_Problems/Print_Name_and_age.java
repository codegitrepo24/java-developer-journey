package Coding_Problems;

import java.util.Scanner;

/**
 * Print_Name_and_age
 */
public class Print_Name_and_age {

    private String name;
    private int age;

    public void getValue(){
        System.out.println("The name of the person is "+name+" and the age is "+age+".");
    }

    public void setValue(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();

        Print_Name_and_age person = new Print_Name_and_age();
        person. setValue(name,age);
        person.getValue();

        sc.close();
    }
}