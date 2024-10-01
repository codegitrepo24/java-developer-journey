package main.java.Coding_Problem_Statement;

import java.util.Scanner;

class Calculate_Simple_Interest {

    /**Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.

Note: Return answer as Floor integer value.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
2000
2.2
4
Sample Output 1:
176
Explanation of Sample Input 1:
The input is principal=2000, rate=2.2 and time=4.
So Simple interest=Principal*rate*time/100 hence 
answer is 2000*2.2*4/100=176 **/
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