package bg.tu_varna.sit.task1;

public class DoubleRoom extends Room{

    private int days;
    private boolean hasChildren;

    public DoubleRoom(double pricePerDay, Exposure exposure,int days, boolean available, boolean hasChildren) {
        super(pricePerDay, exposure);
        this.days = days;
        this.available = available;
        this.hasChildren = hasChildren;
    }

    public int getDays() {
        return days;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    @Override
    public String toString() {
        return "DoubleRoom{" +
                "days=" + days +
                ", hasChildren=" + hasChildren +
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
        if(this.days > 5 && hasChildren) {
            return this.days * this.pricePerDay * 0.85;
        }
        return this.days * (this.pricePerDay + 10);
    }
}
