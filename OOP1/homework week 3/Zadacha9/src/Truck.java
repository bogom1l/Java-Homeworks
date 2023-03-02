public class Truck extends Car{

    private double capacity;
    private double timePassedSinceEngineStart;

    public Truck(String brand, String model, String color, double volume, String typeEngine, String typeTransmission, int year, double capacity) {
        super(brand, model, color, volume, typeEngine, typeTransmission, year);
        this.capacity = capacity;
    }

    public double getTimePassedSinceEngineStart() {
        return timePassedSinceEngineStart;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setTimePassedSinceEngineStart(double timePassedSinceEngineStart) {
        this.timePassedSinceEngineStart = timePassedSinceEngineStart;
    }

    public boolean isAbleToStart() {
        if(this.timePassedSinceEngineStart < 6) {
            return true;
        }
        return false;
    }
}
