package main.java.DSA.ARRAY;

import java.util.Scanner;

public class SumOfZeroes {
    public static int getTotalZeroCoverage(int[][] matrix, int N, int M) {
        // Define directions for neighbors (up, down, left, right)
        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        int totalCoverage = 0;

        // Traverse each element in the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // Check if the element is zero
                if (matrix[i][j] == 0) {
                    int coverage = 0;

                    // Check each neighbor (up, down, left, right)
                    for (int[] direction : directions) {
                        int ni = i + direction[0];
                        int nj = j + direction[1];

                        // Check if neighbor is within bounds and is 1
                        if (ni >= 0 && ni < N && nj >= 0 && nj < M && matrix[ni][nj] == 1) {
                            coverage++;
                        }
                    }
                    // Add the coverage of this 0 to the total
                    totalCoverage += coverage;
                }
            }
        }
        return totalCoverage;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases

        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();  // Number of rows
            int M = sc.nextInt();  // Number of columns
            int[][] matrix = new int[N][M];


            // Read the matrix
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Calculate and print result for the current test case
            int result = getTotalZeroCoverage(matrix, N, M);
            System.out.println(result);
        }
        sc.close();
    }
}