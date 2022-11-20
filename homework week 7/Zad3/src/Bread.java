package bg.tu_varna.sit.task3;

public class Bread extends Item {

    private double whiteFlourPercentage;

    public Bread(String name, int daysToExpire, int availableQuantity, ItemType itemType, double whiteFlourPercentage) {
        super(name, daysToExpire, availableQuantity, itemType);
        this.whiteFlourPercentage = whiteFlourPercentage;
    }

    @Override
    public boolean needsDelivery() {
        if((this.daysToExpire < 5 && this.whiteFlourPercentage > 75) || this.availableQuantity < 10){
            return  true;
        }
        return false;
    }
}
