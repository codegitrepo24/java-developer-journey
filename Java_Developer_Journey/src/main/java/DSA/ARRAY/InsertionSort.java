package main.java.DSA.ARRAY;

import java.util.Scanner;

class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int key = arr[i];

            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the testCase: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            insertionSort(arr);

            for (int num : arr) {
                System.out.print(num + " ");
            }

            System.out.println();
        }

        sc.close();
    }

}