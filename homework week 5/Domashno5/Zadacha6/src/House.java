package bg.tu_varna.sit.task6;

public class House extends Building{

    private int floors;
    private double owner;


    @Override
    double heatedVolume() {
        return this.floors * this.height * 0.75;
    }

    public void setOwner(double owner) {
        this.owner = owner;
    }

    @Override
    double totalArea() {
        return this.floors * this.height * this.width * this.length;
    }
}
