package bg.tu_varna.sit.task3;

public class Cheese extends Item{
    private double gramsPerPackage;

    public Cheese(String name, int daysToExpire, int availableQuantity, ItemType itemType, double gramsPerPackage) {
        super(name, daysToExpire, availableQuantity, itemType);
        this.gramsPerPackage = gramsPerPackage;
    }

    @Override
    public boolean needsDelivery() {
        if(this.availableQuantity < 10 && this.gramsPerPackage < 400) {
            return true;
        }
        return false;
    }
}
