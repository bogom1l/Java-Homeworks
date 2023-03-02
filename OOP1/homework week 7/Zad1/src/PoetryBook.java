package bg.tu_varna.sit.task1;

public class PoetryBook extends Book{

    PoetryBook(String title, String author, int publishingYear, double price, CoverType coverType) {
        super(title, author, publishingYear, price, coverType);
    }

    @Override
    public double calculateMargin() {
        if(this.coverType.equals("hardcover") && this.publishingYear > 2000) {
            return this.price * 0.01;
        }
        return this.price * 0.05;
    }
}
