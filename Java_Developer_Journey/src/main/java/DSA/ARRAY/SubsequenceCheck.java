package main.java.DSA.ARRAY;
import java.util.Scanner;

class SubsequenceCheck {
    public static boolean isSubsequence(String str1, String str2) {

        int i = 0, j = 0;

        // Traverse both strings using two pointers
        while (i < str1.length() && j < str2.length()) {
            // If characters match, move the pointer for str1
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
            }
            // Always move the pointer for str2
            j++;
        }
        // If all characters of str1 were matched
        return i == str1.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the testcase: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter STR1");
            String str1 = sc.next();

            System.out.println("Enter STR2: ");
            String str2 = sc.next();

            if (!str1.matches("[A-Z]*") || !str2.matches("[A-Z]*")) {
                System.out.println("Invalid input. Strings must contain only uppercase English letters.");
                continue;
            }

            if (isSubsequence(str1, str2)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        sc.close();
    }
}