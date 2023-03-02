package bg.tu_varna.sit.task3;

public abstract class Item implements Delivery {

    String name;
    int daysToExpire;
    int availableQuantity;
    ItemType itemType;

    Item(String name, int daysToExpire, int availableQuantity, ItemType itemType) {
        this.name = name;
        this.daysToExpire = daysToExpire;
        this.availableQuantity = availableQuantity;
        this.itemType = itemType;
    }

}
