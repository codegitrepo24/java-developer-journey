package main.java.DSA.ARRAY;

import java.util.Scanner;

public class SetMatrixZeros {
    public static void setMatrixZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean isFirstRowZero = false;
        boolean isFirstColumnZero = false;

        // Check if first row should be zero
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                isFirstRowZero = true;
                break;
            }
        }

        // Check if first column should be zero
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                isFirstColumnZero = true;
                break;
            }
        }

        // Mark rows and columns to be zeroed
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Zero out marked rows and columns
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out the first row if needed
        if (isFirstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero out the first column if needed
        if (isFirstColumnZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the size of the matrix(rows and columns): ");
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("Enter the matrix elements: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            setMatrixZeroes(matrix);

            System.out.println("Modified Matrix: ");
            for (int[] row : matrix) {
                for (int cell : row) {
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }

}
