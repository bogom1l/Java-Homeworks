package bg.tu_varna.sit.task2;

import java.util.*;

public class BookCatalogue {
    Set<Book> books;

    public BookCatalogue() {
        this.books = new HashSet<Book>();
    }

    public void addBook(Book b) {
        this.books.add(b);
    }

    public void removeBook(Book b) {
        this.books.remove(b);
    }

    public void borrowBook(Book b) {
        if(this.books.contains(b) && b.getAvailableQuantity() == 1)
        {
            this.books.remove(b);
        }
        else if(this.books.contains(b)){
            b.setAvailableQuantity(b.getAvailableQuantity()-1);
        }
    }

    public void returnBook(Book b) {
        if(this.books.contains(b))
        {
            b.setAvailableQuantity(b.getAvailableQuantity()+1);
        }
        else if(!this.books.contains(b)){
            this.books.add(b);
        }
    }
    
    public int countBooksByAuthor(Author author) {
        int sum = 0;
        for (Book book :
                this.books) {
            if(book.getAuthor() == author) {
                sum++;
            }
        }

        return sum;
    }

    public void sortCatalogueByAuthor() {
        ArrayList<Book> arr = new ArrayList<Book>(this.books);
        Collections.sort(arr);
        for (Book b :
                arr) {
            System.out.println(b.getAuthor().getFirstName());
        }
    }

    public int countBooksPublishedAfterYear(int year) {
        int sum = 0;
        for (Book book :
                this.books) {
            if(book.getPublishingYear() > year) {
                sum++;
            }
        }

        return sum;
    }

    @Override
    public String toString() {
        return "BookCatalogue{" +
                "books=" + books +
                '}';
    }
}
