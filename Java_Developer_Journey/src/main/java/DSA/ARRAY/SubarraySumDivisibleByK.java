package main.java.DSA.ARRAY;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarraySumDivisibleByK {
    public static int countSubarrays(int[] arr, int k) {
        // Initialize a map to store remainders and their frequencies
        Map<Integer, Integer> remainderFreq = new HashMap<>();
        remainderFreq.put(0, 1); // To handle prefix sums that are directly divisible by K

        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {
            // Update the prefix sum
            prefixSum += num;

            // Compute the remainder when divided by K
            int remainder = prefixSum % k;

            // Handle negative remainders (adjust to positive)
            if (remainder < 0) {
                remainder += k;
            }

            // If this remainder has been seen before, it contributes to the count
            count += remainderFreq.getOrDefault(remainder, 0);

            // Update the frequency of the current remainder
            remainderFreq.put(remainder, remainderFreq.getOrDefault(remainder, 0) + 1);

        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Size of the array
            int k = sc.nextInt(); // Divisor

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(countSubarrays(arr, k));
        }
        sc.close();
    }
}
