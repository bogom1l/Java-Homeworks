package bg.tu_varna.sit.task9;

public class Car {

    protected String brand;
    protected String model;
    protected String color;
    protected double power;
    protected String engineType;
    protected String transmission;
    protected int yearOfManufacture;
    protected int mileage;

    public Car() {
        this.mileage = 0;
        this.color = "CCCCCC";
    }

    public boolean startup() {
        return true;
    }

}
