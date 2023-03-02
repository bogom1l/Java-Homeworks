package bg.tu_varna.sit.task4;

public abstract class WaterBody implements Usage{

    String name;
    double depth;
    Fish[] fish;

    @Override
    public boolean isProductabe() {
        return true;
    }

    abstract boolean isFloaty();

    double calculateProduction(){
        return 10;
    }
}
