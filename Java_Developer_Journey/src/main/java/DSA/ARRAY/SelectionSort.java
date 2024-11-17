package main.java.DSA.ARRAY;

import java.util.Scanner;

class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int index = i;
            // Start inner loop from i + 1 to find the smallest element in the remaining
            // unsorted part
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[j] < arr[index]) {
                    index = j; // Update the index of the minimum element
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            selectionSort(arr);

            System.out.println("Sorted Array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}