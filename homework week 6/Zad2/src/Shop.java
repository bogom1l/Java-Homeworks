package bg.tu_varna.sit.task2;

public class Shop extends Property{

    public Shop(double area, double price, boolean isForRent) {
        super(area,price,isForRent);
    }

    @Override
    public double calculateCommission() {
        if(this.isForRent & this.area < 50) {
            return 0.02*this.price;
        }
        else if(this.area > 100){
            return 0.01*this.price;
        }
        return 0.06*this.price;
    }
}
