import java.util.Scanner;

public class CheckPalindrome {

    public static boolean isPalindrome(String str) {
        // Clean the input string: remove non-alphanumeric characters and convert to lowercase
       str = str.replaceAll("[^a-zA-z0-9]", "").toLowerCase();

       // Initialize two pointers: one at the beginning and one at the end of the string
       int left = 0;
       int right = str.length() - 1;

       // Compare characters while moving the pointers towards each other
       while(left < right){
        if(str.charAt(right) != str.charAt(left)){
            return false; // If any mismatch is found, it's not a palindrome
        }

        left++; // Move the left pointer to the right
        right--; // Move the right pointer to the left
       }

       // If no mismatches were found, return true (it's a palindrome)
       return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for(int i=0; i<t; i++){
             // Prompt the user to enter a string
            System.out.println("Enter a string to check if it's a pallindrome: ");
            String str = sc.nextLine();

            // Check if the input string is a palindrome and display the result
            if(isPalindrome(str)){
                System.out.println("Yes, it's a palindrome.");

            }else{
                System.out.println("No, it's not a palindrome.");
            }
        }
        // Close the scanner
        sc.close();
    }
    
}
