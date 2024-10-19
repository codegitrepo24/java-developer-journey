import java.util.Scanner;

/**
 * Binary_Search
 */
public class Binary_Search {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid; // Target found at index 'mid'

            } else if (nums[mid] > target) {
                end = mid - 1; // Move to the left half
            } else {
                start = mid + 1; // Move to the right half
            }

        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input: Array elements
        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted integers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input: Target element to search
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        // Perform binary search
        int result = search(nums, target);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in array");
        }

        sc.close();
        ;
    }

}