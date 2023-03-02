package bg.tu_varna.sit.task4;

public class River extends WaterBody{
    private double speed;
    public River(double s) {
        this.speed = s;
    }
    @Override
    boolean isFloaty() {
        return this.speed < 30 && this.depth > 3;
    }
}
