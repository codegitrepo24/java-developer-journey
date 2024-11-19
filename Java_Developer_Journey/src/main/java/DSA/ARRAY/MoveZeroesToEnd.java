package main.java.DSA.ARRAY;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void pushZeroesAtEnd(ArrayList<Integer> arr) {
        int n = arr.size();
        int index = 0; // Tracks the position to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr.get(i) != 0) {
                arr.set(index, arr.get(i));
                index++;
            }
        }

        // Fill the rest of the array with zeroes
        for (int i = index; i < n; i++) {
            arr.set(i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println("Enter the lements of tha array: ");
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            pushZeroesAtEnd(arr);

            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
