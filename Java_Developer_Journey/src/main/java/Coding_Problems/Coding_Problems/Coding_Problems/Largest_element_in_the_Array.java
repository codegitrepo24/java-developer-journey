package Coding_Problems;

import java.util.Scanner;

/***** Algorithm ********/
/*
Reading Input:

 - First, we read the size of the array n.
 - Then, we store the elements of the array in arr[].
   Finding the Largest Element:

Initialize largest with the first element of the array.
 - Iterate through the array from the second element to the end.
 - If any element is greater than largest, update largest with that value.

 Output:

 - Print the largest element found. 
*/

public class Largest_element_in_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of Array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input the array elements
        System.out.print("Enter the array elments = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the largest element in the array
        int largest = arr[0];
        for (int i = 1; i < n; i++) // Initialize with the first element
        {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            }
        }

        // Output the largest element
        System.out.println("Largest Element in the Array: " + largest);
        sc.close();

    }


}
