package main.java.DSA.ARRAY;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfArrays {

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        // Initialize result list to store the intersection
        ArrayList<Integer> intersection = new ArrayList<>();
        // Two pointers for arr1 and arr2
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                // If arr1[i] is smaller, move pointer i
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                // If arr2[j] is smaller, move pointer j
                j++;
            } else {
                // If both are equal, add to the result and move both pointers
                intersection.add(arr1.get(i));
                i++;
                j++;
            }
        }
        return intersection;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of test cases
        System.out.println("Enter the number of test cases: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            // Input first array
            System.out.println("Test case #" + (t + 1) + ":");
            System.out.println("Enter the size of the first array: ");
            int n = sc.nextInt();
            ArrayList<Integer> arr1 = new ArrayList<>();
            System.out.println("Enter elements of the first sorted array: ");
            for (int i = 0; i < n; i++) {
                arr1.add(sc.nextInt());
            }

            // Input second array
            System.out.println("Enter the size of the second array: ");
            int m = sc.nextInt();
            ArrayList<Integer> arr2 = new ArrayList<>();
            System.out.println("Enter elements of the second sorted array: ");
            for (int i = 0; i < m; i++) {
                arr2.add(sc.nextInt());
            }

            // Find the intersection
            ArrayList<Integer> result = findArrayIntersection(arr1, n, arr2, m);

            // Output the result
            System.out.println("Intersection of the two arrays: ");
            if (result.isEmpty()) {
                System.out.println("-1");
            } else {
                for (int num : result) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
