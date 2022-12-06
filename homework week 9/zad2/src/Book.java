package bg.tu_varna.sit.task2;

import java.util.Objects;

public class Book implements Comparable{

    private String title;
    private Author author;
    private int publishingYear;
    private int availableQuantity;

    public Book(String title, Author author, int publishingYear, int availableQuantity) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.availableQuantity = availableQuantity;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", availableQuantity=" + availableQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && availableQuantity == book.availableQuantity && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (!(o instanceof Book)) return -1;
        Book book = (Book) o;
        if((publishingYear == book.publishingYear && availableQuantity == book.availableQuantity && Objects.equals(title, book.title) && Objects.equals(author, book.author))){
            return 0;
        }
        return -1;
    }
}
