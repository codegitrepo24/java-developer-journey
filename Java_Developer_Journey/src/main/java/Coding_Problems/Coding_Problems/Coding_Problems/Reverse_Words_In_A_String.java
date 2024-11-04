
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_Words_In_A_String {

    public static String reverseWords(String str){
        // Step 1: Trim leading and trailing spaces
        str = str.trim();

        // Step 2: Split the string by spaces
        String[] words = str.split("\\s+"); // Regex ensures multiple spaces are ignored

        // Step 3: Reverse the array of words
        Collections.reverse(Arrays.asList(words));

        // Step 4: Join the reversed words with a single space
        return String.join(" ", words);


    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the test cases: ");
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=t;i++){
            System.out.println("Enter the string: ");
            String str = sc.nextLine();
            System.out.println("Reversed string: " + reverseWords(str));
        }

        sc.close();
    }
}
