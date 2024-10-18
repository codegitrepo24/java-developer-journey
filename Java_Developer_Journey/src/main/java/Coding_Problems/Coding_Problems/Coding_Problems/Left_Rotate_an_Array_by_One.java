import java.util.Scanner;

/**
 * Left_Rotate_an_Array_by_One
 */
public class Left_Rotate_an_Array_by_One {

    public static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0]; // Store the first element temporarily
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i]; // Shift each element to the left by one position
        }

        arr[n - 1] = temp; // Place the first element at the end

        return arr; // Return the rotated array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input: Elements of the array
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Rotate the array
        arr = rotateArray(arr, n);

        // Output: Print the rotated array
        System.out.println("Array after rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}