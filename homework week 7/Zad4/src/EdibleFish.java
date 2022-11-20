package bg.tu_varna.sit.task4;

public class EdibleFish extends Fish{
    private double percentOfYield;

    public EdibleFish(String name, int quantity, double percentOfYield) {
        super(name, quantity);
        this.percentOfYield = percentOfYield;
    }
}
