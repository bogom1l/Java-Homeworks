package bg.tu_varna.sit.task6;

public abstract class Building {
    protected String address;
    protected double width;
    protected double length;
    protected double height;

    abstract double heatedVolume();
    abstract double totalArea();
}
