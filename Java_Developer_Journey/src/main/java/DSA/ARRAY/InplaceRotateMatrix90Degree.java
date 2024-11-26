package main.java.DSA.ARRAY;

import java.util.Scanner;

class InplaceRotateMatrix90Degree {
    public static void rotateMatrix(int[][] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            // Rotate the matrix in-place
            // ***n-1-i****: --> This gives the position of the row index from the bottom of
            // the matrix.
            // --> If i is the current row index from the top 𝑛−1−𝑖 n−1−i represents the
            // corresponding row index from the bottom.

            // *** n-1-j***:This gives the position of the column index from the right of the
            // matrix.
            // If 𝑗 j is the current column index from the left, 𝑛 − 1 − 𝑗 n−1−j
            // represents the corresponding column index from the right.*/

            for (int j = i; j < n - i - 1; j++) {
                // Swap elements in a cyclic manner
                int temp = arr[i][j];
                arr[i][j] = arr[j][n - 1 - i];
                arr[j][n - 1 - i] = arr[n - 1 - i][n - 1 - j];
                arr[n - 1 - i][n - 1 - j] = arr[n - 1 - j][i];
                arr[n - 1 - j][i] = temp;
            }

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        for(int t=0;t<T;t++){
            System.out.println("Enter the size of the matrix (nxn): ");
            int n = sc.nextInt();

            int[][] arr = new int[n][n];

            System.out.println("Enter the matrix elements row-wise: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            rotateMatrix(arr, n);

            System.out.println("Rotated Matrix: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();

    }
}