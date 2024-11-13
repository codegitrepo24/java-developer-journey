package main.java.DSA.ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
    public static int pairSum(int[] arr, int target) {
        // Sort the array (if not already sorted)
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;
        int count = 0;

        // Two-pointer approach
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                // Found a pair
                count++;
                i++;
                j--;
            } else if (sum < target) {
                // Increase the left pointer to get a larger sum
                i++;
            } else {
                // Decrease the right pointer to get a smaller sum
                j--;
            }
        }
        // If no pairs found, return -1
        return count == 0 ? -1 : count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase: ");

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the size of the array and target sum: ");
            int n = sc.nextInt();
            int target = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = pairSum(arr, target);

            if (result == -1) {
                System.out.println("No pairs with sum equal to " + target);
            } else {
                System.out.println("Number of pairs with sum equal to " + target + ": " + result);
            }

        }
        sc.close();
    }
}