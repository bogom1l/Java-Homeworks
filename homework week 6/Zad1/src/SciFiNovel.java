package bg.tu_varna.sit.task1;

public class SciFiNovel extends Book{

    public SciFiNovel(String title, Author author, int py, double price, boolean hasHardCover) {
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
        if(!this.hasHardCover) {
            return this.price*0.09;
        }
        else{
            return this.price*0.12;
        }
    }
}
