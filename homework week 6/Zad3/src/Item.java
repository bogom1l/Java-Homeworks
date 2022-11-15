package bg.tu_varna.sit.task3;


public abstract class Item implements Delivery {

    String name;
    int daysToExpire;
    double availableQuantity;


    public boolean isDrinkable() {
        return true;
    }

}
