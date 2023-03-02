package bg.tu_varna.sit.task3;

public class Cheese extends Item implements Food{

    private double gramsPerPackage;

    public Cheese(double g) {
        this.gramsPerPackage = g;
    }

    @Override
    public boolean needsDelivery() {
        if(this.gramsPerPackage < 400 && this.availableQuantity < 10) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFoodable() {
        return true;
    }
}
