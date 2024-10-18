package Coding_Problems;

import java.util.Scanner;

public class Search_element_in_array {
  public static int linearSearch(int arr[], int x){
     // Traverse the array to search for the element 'x'
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==x){
            return i; // Return the index if the element is found
        }
    }
    return -1; // Return -1 if the element is not found

  } 

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Take input for the size of the array
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();

    // Initialize the array
    int[] arr = new int[n];

    // Take input for the elements of the array
    System.out.println("Enter " + n + " elements: ");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    // Take input for the element to search
    System.out.print("Enter the element to search : ");
    int x = sc.nextInt();

    // Call the linearSearch method and store the result
    int result = linearSearch(arr, x);

    // Print the result
    if(result != -1)
    {
        System.out.println("Element found at index: " + result);
    }else{
        System.out.println("Element not found in the array.");
    }

    sc.close();
  }
}
