package main.java.DSA.ARRAY;

import java.util.Scanner;

public class SearchInRoatatedSortedArray {

    public static int serach(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int m = (low + high) / 2;// Calculate the middle index

            // Check if the middle element is the key
            if (arr[m] == key) {
                return m;
            }

            // Check if the left half is sorted
            if (arr[low] <= arr[m]) {
                // Check if the key lies within the sorted left half
                if (key >= arr[low] && key < arr[m]) {
                    high = m - 1; // Narrow down to the left half
                } else {
                    low = m + 1; // Shift to the right half
                }
            } else {
                // If the right half is sorted
                if (key > arr[m] && key <= arr[high]) {
                    low = m + 1; // Narrow down to the right half
                } else {
                    high = m - 1; // Shift to the left half
                }
            }
        }

        // If key is not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the number of queries: ");
            int q = sc.nextInt();
            while (q-- > 0) {
                System.out.println("Enter the key to search: ");
                int key = sc.nextInt();
                int result = serach(arr, key);
                if (result != -1) {
                    System.out.println("Key found at index: " + result);
                } else {
                    System.out.println("Key not found!");
                }
            }

        }
        sc.close();
    }
}