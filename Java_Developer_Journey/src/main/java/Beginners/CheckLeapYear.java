// Write a program to check if a year is a leap year or not.
import java.util.Scanner;
public class CheckLeapYear {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = sc.nextInt();

    if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
        System.out.println("Year is a leap year = " + year);
        
    }else{
        System.out.println("Year is not a leap year = " + year);
    }

    sc.close();
   } 
}
