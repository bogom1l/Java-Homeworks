package bg.tu_varna.sit.task2;

public class House extends Property{

    int numberOfFloors;
    boolean hasGarden;

    House(double area, double price, PropertyType propertyType, int numberOfFloors, boolean hasGarden) {
        super(area, price, propertyType);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }

    @Override
    public double calculateCommission() {
        if(this.propertyType.equals("rent") && this.hasGarden) {
            return this.price * 0.08;
        }

        if(this.propertyType.equals("sale") && this.area < 100) {
            return this.price * 0.05;
        }

        return this.price * 0.03;
    }
}
