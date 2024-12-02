package main.java.DSA.ARRAY;

import java.util.Scanner;

public class SpiralMatrix {
    public static void printSpiral(int[][] Matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right on the top row
            for (int i = left; i <= right; i++) {

                System.out.print(Matrix[top][i] + " ");
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom on the rightmost column
            for (int i = top; i <= bottom; i++) {
                System.out.print(Matrix[i][right] + " ");
            }
            right--;// Move the right boundary to the left

            // Traverse from right to left on the bottom row (if any)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(Matrix[bottom][i] + " ");
                }
                bottom--; // Move the bottom boundary up
            }

            // Traverse from bottom to top on the leftmost column (if any)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(Matrix[i][left] + " ");
                }
                left++; // Move the left boundary to the right
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            printSpiral(matrix, rows, cols);
            System.out.println();
        }
        sc.close();
    }
}
