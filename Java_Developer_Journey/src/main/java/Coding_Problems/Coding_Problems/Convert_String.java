package Coding_Problems;

import java.util.Scanner;

/**
 * Convert_String
 */
public class Convert_String {

    public static String convertToString(String str) {
        // Trim the input string and split it into words
        String[] ar = str.trim().split(" "); // str.trim(): Removes any leading or trailing spaces from the input string
                                             // to ensure that unnecessary spaces don’t affect word processing.
                                             // split(" "): Splits the trimmed string into an array of words using
                                             // spaces as the delimiter.

        // Loop through each word to capitalize the first letter
        for (int i = 0; i < ar.length; i++) {
            // ar[i] = Character.toLowerCase(ar[i].charAt(0)) + ar[i].substring(1); //
            // -----> To convert first character in lowercase

            // ar[i].charAt(0): Fetches the first character of the current word.
            // Character.toUpperCase(): Converts that first character to uppercase.
            // substring(1): Extracts the rest of the word starting from the second
            // character (index 1) to the end.

            ar[i] = Character.toUpperCase(ar[i].charAt(0)) + ar[i].substring(1); // -----> To convert first charcter in
                                                                                 // uppercase
        }

        // Join the words back into a single string with spaces
        // String.join(" ", ar): Joins all the words back together into a single string
        // with spaces between them.
        return String.join(" ", ar);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        // Read the entire line of input from the user
        String input = sc.nextLine();

        // Call the convertString method and display the result
        String result = convertToString(input);

        System.out.println("Converted String: " + result);

        // Close the Scanner
        sc.close();
    }
}