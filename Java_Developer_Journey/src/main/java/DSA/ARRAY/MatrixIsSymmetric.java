package main.java.DSA.ARRAY;
import java.util.Scanner;

public class MatrixIsSymmetric {
    public static boolean isMatrixSymmetric(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter the size of the Matrix: ");
            int n = sc.nextInt();

            int[][] matrix = new int[n][n];

            System.out.println("Enter the elements in matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    matrix[i][j] = sc.nextInt();

                }
            }

            boolean isMatrixSymmetric = isMatrixSymmetric(matrix, n);

            System.out.println(isMatrixSymmetric ? "The matrix is symmetric." : "The matrix is not symmetric.");
        }

        sc.close();
    }
}