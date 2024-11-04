import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Rotate_Array {

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int d) {
        int n = arr.size();

        // Adjust d if it is larger than the size of the array
        d = d % n;

        // Rotate the array in three steps
        reverse(arr, 0, d - 1);         // Reverse the first part
        reverse(arr, d, n - 1);         // Reverse the second part
        reverse(arr, 0, n - 1);         // Reverse the entire array

        return arr;
    }

    // Helper function to reverse a section of the ArrayList
    private static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            Collections.swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");

        int t = sc.nextInt();
        while(t--> 0){
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println("Enter " + n + " elements:");
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }

            System.out.println("Enter the number of rotations: ");
            int k = sc.nextInt();

            ArrayList<Integer> result = rotateArray(arr, k);
            System.out.println("Rotated Array: " + result);
        }

        sc.close();
    }
}
