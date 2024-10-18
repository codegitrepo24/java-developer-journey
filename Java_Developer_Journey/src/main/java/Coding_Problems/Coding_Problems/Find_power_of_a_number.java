package Coding_Problems;

import java.util.Scanner;

public class Find_power_of_a_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number =  ");
        int x = sc.nextInt();
        System.out.print("Enter the power = ");
        int n = sc.nextInt();
        long power = x;

        if(n == 0)
        {
            System.out.println(1);
        }
        else{
            for(int i = 1; i<n; i++)
            {
                power = power * x;
            }
        }
        System.out.println("So, the answer is = " + power);
        sc.close();
    }
}