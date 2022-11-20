package bg.tu_varna.sit.task5;

public class Drink implements Delivery,Serving{

    String name;
    double quantity;
    double serveQuantity;

    public Drink(String name, double quantity, double serveQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.serveQuantity = serveQuantity;
    }

    @Override
    public boolean needOfDelivery() {
        return false;
    }

    @Override
    public void deliver(int n) {
        this.quantity += n;
    }

    @Override
    public void serve(int n) {
        if(this.serveQuantity > n) {
            this.serveQuantity -= n;
        }
        else {
            this.serveQuantity = 0;
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
