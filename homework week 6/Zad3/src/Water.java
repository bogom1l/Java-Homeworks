package bg.tu_varna.sit.task3;

public class Water extends Item implements Drink{

    private double mineralContent;

    public Water(double m) {
        this.mineralContent = m;
    }

    @Override
    public boolean needsDelivery() {
        if(this.availableQuantity < 30 || this.daysToExpire < 20) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isDrinkable() {
        return true;
    }
}
