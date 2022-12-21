package bg.tu_varna.sit.task1;

import java.util.Objects;

public abstract class Item implements Delivery,Comparable{
    private ItemType itemType;
    private double itemPrice;
    private int availableQuantity;

    public Item(ItemType itemType, double itemPrice, int availableQuantity) {
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.availableQuantity = availableQuantity;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(item.itemPrice, itemPrice) == 0 && availableQuantity == item.availableQuantity && itemType == item.itemType;
    }


}

