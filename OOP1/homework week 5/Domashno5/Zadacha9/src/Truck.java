package bg.tu_varna.sit.task9;

public class Truck extends Car{

    private double capacity;
    private double elapsedTime;

    public Truck(double elapsedTime) {
        super();
        this.elapsedTime = elapsedTime;
    }

    @Override
    public boolean startup() {
        return elapsedTime < 6;
    }
}
