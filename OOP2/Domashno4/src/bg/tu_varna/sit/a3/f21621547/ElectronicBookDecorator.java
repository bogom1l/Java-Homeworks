package bg.tu_varna.sit.a3.f21621547;


public class ElectronicBookDecorator implements BookDecorator {
    private Book book;
    private int electronicBookPrice;

    public ElectronicBookDecorator(Book book, int electronicBookPrice) {
        this.book = book;
        this.electronicBookPrice = electronicBookPrice;
    }

    public int getPrice() {
        return this.book.getPrice() + this.electronicBookPrice;
    }

    public String getSummary() {
        return this.book.getSummary() + " - Electronic Version.";
    }
}
