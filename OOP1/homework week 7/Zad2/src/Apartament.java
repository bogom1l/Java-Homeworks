package bg.tu_varna.sit.task2;

public class Apartament extends Property{

    int numberOfRooms;
    int floor;
    Parking parkinLot;


    Apartament(double area, double price, PropertyType propertyType, int numberOfRooms, int floor, Parking parkinLot) {
        super(area, price, propertyType);
        this.numberOfRooms = numberOfRooms;
        this.floor=floor;
        this.parkinLot = parkinLot;
    }

    @Override
    public double calculateCommission() {
        if(this.propertyType.equals("rent") && ((this.parkinLot.placesForRent == 1) || this.parkinLot.placesForRent == 2)) {
            return this.price * 0.15;
        }

        if(this.area < 60) {
            return this.price * 0.1;
        }

        return this.price * 0.07;
    }
}
