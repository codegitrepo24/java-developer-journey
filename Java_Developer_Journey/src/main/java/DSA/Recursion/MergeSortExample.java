package main.java.DSA.Recursion;

import java.util.*;

public class MergeSortExample {

    // Function to merge two sorted halves into a single sorted array
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; // Size of left half
        int n2 = right - mid;    // Size of right half

        // Create temporary arrays for the two halves
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // Merge the temp arrays back into the original array
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr, if any
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr, if any
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Recursive function to implement merge sort
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort the two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();
        while (T-- > 0) {
            // Input size of the array
            int N = sc.nextInt();
            int[] arr = new int[N];

            // Input array elements
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // Perform merge sort
            mergeSort(arr, 0, N - 1);

            // Print the sorted array
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
