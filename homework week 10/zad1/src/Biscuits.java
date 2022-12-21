package bg.tu_varna.sit.task1;

import java.util.Objects;

public class Biscuits extends Item{

    private String name;

    public Biscuits(ItemType itemType, double itemPrice, int availableQuantity, String name) {
        super(itemType, itemPrice, availableQuantity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Biscuits)) return false;
        if (!super.equals(o)) return false;
        Biscuits biscuits = (Biscuits) o;
        return name.equals(biscuits.name);
    }

    @Override
    public String toString() {
        return "Biscuits{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean needsDelivery() {
        return this.getAvailableQuantity() < 5;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
