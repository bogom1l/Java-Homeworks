package bg.tu_varna.sit.task05;

import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private int availableQuantity;

    public Book(String title, Author author, int availableQuantity) {
        this.title = title;
        this.author = author;
        this.availableQuantity = availableQuantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Book book))
            return false;
        return availableQuantity == book.availableQuantity && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, availableQuantity);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title = " + title +
                ", author = " + author +
                ", availableQuantity = " + availableQuantity +
                '}';
    }
}
