package bg.tu_varna.sit.task3;

public class Bread extends Item implements Food{

    private double whiteFlourPercentage;

    public Bread(double w) {
        this.whiteFlourPercentage = w;
    }

    @Override
    public boolean needsDelivery() {
        if(this.daysToExpire < 5 && (this.whiteFlourPercentage > 75 || this.availableQuantity < 10)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFoodable() {
        return true;
    }
}
