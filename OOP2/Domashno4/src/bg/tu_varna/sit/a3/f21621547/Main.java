package bg.tu_varna.sit.a3.f21621547;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(10, "Example Book Summary123.");
        book.addPage(new Page(1, "Page 1."));
        book.addPage(new Page(2, "Page 2_Example."));

        BookDecorator electronicBook = new ElectronicBookDecorator(book, 5);
        System.out.println("Electronic book price: $" + electronicBook.getPrice() +
                ", summary: " + electronicBook.getSummary());

        PhysicalBookType softCover = new SoftCoverBook(100);
        BookDecorator softCoverBook = new PhysicalBookDecorator(book, softCover);
        System.out.println("SoftCover book price: $" + softCoverBook.getPrice() +
                ", summary: " + softCoverBook.getSummary());

        PhysicalBookType hardCover = new HardCoverBook(200, "Leather");
        BookDecorator hardCoverBook = new PhysicalBookDecorator(book, hardCover);
        System.out.println("HardCover book price: $" + hardCoverBook.getPrice() +
                ", summary: " + hardCoverBook.getSummary());

    }
}