package bg.tu_varna.sit.task1;

public abstract class Book implements Margin {
    String title;
    Author author;
    int publishingYear;
    double price;
    boolean hasHardCover;

    abstract double getFinalPrice();

    public String toString() {
        return author + ": " + title;
    }
}
