package main.java.DSA.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

     // Function to find the first unique character in a string
    public static char firstUniqueCharacter(String str){

        // Step 1: Create a LinkedHashMap to maintain order and frequency

        LinkedHashMap<Character, Integer> charFrequency = new LinkedHashMap<>();

        // Step 2: Count the frequency of each character
        for (char ch : str.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        // Step 3: Traverse the LinkedHashMap to find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // Return the first unique character
            }
        }

        // Step 4: If no unique character is found, return the first character of the string
        return str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of test cases
        int T = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        // Process each test case
        while (T-- > 0) {
            String str = sc.nextLine(); // Input the string
            char result = firstUniqueCharacter(str);
            System.out.println(result); // Output the result
        }
        sc.close();
    }
}


