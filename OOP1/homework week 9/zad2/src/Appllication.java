package bg.tu_varna.sit.task2;

import java.util.*;

public class Appllication {
    public static void main(String[] args) {

        Author a1 = new Author("ivan","petrov","bg");
        Author a2 = new Author("elon","musk","usa");
        Author a3 = new Author("john","wick","france");

        Book b1 = new Book("title1",a1,2000,1);
        Book b2 = new Book("title2",a2,2001,4);
        Book b3 = new Book("title3",a3,2005,15);
        Book b4 = new Book("title4",a3,1903,88);

        BookCatalogue bookCatalogue = new BookCatalogue();

        bookCatalogue.addBook(b1);
        bookCatalogue.addBook(b2);
        bookCatalogue.addBook(b3);
        bookCatalogue.addBook(b4);

        bookCatalogue.removeBook(b4);
        bookCatalogue.addBook(b4);

        bookCatalogue.borrowBook(b1);
        bookCatalogue.returnBook(b1);

        System.out.println(bookCatalogue.countBooksByAuthor(a1));
        System.out.println(bookCatalogue.countBooksPublishedAfterYear(1999));

    }
}