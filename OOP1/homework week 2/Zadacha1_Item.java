public class Item {
    private String type;
    private int quantity;
    private double price;
    private int days;

    public Item(String type, int quantity, double price, int days) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.days = days;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }

    public int getDays() { 
	return days; 
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String toString() {
        String answer = "This item has: type=" + this.type + ", quantity=" + this.quantity
                + ", price=" + this.price + ", days=" + this.days;

        return answer;
    }
}
