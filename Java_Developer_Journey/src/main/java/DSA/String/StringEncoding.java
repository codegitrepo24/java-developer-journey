package main.java.DSA.String;

import java.util.Scanner;

public class StringEncoding {
    public static String getRunLengthEncoding(String message) {
        StringBuilder encoded = new StringBuilder(); // To build the encoded string
        int n = message.length();

        for (int i = 0; i < n;) {
            char currentChar = message.charAt(i);
            int count = 0;

            // Count the consecutive occurrences of the current character
            while (i < n && message.charAt(i) == currentChar) {
                count++;
                i++;
            }

            // Append the character and its count to the encoded string
            encoded.append(currentChar).append(count);
        }

        return encoded.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the newline

        while (T-- > 0) {
            String message = scanner.nextLine();
            System.out.println(getRunLengthEncoding(message));
        }
        scanner.close();
    }
}
