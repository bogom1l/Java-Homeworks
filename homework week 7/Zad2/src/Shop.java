package bg.tu_varna.sit.task2;

public class Shop extends Property {



    Shop(double area, double price, PropertyType propertyType) {
        super(area, price, propertyType);
    }

    @Override
    public double calculateCommission() {
        if(this.propertyType.equals("rent") && this.area < 50) {
            return this.price * 0.02;
        }

        if(this.area > 100) {
            return this.price * 0.01;
        }

        return this.price * 0.06;
    }
}
