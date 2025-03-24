// Write a program to print the multiplication table of a given number.
import java.util.Scanner;
public class PrintMultiTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println("Multiplication Table  = " + num + " * " + (i+1) + " = " + (num*(i+1)));
        }

        sc.close();
    }
}
