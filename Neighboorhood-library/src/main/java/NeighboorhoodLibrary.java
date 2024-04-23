package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {

        // Step 1 - get some books
        //  Declare a class (data type) to represent a Book
        //  Create some books
        //  Declare a variable to hold the books
        // Let's use an array
        //  Create instances of Book objects with new

        Book b1 = new Book(1, "Unknown", "West With the Night", false, "Nobody");
        Book b2 = new Book(2, "Unknown", "West With the Night", false, "Nobody");
        Book b3 = new Book(3, "Unknown", "West With the Night", false, "Nobody");
        Book b4 = new Book(4, "Unknown", "West With the Night", false, "Nobody");
        Book b5 = new Book(5, "Unknown", "West With the Night", false, "Nobody");
        Book b6 = new Book(6, "Unknown", "West With the Night", false, "Nobody");
        Book b7 = new Book(7, "Unknown", "West With the Night", false, "Nobody");
        Book b8 = new Book(8, "Unknown", "West With the Night", false, "Nobody");


        Book[] books = {
                b1, b2, b3, b4, b5, b6, b7, b8
        };

        // Print out a prompt
        System.out.println("Please pick a book from the following list: \n");
        // Print out al the books
        printAllBooks(books);

        // Let the user select one by number




        // Go through the books
        // Show the book with that number

        boolean found = false;

        while(!found) {
            System.out.println("\nEnter the id number of the book you want: ");
            // Read in a number
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int inputNumber = Integer.parseInt(input);

            Book theBook = findBookById(inputNumber, books);
            if (theBook != null ) found = true;

            if (found) {
                System.out.println("I FOUND IT !!!!");
                System.out.println(theBook);

            } else {
                System.out.println("Sorry.  I don't have that book id...");
            }
        }
    }


    static void printAllBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b.getId() + ":  " + b.getTitle());
        }
    }

    static Book findBookById(int id, Book[] books) {
        for (Book b : books) {
            if (id == b.getId()) {
                return b;
            }
        }
        return null;
    }

}