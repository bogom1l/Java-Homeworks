package bg.tu_varna.sit.task3;

public class Milk extends Item{

    private double fatPercentage;

    public Milk(String name, int daysToExpire, int availableQuantity, ItemType itemType, double fatPercentage) {
        super(name, daysToExpire, availableQuantity, itemType);
        this.fatPercentage = fatPercentage;
    }

    @Override
    public boolean needsDelivery() {
        if(this.daysToExpire < 15 && this.availableQuantity < 10 && this.fatPercentage > 2) {
            return true;
        }
        return false;
    }
}
