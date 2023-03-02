package bg.tu_varna.sit.task4;

public class NonEdibleFish extends Fish {
    private boolean threat;


    public NonEdibleFish(String name, int quantity, boolean threat) {
        super(name, quantity);
        this.threat= threat;
    }
}
