package Coding_Problems;
import java.util.Scanner;

/**
 * Check_Sorted_Array
 */
public class Check_Sorted_Array {

    public static int isSorted(int n, int[] a)
    {
        for(int i=0; i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        int result = isSorted(n, a);

        if(result==1)
        {
            System.out.println("The array is sorted.");
        }else{
            System.out.println("The array is not sorted.");
        }

        sc.close();
    }
}
