package bg.tu_varna.sit.task5;

public class Drink implements Delivery, Serving{

    String name;
    int quantity;
    int serveQuantity;

    @Override
    public boolean needOfDelivery() {
        return false;
    }

    @Override
    public void deliver(int count) {
        this.quantity += count;
    }

    @Override
    public void serve(int count) {
        if(quantity >= count) {
            quantity -= count;
        }
        else {
            this.quantity = 0;
        }
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", serveQuantity=" + serveQuantity +
                '}';
    }
}
