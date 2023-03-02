package bg.tu_varna.sit.task5;

public class AlcoholicBeverage extends Drink{
    double vol;

    public AlcoholicBeverage(double vol) {
        this.vol = vol;
    }

    @Override
    public boolean needOfDelivery() {
        if(this.quantity > 5) {
            return false;
        }
        return true;
    }
}
