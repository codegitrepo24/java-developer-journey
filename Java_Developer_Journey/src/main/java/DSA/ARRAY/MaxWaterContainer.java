package main.java.DSA.ARRAY;

import java.util.Scanner;

public class MaxWaterContainer {
    public static int maxArea(int[] height) {
        // Initialize two pointers at the beginning and end of the array
        int left = 0, right = height.length - 1;
        int maxArea = 0; // Variable to store the maximum area

        // Use a two-pointer approach to calculate the area
        while (left < right) {
            // Calculate the width between the two lines
            int width = right - left;

            // Calculate the area considering the shorter of the two heights
            int currentArea = Math.min(height[left], height[right]) * width;

            // Update the maximum area if the current one is larger
            maxArea = Math.max(currentArea, maxArea);

            // Move the pointer of the shorter line inward to try a potentially larger area
            if (height[left] < height[right]) {
                left++;

            } else {

                right--;
            }

        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] heights = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                heights[i] = sc.nextInt();
            }

            int result = maxArea(heights);
            System.out.println("Maximum water area: " + result);
        }
        sc.close();
    }
}
