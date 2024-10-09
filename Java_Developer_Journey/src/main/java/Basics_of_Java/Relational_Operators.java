package main.java.Basics_of_Java;

import java.util.Scanner;

public class Relational_Operators {
    
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);

       // Input: Ask the user for the student's score
       System.out.println("Enter the student's score (0-100): ");
       int score = sc.nextInt();

        // Input: Ask the user for the passing score
        System.out.println("Enter the passing score: ");
        int passingScore = sc.nextInt();

        // 1. Check if the score is exactly equal to 100 (Perfect score)
        if(score == 100)
        {
            System.out.println("Congratulations! You got a perfect score!");
        }

        // 2. Check if the score is not equal to 100 (i.e., not a perfect score)
        if(score != 100)
        {
            System.out.println("Your score is not perfect, but still great!");
        }

        // 3. Check if the student passed (score greater than passingScore)
        if(score > passingScore)
        {
            System.out.println("You passed the exam!");
        }

        // 4. Check if the student failed (score less than passingScore)
        if(score < passingScore)
        {
            System.out.println("You fail the exam. Better luck next time!");
        }

        // 5. Check if the score is at least the passing score (greater than or equal to)
        if(score >= passingScore)
        {
            System.out.println("You have met the minimum requirement to pass");
        }

        // 6. Check if the score is less than or equal to the minimum passing score
        if(score <= passingScore)
        {
            System.out.println("You score is at or below the passing threshold.");
        }

        // Output grade classification based on the score

        if(score >= 90)
        {
            System.out.println("Your grade: A");
        }
        else if(score >= 80)
        {
            System.out.println("Your grade: B");
        }
        else if(score >= 70)
        {
            System.out.println("Your grade: C");
        }
        else if(score >= 60)
        {
            System.out.println("Your grade: D");
        }
        else
        {
            System.out.println("Your grade: F");
        }

        sc.close();

    }
}
