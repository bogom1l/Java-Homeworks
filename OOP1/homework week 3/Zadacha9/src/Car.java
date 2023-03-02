public class Car {
    protected String brand;
    protected String model;
    protected String color;
    protected double volume;
    protected String typeEngine;
    protected String typeTransmission;
    protected int year;
    protected double km;

    public Car(String brand, String model, String color, double volume, String typeEngine, String typeTransmission, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.volume = volume;
        this.typeEngine = typeEngine;
        this.typeTransmission = typeTransmission;
        this.year = year;
    }

    public Car(String brand, String model, double volume, String typeEngine, String typeTransmission, int year) {
        this.brand = brand;
        this.model = model;
        this.volume = volume;
        this.typeEngine = typeEngine;
        this.typeTransmission = typeTransmission;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
