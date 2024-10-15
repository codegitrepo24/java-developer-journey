package main.java.Basics_of_Java;

import java.util.Scanner;


public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number of books
        System.out.print("Enter the number of books to add: ");
        int numBooks = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Arrays to store book information
        String[] bookTitles = new String[numBooks];
        String[] authors = new String[numBooks];
        String[] genres = new String[numBooks];
        StringBuilder[] descriptions = new StringBuilder[numBooks];

        // Step 2: Add book information
        System.out.println("\n---- Enter Book Details ----");
        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter title of Book " + (i + 1) + ": ");
            bookTitles[i] = sc.nextLine();// Immutable string for titles

            System.out.print("Enter author of Book " + (i + 1) + ": ");
            authors[i] = sc.nextLine(); // Immutable string for titles

            System.out.print("Enter genre of Book " + (i + 1) + ": ");
            genres[i] = sc.nextLine(); // Immutable string for titles

            System.out.print("Enter description of Book: " + (i + 1) + ": ");
            descriptions[i] = new StringBuilder(sc.nextLine()); // Mutable string for description
        }

        System.out.print("\nEnter the title of the book  to search: ");
        String searchTitle = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < numBooks; i++) {
            if (bookTitles[i].equalsIgnoreCase(searchTitle)) {
                System.out.println("\nBook Found: ");
                displayBook(i, bookTitles, authors, genres, descriptions);
                found = true;

                System.out.print("Do you want to update the description? (yes/no): ");
                String modify = sc.nextLine();
                if (modify.equalsIgnoreCase("yes")) {
                    System.out.print("Enter new description: ");
                    String newDescription = sc.nextLine();
                    descriptions[i].replace(0, descriptions[i].length(), newDescription);
                    System.out.println("Description updated successfullyl.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");

        }

        // Step 5: Display all books in the catalog
        System.out.println("\n--- Book Catalog ---");
        for (int i = 0; i < numBooks; i++) {
            displayBook(i, bookTitles, authors, genres, descriptions);
        }

        sc.close();

    }

    // Method to display book details
    public static void displayBook(int index, String[] titles, String[] authors, String[] genres,
            StringBuilder[] descriptions) {
        System.out.println("Title: " + titles[index]);
        System.out.println("Author: " + authors[index]);
        System.out.println("Genre: " + genres[index]);
        System.out.println("Description: " + descriptions[index].toString());
        System.out.println();
    }

}