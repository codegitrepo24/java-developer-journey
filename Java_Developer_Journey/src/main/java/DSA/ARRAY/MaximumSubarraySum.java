import java.util.Scanner;

class MaximumSubarraySum {
    public static int findMaxSubArraySum(int[] arr, int n) {
        // Initialize variables to track current sum and maximum sum
        int currentSum = 0;
        int maxSum = 0;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];// Add the current element to the current sum

            // If the current sum exceeds maxSum, update maxSum
            maxSum = Math.max(maxSum, currentSum);

            // If current sum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxSum = findMaxSubArraySum(arr, n);
            System.out.println("Maximum subarray sum: " + maxSum);
        }

        sc.close();
    }
}