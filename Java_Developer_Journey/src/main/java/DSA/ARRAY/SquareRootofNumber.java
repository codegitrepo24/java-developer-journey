package main.java.DSA.ARRAY;

import java.util.Scanner;

public class SquareRootofNumber {
    // Function to calculate the square root using binary search
    public static int findSquareRoot(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");

        }

        // Edge case for n = 0 or n = 1
        if (n == 0 || n == 1) {
            return n;
        }

        int start = 1, end = n, result = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid * mid equals n
            if ((long) mid * mid == n) {
                return mid;
            }

            // If mid * mid is less than n, move to the right
            if ((long) mid * mid < n) {
                start = mid + 1;
                result = mid;// Store floor value
            } else {
                // If mid * mid is greater than n, move to the left
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcases: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the positive Integer :");
            int n = sc.nextInt();

            int sqrtValue = findSquareRoot(n);

            System.out.println("The floor value of the square root of " + n + " is: " + sqrtValue);
        }
        sc.close();
    }
}
