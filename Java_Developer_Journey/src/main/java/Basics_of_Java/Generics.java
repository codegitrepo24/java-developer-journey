package main.java.Basics_of_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Base class for Media types
abstract class Media {
    private String title;
    private String genre;

    public Media(String title, String genre) {
        this.title = title;
        this.genre = genre;

    }

    public String getTitle() {
        return title;

    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Title: " + title + ", Genre: " + genre; // the toString() method is used to represent an object as a
                                                        // string. It is a method in the Object class, which is the root
                                                        // class of all Java classes
    }
}

// Book class extends Media
class Book extends Media {
    private String author;
    private int pages;

    public Book(String title, String genre, String author, int pages) {
        super(title, genre);
        this.author = author;
        this.pages = pages;
    }

    public String toString() {
        return super.toString() + ", Author: " + author + ", Pages: " + pages;
    }

}

// Magazine class extends Media
class Magazine extends Media {
    private int issueNumber;

    public Magazine(String title, String genre, int issueNumber) {
        super(title, genre);
        this.issueNumber = issueNumber;
    }

    public String toString() {
        return super.toString() + ", Issue Number: " + issueNumber;
    }
}

// DVD class extends Media
class DVD extends Media {
    private int duration;

    public DVD(String title, String genre, int duration) {
        super(title, genre);
        this.duration = duration;
    }

    public String toString() {
        return super.toString() + ", Duration: " + duration + " mins";
    }
}

// Generic Library class that can store any type of Media
class Library<T extends Media> {
    private List<T> items = new ArrayList<>();

    // Generic method to add media to the library
    public void addMedia(T media) {
        items.add(media);
        System.out.println(media.getTitle() + " has been added to the library.");
    }

    // Generic method to find a media by title
    public T findMediaByTitle(String title) {
        for (T item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        System.out.println("Media not found!");
        return null;
    }

    // Generic method to list all media
    public void listMedia() {
        if (items.isEmpty()) {
            System.out.println("No media available in the library.");
        } else {
            for (T item : items) {
                System.out.println(item);
            }
        }
    }

}

public class Generics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library<Book> bookLibrary = new Library<>();
        Library<Magazine> magazineLibrary = new Library<>();
        Library<DVD> dvdLibrary = new Library<>();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Add DVD");
            System.out.println("4. List All Books");
            System.out.println("5. List All Magazines");
            System.out.println("6. List All DVDs");
            System.out.println("7. Find a Book by Title");
            System.out.println("8. Find a Magazine by Title");
            System.out.println("9. Find a DVD by Title");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = sc.nextLine();
                    System.out.print("Enter book genre: ");
                    String bookGenre = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter number of pages: ");
                    int pages = sc.nextInt();
                    bookLibrary.addMedia(new Book(bookTitle, bookGenre, author, pages));
                    break;

                case 2:
                    System.out.print("Enter magazine title: ");
                    String magazineTitle = sc.nextLine();
                    System.out.print("Enter magazine genre: ");
                    String magazineGenre = sc.nextLine();
                    System.out.print("Enter issue number: ");
                    int issueNumber = sc.nextInt();
                    magazineLibrary.addMedia(new Magazine(magazineTitle, magazineGenre, issueNumber));
                    break;

                case 3:
                    System.out.print("Enter DVD title: ");
                    String dvdTitle = sc.nextLine();
                    System.out.print("Enter DVD genre: ");
                    String dvdGenre = sc.nextLine();
                    System.out.print("Enter duration in minutes: ");
                    int duration = sc.nextInt();
                    dvdLibrary.addMedia(new DVD(dvdTitle, dvdGenre, duration));
                    break;

                case 4:
                    System.out.println("\nBooks in Library:");
                    bookLibrary.listMedia();
                    break;

                case 5:
                    System.out.println("\nMagazines in Library:");
                    magazineLibrary.listMedia();
                    break;

                case 6:
                    System.out.println("\nDVDs in Library:");
                    dvdLibrary.listMedia();
                    break;

                case 7:
                    System.out.print("Enter book title to search: ");
                    String searchBookTitle = sc.nextLine();
                    Book foundBook = bookLibrary.findMediaByTitle(searchBookTitle);
                    if (foundBook != null) {
                        System.out.println("Found: " + foundBook);
                    }
                    break;

                case 8:
                    System.out.print("Enter magazine title to search: ");
                    String searchMagazineTitle = sc.nextLine();
                    Magazine foundMagazine = magazineLibrary.findMediaByTitle(searchMagazineTitle);
                    if (foundMagazine != null) {
                        System.out.println("Found: " + foundMagazine);
                    }
                    break;

                case 9:
                    System.out.print("Enter DVD title to search: ");
                    String searchDvdTitle = sc.nextLine();
                    DVD foundDvd = dvdLibrary.findMediaByTitle(searchDvdTitle);
                    if (foundDvd != null) {
                        System.out.println("Found: " + foundDvd);
                    }
                    break;

                case 10:
                    System.out.println("Exiting the Library Management System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option! Please choose a valid option.");
                    break;
            }
        }
    }

}
