package bg.tu_varna.sit.task1;

public abstract class Book implements Margin {
    String title;
    String author;
    int publishingYear;
    double price;
    CoverType coverType;

     Book(String title, String author, int publishingYear, double price, CoverType coverType) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.price = price;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", price=" + price +
                ", coverType=" + coverType +
                '}';
    }

    double getFinalPrice() {
         if(this.price > 5) {
             return this.price;
         }
         return 0;
    }
}
