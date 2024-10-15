package main.java.Basics_of_Java;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Arrays to store student information
        String[] names = new String[n];
        int[] rollNumbers = new int[n];
        char[] grades = new char[n];

        // Step 2: Input student details
        System.out.println("\n---- Enter Student Details ----");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter roll number of student " + (i + 1) + ": ");
            rollNumbers[i] = sc.nextInt();

            System.out.print("Enter grade of student " + (i + 1) + " (A/B/C/D/F): ");
            grades[i] = sc.next().charAt(0);
            sc.nextLine(); // Consume the newline
        }

        System.out.println("\n----Search Menu ----");
        System.out.println("1. Search by Name: ");
        System.out.println("2. Search by Roll Number");
        System.out.println("3. Search by Grade");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline

        switch (choice) {
            case 1:
                // Linear search by Name
                System.out.print("Enter the name to search: ");
                String searchName = sc.nextLine();
                searchByName(names, rollNumbers, grades, searchName);
                break;

            case 2:
                System.out.print("Enter the roll number to search: ");
                int searchRoll = sc.nextInt();
                searchByRollNumber(names, rollNumbers, grades, searchRoll);
                break;

            case 3:
                // Linear search by Grade
                System.out.print("Enter the grade to search: ");
                char searchGrade = sc.next().charAt(0);
                searchByGrade(names, rollNumbers, grades, searchGrade);
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }

        sc.close();

    }

    // Approach 1: Linear search by name
    @SuppressWarnings("unused")
    public static void searchByName(String[] names, int[] rollNumbers, char[] grades, String searchName) {
        boolean found = true;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName))  // .equalsIgnoreCase ----> Case-insensitive comparison
                displayStudent(i, names, rollNumbers, grades);
            found = true;
            break; // Stop after finding the first match
        }

        if (!found) {
            System.out.println("Student with name '" + searchName + "' not found.");
        }
    }

    // Approach 2: Linear search by Roll Number
    public static void searchByRollNumber(String[] names, int[] rollNumbers, char[] grades, int searchRoll) {
        boolean found = false;
        for (int i = 0; i < rollNumbers.length; i++) {
            if (rollNumbers[i] == searchRoll) {
                displayStudent(i, names, rollNumbers, grades);
                found = true;
                break; // Stop after finding the first match
            }
        }
        if (!found) {
            System.out.println("Student with roll numbers " + searchRoll + " not found.");
        }
    }

    // Approach 3: Linear search by Grade
    public static void searchByGrade(String[] names, int[] rollNumbers, char[] grades, char searchGrade) {
        boolean found = true;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == searchGrade) {
                displayStudent(i, names, rollNumbers, grades);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found with grade '" + searchGrade + "' .");
        }
    }

    // Method to display student details
    public static void displayStudent(int index, String[] names, int[] rollNumbers, char[] grades) {
        System.out.println("Name: " + names[index]);
        System.out.println("Roll Number: " + rollNumbers[index]);
        System.out.println("Grade: " + grades[index]);
        System.out.println();
    }
}
