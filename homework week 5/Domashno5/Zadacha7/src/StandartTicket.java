package bg.tu_varna.sit.task7;

public class StandartTicket extends Ticket{

    private boolean valid;

    @Override
    double getPrice() {
        return this.price;
    }
}
