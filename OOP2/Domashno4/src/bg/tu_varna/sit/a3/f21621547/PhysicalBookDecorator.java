package bg.tu_varna.sit.a3.f21621547;


public class PhysicalBookDecorator implements BookDecorator {
    private Book book;
    private PhysicalBookType physicalBookType;

    public PhysicalBookDecorator(Book book, PhysicalBookType physicalBookType) {
        this.book = book;
        this.physicalBookType = physicalBookType;
    }

    public int getPrice() {
        return this.book.getPrice() + this.physicalBookType.getAdditionalPrice();
    }

    public String getSummary() {
        return this.book.getSummary() + " - Physical Version with - " +
                this.physicalBookType.getBinding() + " binding";
    }
}