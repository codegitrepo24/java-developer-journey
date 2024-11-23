package main.java.DSA.ARRAY;

import java.util.Scanner;

public class MajorityElement {
    public static int findMajorityElement(int[] arr, int n) {
        // Step 1: Candidate Selection
        int candidate = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;

            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Candidate Verification
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int T = sc.nextInt();

        while (T-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = findMajorityElement(arr, n);
            System.out.println("Majority Element: " + result);
        }

        sc.close();
    }
}
