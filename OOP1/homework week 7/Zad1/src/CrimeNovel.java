package bg.tu_varna.sit.task1;

public class CrimeNovel extends Book{


    CrimeNovel(String title, String author, int publishingYear, double price, CoverType coverType) {
        super(title, author, publishingYear, price, coverType);
    }

    @Override
    public double calculateMargin() {
        if(this.coverType.equals("hardcover")) {
            return this.price * 0.02;
        }

       // else (this.coverType.equals("paperback")){
            return this.price * 0.02;
        //}

    }
}
