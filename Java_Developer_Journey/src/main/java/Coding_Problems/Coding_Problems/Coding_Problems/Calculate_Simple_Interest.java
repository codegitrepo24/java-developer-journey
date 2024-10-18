package Coding_Problems;

import java.util.Scanner;

class Calculate_Simple_Interest {

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int principal = sc.nextInt();
    float rate = sc.nextFloat();
    int time = sc.nextInt();
    
    int simple_interest = (int)((principal*rate*time)/100);
    
    System.out.println(simple_interest);

    sc.close();
}

    
}