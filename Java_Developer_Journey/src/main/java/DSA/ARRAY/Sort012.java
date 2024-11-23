package main.java.DSA.ARRAY;

import java.util.Scanner;

public class Sort012 {
    public static void sortArray(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp2 = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp2;
                high--;
            }
        }
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

            sortArray(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");

            }
            System.out.println();
        }
        sc.close();
    }
}
