package bg.tu_varna.sit.task1;

public class PoetryBook extends Book{

    public PoetryBook(String title, Author author, int py, double price, boolean hasHardCover) {
        this.title = title;
        this.author = author;
        this.publishingYear = py;
        this.price = price;
        this.hasHardCover = hasHardCover;
    }
    @Override
    protected double getFinalPrice() {
        return this.price * this.calculateMargin();
    }

    @Override
    public double calculateMargin() {
        if(this.publishingYear > 2000 && this.hasHardCover) {
            return this.price*0.01;
        }
        else{
            return this.price*0.05;
        }
    }
}
