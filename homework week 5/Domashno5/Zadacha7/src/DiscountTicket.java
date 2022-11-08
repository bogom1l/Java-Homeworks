package bg.tu_varna.sit.task7;

public class DiscountTicket extends Ticket{

    private String userName;


    @Override
    double getPrice() {
        return this.price * 0.5;
    }
}
