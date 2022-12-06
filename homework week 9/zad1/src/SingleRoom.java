package bg.tu_varna.sit.task1;

public class SingleRoom extends Room{

    private int days;

    public SingleRoom(double pricePerDay, Exposure exposure, int days, boolean available) {
        super(pricePerDay, exposure);
        this.days = days;
        this.available = available;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "SingleRoom{" +
                "days=" + days +
                ", pricePerDay=" + pricePerDay +
                ", exposure=" + exposure +
                ", available=" + available +
                '}';
    }

    @Override
    public double calculateStayPrice() {
        return 0;
    }

    @Override
    public double discount() {
        return 0;
    }

    @Override
    public double calculateReservationPrice() {
        if(this.days <= 3) {
            return this.days * this.pricePerDay;
        }
        return this.days * this.pricePerDay * 0.9;
    }
}
