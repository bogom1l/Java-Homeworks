package bg.tu_varna.sit.task1;

public class CrimeNovel extends Book{

    public CrimeNovel(String title, Author author, int py, double price, boolean hasHardCover) {
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
    public double calculateMargin() {
        if(this.hasHardCover) {
            return this.price*0.02;
        }
        else{
            return price*0.01;
        }
    }
}
