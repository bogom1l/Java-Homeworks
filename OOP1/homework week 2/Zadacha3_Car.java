public class Car {

    private String brand;
    private String licensePlate;
    private String mileage;

    public Car(String brand, String licensePlate, String mileage) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", mileage='" + mileage + '\'' +
                '}';
    }
}
