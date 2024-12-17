package main.java.DSA.String;

import java.util.Scanner;

public class MakeBeautifulBinaryString {
    public static int minOperationsToMakeBeautiful(String str) {
        int n = str.length();

        // To track the operations required for both patterns
        int opsPattern1 = 0; // For "010101..."
        int opsPattern2 = 0; // For "101010..."

        for (int i = 0; i < n; i++) {

            // Expected character for "010101..."
            char expectedCharPattern1 = (i % 2 == 0) ? '0' : '1';

            // Expected character for "101010..."
            char expectedCharPattern2 = (i % 2 == 0) ? '1' : '0';

            // Count mismatch for "010101..."
            if (str.charAt(i) != expectedCharPattern1) {

                opsPattern1++;
            }

            // Count mismatch for "101010..."
            if (str.charAt(i) != expectedCharPattern2) {
                opsPattern2++;
            }
        }

        // Minimum operations required between the two patterns
        return Math.min(opsPattern1, opsPattern2);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        while(T --> 0){
            System.out.println("Enter the binary string: ");
            String str = sc.next();
            System.out.println("So, the beautiful string is: " + minOperationsToMakeBeautiful(str));
        }
    }
}
