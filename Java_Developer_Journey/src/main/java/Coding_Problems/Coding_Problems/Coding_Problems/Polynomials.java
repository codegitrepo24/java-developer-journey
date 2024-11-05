import java.util.Scanner;

public class Polynomials {
    // Method to multiply two polynomials and return the result as an array of
    // coefficients
    public static int[] multiplyPolynomial(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] result = new int[n + m - 1]; // Resultant array size will be (n + m - 1)

        // Multiply each term of A with each term of B and store it in the result array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i + j] += A[i] * B[j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int T = sc.nextInt();

        // Loop through each test case
        for (int t = 0; t < T; t++) {
            // Size of the first polynomial
            System.out.print("Enter size of the first polynomial: ");
            int n = sc.nextInt();
            int[] A = new int[n];
            System.out.print("Enter coefficients of the first polynomial: ");
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            // Size of the second polynomial
            System.out.print("Enter size of the second polynomial: ");
            int m = sc.nextInt();
            int[] B = new int[m];
            System.out.print("Enter coefficients of the second polynomial: ");
            for (int i = 0; i < m; i++) {
                B[i] = sc.nextInt();
            }

            // Multiply the polynomials
            int[] result = multiplyPolynomial(A, B);

            // Print the result
            System.out.print("Resulting polynomial coefficients: ");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
