package main.java.Basics_of_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for the number of students and subjects
        System.out.print("Entet the number of students: ");
        int numStudents = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        // 1D Array: Store subject names dynamically
        String[] subjects = new String[numSubjects];
        System.out.println("Enter the subject names: ");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = sc.next();
        }

        // ArrayList: Store student names
        ArrayList<String> studentNames = new ArrayList<>();
        int[][] studentMarks = new int[numStudents][numStudents]; // 2D Array for marks
        char[][] studentGrades = new char[numStudents][]; // Jagged Array for semester grades (Jagged Array: Jagged
                                                          // arrays are useful when the amount of data per row
                                                          // varies—for example, when each student in a school has
                                                          // completed a different number of semesters. )

        for (int i = 0; i < numStudents; i++) {
            System.out.print("\n Enter the name of student " + (i + 1) + ": ");
            studentNames.add(sc.next());

            System.out.println("Enter marks for " + studentNames.get(i) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                studentMarks[i][j] = sc.nextInt();
            }

            System.out.print("Enter the number of semesters for " + studentNames.get(i) + ": ");
            int numSemesters = sc.nextInt();
            studentGrades[i] = new char[numSemesters];

            System.out.println("Enter the grades for each semester: ");
            for (int k = 0; k < numSemesters; k++) {
                System.out.print("Semester " + (k + 1) + ": ");
                studentGrades[i][k] = sc.next().charAt(0);
            }
        }

        System.out.println("\n----- Student Report ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent: " + studentNames.get(i));

            int totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                totalMarks += studentMarks[i][j];
                System.out.println(subjects[j] + ": " + studentMarks[i][j]);
            }

            double average = totalMarks / (double) numSubjects;
            char finaGrade = assignGrade(average);

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + average);
            System.out.println("Final Grade: " + finaGrade);

            System.out.print("Semester Grades: ");
            for (char grade : studentGrades[i]) {
                System.out.print(grade + " ");
            }
            System.out.println();

        }

        sc.close();

    }

    // Method to assign a grade based on the average marks
    public static char assignGrade(double average) {
        if (average >= 90)
            return 'A';
        else if (average >= 75)
            return 'B';
        else if (average >= 50)
            return 'C';
        else
            return 'F';
    }
}
