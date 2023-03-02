package bg.tu_varna.sit.task1;

public class Bookstore {
    Book[] books = new Book[10];

    public double calculateTotalBookPrice(){
        double sum = 0;

        for (int i = 0; i < books.length; i++) {
            sum += books[i].price;
        }

        return sum;
    }

    public double calculateAverageBookPrice(){
        double sum = 0;

        for (int i = 0; i < books.length; i++) {
            sum += books[i].price;
        }

        return sum/books.length;
    }
}
