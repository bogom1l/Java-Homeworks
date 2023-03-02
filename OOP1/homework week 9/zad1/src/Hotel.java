package bg.tu_varna.sit.task1;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void createReservation(Room roomToSearchFor) {

        for (Room room : rooms) {
            if(room instanceof SingleRoom && roomToSearchFor instanceof SingleRoom) {
                room.available = false;
                return;
            }
            if(room instanceof DoubleRoom && roomToSearchFor instanceof DoubleRoom) {
                room.available = false;
                return;
            }
        }
    }

    public double calculateBookedRoomsDiscount() {
        double sum = 0;
        for (Room room: rooms) {
            sum+=room.discount();
        }
        return sum;
    }

    public double calculateAveragePriceOfAvailableRoomsWithSeaView() {
        double sum = 0;
        for (Room room: rooms) {
            if(room.exposure == Exposure.SEA_VIEW && room.available) {
                sum+=room.calculateReservationPrice();
            }
        }
        return sum/this.rooms.size();
    }

}
