package bg.tu_varna.sit.task5;

public class SoftDrink extends Drink{

    boolean isSugerFree;

    public SoftDrink(boolean isSugerFree) {
        this.isSugerFree = isSugerFree;
    }

    @Override
    public boolean needOfDelivery() {
        if(this.quantity > 10) {
            return false;
        }
        return true;
    }
}
