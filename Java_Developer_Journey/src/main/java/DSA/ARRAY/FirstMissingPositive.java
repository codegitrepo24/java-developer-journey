package main.java.DSA.ARRAY;

import java.util.Scanner;

public class FirstMissingPositive {
    public static int findMissing(int[] arr, int n) {
        boolean contains1 = false;

        // Step 1: Check for presence of 1 and replace invalid elements with 1
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                contains1 = true;
            }

            // Replace irrelevant values with 1
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = 1;
            }
        }

        // If 1 is not present, it's the smallest missing positive integer
        if (!contains1)
            return 1;

        // Step 2: Mark presence by negating values at corresponding indices
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            int index = num - 1;
            if (arr[index] > 0) {
                arr[index] = -arr[index];
            }
        }

        // Step 3: Identify the first missing positive by checking for the first
        // positive index
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        // If all numbers 1 to n are present, return n + 1
        return n + 1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the number of test cases
        System.out.print("Enter the test cases: ");
        int T = sc.nextInt();

        while (T-- > 0) {
            // Take the size of the array
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            // Take the array elements as input
            System.out.println("Enter the array elements: ");
            {
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            // Find and print the first missing positive integer
            int result = findMissing(arr, n);
            System.out.println("The first missing positive intger is: " + result);
        }

        sc.close();

    }
}