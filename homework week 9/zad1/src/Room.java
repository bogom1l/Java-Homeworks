package bg.tu_varna.sit.task1;

public abstract class Room implements PriceCalculator{

    double pricePerDay;
    Exposure exposure;
    boolean available;

    public Room(double pricePerDay, Exposure exposure) {
        this.pricePerDay = pricePerDay;
        this.exposure = exposure;
        this.available = false;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public Exposure getExposure() {
        return exposure;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public double calculateReservationPrice() {
        return this.calculateStayPrice() - this.discount();
    }
}
