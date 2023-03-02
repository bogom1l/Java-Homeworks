public class StandartTicket extends Ticket{
    private boolean isUsed;

    protected StandartTicket(String e, double p) {
        super(e, p);
    }

    public StandartTicket(String eventName, double price, boolean isUsed) {
        super(eventName, price);
        this.isUsed = isUsed;
    }

    public boolean isUsed() {
        return isUsed;
    }
}
