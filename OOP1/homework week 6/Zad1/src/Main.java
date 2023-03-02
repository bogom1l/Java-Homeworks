package bg.tu_varna.sit.task1;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("ivan", "petrov","miroslavov");

        CrimeNovel crimeNovel = new CrimeNovel("a", author, 1999,20,true);
        PoetryBook poetryBook = new PoetryBook("b", author, 2005, 50 , false);
        SciFiNovel sciFiNovel = new SciFiNovel("c", author, 2010, 10, true);

        Bookstore bookstore = new Bookstore();
        bookstore.books[0] = crimeNovel;
        bookstore.books[1] = poetryBook;
        bookstore.books[2] = sciFiNovel;

        System.out.println(bookstore.calculateTotalBookprice());
        System.out.println(bookstore.calculateAverageBookPrice());

    }
}