import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Sort the array
        Arrays.sort(a);

        // Get the second largest and second smallest elements
        int secondLargest = a[n - 2];
        int secondSmallest = a[1];

        return new int[]{secondLargest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        sc.close();

        if (n < 2) {
            System.out.println("Array should have at least 2 elements.");
            return;
        }

        // Input: Array elements
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Get the second largest and second smallest elements
        int[] result = getSecondOrderElements(n, a);

        // Output: Second largest and second smallest elements
        System.out.println("Second Largest: " + result[0]);
        System.out.println("Second Smallest: " + result[1]);
    }
}
