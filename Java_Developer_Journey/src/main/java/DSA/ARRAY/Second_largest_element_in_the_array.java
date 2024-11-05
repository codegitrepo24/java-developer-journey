package main.java.DSA.ARRAY;

import java.util.Scanner;

public class Second_largest_element_in_the_array {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;

        // Traverse through the array to find the largest and second largest
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // If secondLargest remains Integer.MIN_VALUE, it means no second largest
        // element exists
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the test case: ");

        // Input number of test cases
        int T = sc.nextInt();

        // Loop through each test case
        for (int t = 0; t < T; t++) {
            // Input the number of elements in the array
            System.out.println("Enter the size of array: ");
            int N = sc.nextInt();
            int[] arr = new int[N];

            // Input array elements
            System.out.println("Enter the array element: ");
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // Find and print the second largest element for each test case
            int secondLargest = findSecondLargest(arr);
            System.out.println(secondLargest);
        }

        sc.close();

    }
}