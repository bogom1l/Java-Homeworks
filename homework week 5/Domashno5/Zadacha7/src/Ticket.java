package bg.tu_varna.sit.task7;

public abstract class Ticket {
    protected String performanceName;
    protected double price;

    abstract double getPrice();
}
