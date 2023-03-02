package bg.tu_varna.sit.task2;

public class Office extends Property{

    private boolean hasParkingLot;
    private int numberOfRooms;

    public Office(boolean hasParkingLot, int numberOfRooms, double area, double price, boolean isForRent) {
        super(area,price,isForRent);
        this.hasParkingLot = hasParkingLot;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public double calculateCommission() {
        if(this.isForRent) {
            return 0.18*this.price;
        }
        else if(this.hasParkingLot && this.numberOfRooms > 2){
            return 0.15*this.price;
        }
        return 0.11*this.price;
    }
}
