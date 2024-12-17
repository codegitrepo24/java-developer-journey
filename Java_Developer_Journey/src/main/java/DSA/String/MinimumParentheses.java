package main.java.DSA.String;

import java.util.Scanner;

public class MinimumParentheses {
    public static int minAddToMakeValid(String pattern){
        int open = 0; // To track unbalanced opening parentheses '('
        int close = 0; // To track unbalanced closing parentheses ')'

        for(char c : pattern.toCharArray()){
            if(c == '('){
                open++; // Count unbalanced '('
            }else{
                if(open > 0){
                    open--; // Match a ')' with a previously unmatched '('
                }else{
                    close++; // Count unmatched ')'
                }
            }
        }

        // Total unmatched parentheses are the sum of unmatched '(' and ')'
        return open + close;
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the newline

        while (T-- > 0) {
            String pattern = scanner.nextLine();
            System.out.println(minAddToMakeValid(pattern));
        }
        scanner.close();
    }
}
