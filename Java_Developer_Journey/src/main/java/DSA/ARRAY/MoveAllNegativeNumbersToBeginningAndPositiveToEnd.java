package main.java.DSA.ARRAY;

import java.util.Scanner;

public class MoveAllNegativeNumbersToBeginningAndPositiveToEnd {
    public static void rearrangeArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {

            // Move low forward if it's negative
            if (arr[low] < 0) {
                low++;
            }

            // Move high backward if it's positive
            else if (arr[high] > 0) {
                high--;
            }

            // Swap when low points to a positive and high points to a negative
            else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the size of the array:");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Rearrange the array
            rearrangeArray(arr);

            // Output the result
            System.out.println("Rearranged array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println("\nYes"); // As per problem statement output format
        }

        sc.close();

    }
}
