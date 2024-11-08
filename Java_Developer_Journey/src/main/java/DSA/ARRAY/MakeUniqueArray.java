package main.java.DSA.ARRAY;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MakeUniqueArray {
    // Method to find the minimum number of elements to remove to make array
    // distinct
    public static int minRemovalsToMakeUnique(ArrayList<Integer> arr) {
        // Using a HashSet to store unique elements directly from the ArrayList
        HashSet<Integer> hs = new HashSet<>(arr); // This automatically removes duplicates

        // The number of elements to remove is the difference between the original size
        // and the unique size
        return arr.size() - hs.size(); // Size difference gives the number of duplicates to remove

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Read the size of the array
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                arr.add(scanner.nextInt()); // Read elements into the ArrayList
            }

            // Call the function to get the result
            System.out.println(minRemovalsToMakeUnique(arr));
        }
        scanner.close();
    }
}