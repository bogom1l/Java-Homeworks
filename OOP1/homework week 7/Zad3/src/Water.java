package bg.tu_varna.sit.task3;

public class Water extends Item{

    private double mineralContent;

    public Water(String name, int daysToExpire, int availableQuantity, ItemType itemType, double mineralContent) {
        super(name, daysToExpire, availableQuantity, itemType);
        this.mineralContent= mineralContent;
    }

    @Override
    public boolean needsDelivery() {
        if(this.availableQuantity < 30 || this.daysToExpire <20) {
            return true;
        }
        return false;
    }
}
