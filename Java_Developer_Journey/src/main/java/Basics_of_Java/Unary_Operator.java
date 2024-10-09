package main.java.Basics_of_Java;

import java.util.Scanner;

public class Unary_Operator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        int totalTasks = 0; // Initialize task counter to 0
        boolean tasksCompleted = false; // Track if tasks are marked as completed
    
        System.out.println("Starting the day with " + totalTasks + "tasks completed.");

        while(true)
        {
            System.out.println("\nChoose an action: ");
            System.out.println("1. Complete a task (pre-increment)");
            System.out.println("2. Skip a task (pre-decrement)");
            System.out.println("3. Undo the last task (post-increment)");
            System.out.println("4. Complete an additional task (post-increment)");
            System.out.println("5. Check if the task count is positive using unary plus");
            System.out.println("6. Negate the tassk count using unary minus");
            System.out.println("7. Toggle task completion status");
            System.out.println("8. Exit the program");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                // Pre-increment: Complete a task
                System.out.println("Completing a task...");
                System.out.println("Tasks after pre-increment (++totalTasks): " + ++totalTasks); 
                break;
                case 2:
                // Pre-decrement: Skip a task
                System.out.println("Skipping a task...");
                System.out.println("Tasks after pre-decrement (--totalTasks): " + --totalTasks); 
                break;
            case 3:
                // Post-decrement: Undo a task
                totalTasks--;
                System.out.println("Undid a task (post-decrement totalTasks--). Total tasks: " + totalTasks);
                break;
            case 4:
                // Post-increment: Complete another task
                totalTasks++;
                System.out.println("Completed another task (post-increment totalTasks++). Total tasks: " + totalTasks);
                break;
            case 5:
                // Unary Plus: Check if task count is positive
                System.out.println("Using unary plus to check if tasks are positive: " + +totalTasks);
                break;
            case 6:
                // Unary Minus: Negate the task count
                int negatedTasks = -totalTasks;
                System.out.println("Negating task count with unary minus (-totalTasks): " + negatedTasks);
                break;
            case 7:
                // Logical complement operator: Toggle task completion status
                tasksCompleted = !tasksCompleted;
                System.out.println("Are all tasks completed? " + tasksCompleted);
                break;
            case 8:
                // Exit the program
                System.out.println("Exiting the program. Total tasks completed today: " + totalTasks);
                sc.close();
                return;
            default:
                System.out.println("Invalid choice, please try again.");
            
                
            }
        }
    }

}
