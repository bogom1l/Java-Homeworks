package bg.tu_varna.sit.task2;

public abstract class Property implements Commission{

    double area;
    double price;
    boolean isForRent;

    Property(double a, double p, boolean is) {
        this.area = a;
        this.price = p;
        this.isForRent = is;
    }

}
