package main.java.DSA.ARRAY;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestZeroSumSubarray {

    public static int longestZeroSumSubarray(int[] arr, int n) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            // If prefix sum is zero, update maxLength
            if (prefixSum == 0) {
                maxLength = i + 1;
            }

            // If prefix sum is seen before, calculate the subarray length
            if (prefixMap.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - prefixMap.get(prefixSum));
            } else {
                // Store the first occurrence of the prefix sum
                prefixMap.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        while (T-- > 0) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements in the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = longestZeroSumSubarray(arr, n);

            System.out.println("The length of the longest zero sum sub array: " + result);

        }
        sc.close();
    }
}
