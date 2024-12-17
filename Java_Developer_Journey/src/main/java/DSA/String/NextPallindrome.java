package main.java.DSA.String;

import java.util.Scanner;

public class NextPallindrome {
    // Function to check if a string is palindrome
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Function to generate the next Palindrome
    public static String nextPalindrome(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();

        // Step 1: Mirror the first half to create the candiadte palindrome

        for (int i = 0; i < n / 2; i++) {
            chars[n - 1 - i] = chars[i]; // Mirror left to right
        }

        // Step 2: Check if the candidate palindrome is greater than the input
        String candidate = new String(chars);
        if (candidate.compareTo(s) > 0) {
            return candidate; // if valid, return it
        }

        // Step 3: Increment the middle part and handle carry
        int mid = n / 2;
        boolean isOddLength = (n % 2 != 0);

        // Start incrementing from the middle
        int carry = 1;
        for (int i = mid - 1; i >= 0; i--) {
            int digit = chars[i] - '0' + carry;
            carry = digit / 10;
            chars[i] = (char) ((digit % 10) + '0');
            chars[n - 1 - i] = chars[i]; // Maintain palindrome property
        }

        // If there is still a carry (e.g., 999 -> 1001 case)
        if (carry > 0) {
            StringBuilder result = new StringBuilder("1");
            for (int i = 1; i < n; i++) {
                result.append("0");
            }
            result.append("1");
            return result.toString();
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            int len = sc.nextInt(); // Length of the number
            String s = sc.next(); // Number as a string
            System.out.println(nextPalindrome(s));
        }
        sc.close();
    }

}
