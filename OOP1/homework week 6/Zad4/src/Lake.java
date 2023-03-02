package bg.tu_varna.sit.task4;

public class Lake extends WaterBody{
    int width;
    int length;

    public Lake(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    boolean isFloaty() {
        return this.length > 1000 && this.width > 1000 && this.depth > 5;
    }
}
