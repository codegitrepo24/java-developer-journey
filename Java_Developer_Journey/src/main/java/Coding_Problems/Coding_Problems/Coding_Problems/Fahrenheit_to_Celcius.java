package Coding_Problems;


import java.util.Scanner;

public class Fahrenheit_to_Celcius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs for Start, End, and Step size
        int S = sc.nextInt(); // Start Fahrenheit temperature

        int E = sc.nextInt(); // End Fahrenheit temperature

        int W = sc.nextInt(); // Step size for incrementing temperature

        // Loop to iterate over the range [S, E] with increments of W
        for (int i = S; i <= E; i = i + W) {

            // Formula to convert Fahrenheit to Celsius: C = (F - 32) * 5 / 9
            float c = (i - 32.0f) * 5.0f / 9.0f;

            // Printing Fahrenheit and corresponding Celsius value (Celsius cast to int)
            System.out.println(i + " " + (int) c);
        }

        sc.close();

    }

}
