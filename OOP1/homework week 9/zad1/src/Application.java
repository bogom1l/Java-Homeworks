package bg.tu_varna.sit.task1;

public class Application {
    public static void main(String[] args) {

        SingleRoom singleRoom = new SingleRoom(15,Exposure.PARK_VIEW,4,false);
        DoubleRoom doubleRoom = new DoubleRoom(15,Exposure.SEA_VIEW,10,true,true);

        System.out.println(singleRoom.calculateReservationPrice());
        System.out.println(doubleRoom.calculateReservationPrice());

        Hotel hotel = new Hotel();
        hotel.addRoom(singleRoom);
        hotel.addRoom(doubleRoom);

        hotel.createReservation(singleRoom);

        System.out.println(hotel.calculateBookedRoomsDiscount());
        System.out.println(hotel.calculateAveragePriceOfAvailableRoomsWithSeaView());
    }
}