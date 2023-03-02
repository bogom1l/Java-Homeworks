package bg.tu_varna.sit.task2;

public class Apartament extends Property{

    private int numberOfRooms;
    private int floor;

    public Apartament(int numberOfRooms, int floor, double area, double price, boolean isForRent) {
        super(area,price,isForRent);
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
    }

    @Override
    public double calculateCommission() {
        if(this.isForRent) {
            return 0.15*this.price;
        }
        else if(this.area < 60){
            return 0.1*this.price;
        }
        return 0.07*this.price;
    }
}
