package bg.tu_varna.sit.task1;

public class SciFiNovel extends Book{
    SciFiNovel(String title, String author, int publishingYear, double price, CoverType coverType) {
        super(title, author, publishingYear, price, coverType);
    }

    @Override
    public double calculateMargin() {
        if(this.coverType.equals("paperback")) {
            return this.price * 0.09;
        }
        return this.price * 0.12;
    }
}
