package bg.tu_varna.sit.task1;

public class Bread extends Item {

    public Bread(ItemType itemType, double itemPrice, int availableQuantity) {
        super(itemType, itemPrice, availableQuantity);
    }

    @Override
    public boolean needsDelivery() {
        return this.getAvailableQuantity() < 15;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
