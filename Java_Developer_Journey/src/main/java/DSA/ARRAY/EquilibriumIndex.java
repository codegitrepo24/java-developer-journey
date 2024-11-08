package main.java.DSA.ARRAY;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquilibriumIndex {
    // Function to find the equilibrium index in a single array
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0; // Calculate total sum of array
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0; // Initialize left sum as 0
        for (int i = 0; i < arr.length; i++) {
            // Calculate right sum by subtracting left sum and the current element from
            // total sum
            int rightSum = totalSum - leftSum - arr[i];

            // Check if left sum equlas right sum
            if (leftSum == rightSum) {
                return i; // Return index if it is an equilibrium index
            }

            // Update left sum by adding the current element
            leftSum += arr[i];
        }

        return -1; // If no equilibrium index found, return -1

    }

    // Function to handle multiple test cases
    public static List<Integer> equilibriumIndexForMultipleCases(List<int[]> testCases) {
        List<Integer> results = new ArrayList<>();
        for (int[] arr : testCases) {
            results.add(findEquilibriumIndex(arr));
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        System.out.print("Enter the number of testcases: ");
        int T = sc.nextInt();
        List<int[]> testCases = new ArrayList<>();

        // Input arrays for each test case
        for (int t = 0; t < T; t++) {
            System.out.print("Enter the size of array: ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            System.out.println("Enter the elements of array: ");
            for (int i = 0; i < N; i++) {

                arr[i] = sc.nextInt();
            }

            testCases.add(arr);
        }
        // Get results for all test cases
        List<Integer> results = equilibriumIndexForMultipleCases(testCases);

        // Output results
        for (int result : results) {
            System.out.println(result);
        }

        sc.close();
    }

}