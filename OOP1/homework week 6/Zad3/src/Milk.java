package bg.tu_varna.sit.task3;

public class Milk extends Item implements Drink{

    private double fatPercentage;

    public Milk(double f) {
        this.fatPercentage = f;
    }

    @Override
    public boolean needsDelivery() {
        if (this.daysToExpire < 15 && this.availableQuantity < 10 && this.fatPercentage > 2) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isDrinkable() {
        return true;
    }
}
