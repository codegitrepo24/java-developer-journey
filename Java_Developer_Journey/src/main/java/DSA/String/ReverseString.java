package main.java.DSA.String;

import java.util.Scanner;

public class ReverseString {
    public static String reverseWords(String str) {
        // Trim any leading/trailing spaces
        str = str.trim();

        // Split the string into words using space as a delimiter
        String[] words = str.split("\\s+");

        // Use a StringBuilder to reverse the words
        StringBuilder reversed = new StringBuilder();

        // Traverse the array from the end
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);

            // Add a space if it's not the last word
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        String ans = reverseWords(input);

        System.out.println("Reversed String: " + ans);
        sc.close();
    }
}
