public class Ticket {
    private String eventName;
    protected double price;

    public Ticket(String eventName, double price) {
        this.eventName = eventName;
        this.price = price;
    }

    public String getEventName() {
        return eventName;
    }

    public double getPrice() {
        return price;
    }
}
