package bg.tu_varna.sit.task5;

public class SoftDrink extends Drink{
    boolean isSugarFree;
    Fragrances drinkFragrance;

    public SoftDrink(String name, double quantity, double serveQuantity, boolean isSugarFree, Fragrances drinkFragrance) {
        super(name, quantity, serveQuantity);
        this.isSugarFree=isSugarFree;
        this.drinkFragrance=drinkFragrance;
    }

    @Override
    public boolean needOfDelivery() {
        if(this.quantity < 1 || this.serveQuantity < 1) {
            return true;
        }
        return false;
    }
}
