public class Bus extends Car{

    private int seats;
    private int coursesDone;
    private final int maxCourses = 10;

    public Bus(String brand, String model, String color, double volume, String typeEngine, String typeTransmission, int year, int seats, int coursesDone) {
        super(brand, model, color, volume, typeEngine, typeTransmission, year);
        this.seats = seats;
        this.coursesDone = coursesDone;
    }

    public boolean isLimitReached() {
        if (this.maxCourses - this.coursesDone < 5) {
            return false;
        }
        return true;
    }

    public void increaseCourses() {
        this.coursesDone++;
    }

    public int getSeats() {
        return seats;
    }

    public int getCoursesDone() {
        return coursesDone;
    }
}
