package bg.tu_varna.sit.task2;

public class House extends Property{

    private int numberOfFloors;
    private boolean hasGarden;

    public House(int numberOfFloors, boolean hasGarden, double area, double price, boolean isForRent) {
        super(area,price,isForRent);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }

    @Override
    public double calculateCommission() {
        if(this.isForRent && this.hasGarden) {
            return 0.08*this.price;
        }
        else if(this.isForRent && this.area < 100){
            return 0.05*this.price;
        }
        return 0.03*this.price;
    }
}
