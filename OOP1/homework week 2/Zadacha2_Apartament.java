import java.util.Objects;

public class Apartament {
    private int floor;
    private double area;
    private int rooms;
    private String exposure;

    public Apartament(int floor, double area, int rooms, String exposure) {
        this.floor = floor;
        this.area = area;
        this.rooms = rooms;
        this.exposure = exposure;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String toString() {
        return "Apartament { " +
                "floor=" + floor +
                ", area=" + area +
                ", rooms=" + rooms +
                ", exposure='" + exposure + '\'' +
                " }";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Apartament that = (Apartament) o;
        return Double.compare(that.area, area) == 0;
    }

}
