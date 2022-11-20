package bg.tu_varna.sit.task2;

public class Office extends Property {

    int numberOfRooms;
    Parking parkingLot;

    Office(double area, double price, PropertyType propertyType, int numberOfRooms, Parking parkingLot) {
        super(area, price, propertyType);
        this.numberOfRooms = numberOfRooms;
        this.parkingLot = parkingLot;
    }

    @Override
    public double calculateCommission() {
        if(this.propertyType.equals("rent")) {
            return this.price * 0.18;
        }

        if(this.parkingLot.numberOfParkingPlaces > 0 && this.numberOfRooms > 2) {
            return this.price * 0.15;
        }

        return this.price * 0.11;
    }
}
