package bg.tu_varna.sit.task1;

public class Bookstore {
    public Book[] books;

    public Bookstore() {
        this.books = new Book[3];
    }

    public Bookstore(Book[] books) {
        this.books = books;
    }

    public double calculateTotalBookprice() {

        double sum = 0;

        for (int i=0;i<this.books.length;i++){
            sum += this.books[i].getFinalPrice();
        }

        return sum;
    }

    public double calculateAverageBookPrice(){
        double average = 0;

        for (int i=0;i<this.books.length;i++){
            average += this.books[i].getFinalPrice();
        }

        return average / this.books.length;
    }

}
