package bg.tu_varna.sit.task3;

public class Sheep extends Animal{
    public Sheep(double e) {
        this.energy = e;
    }

    @Override
    protected double getEnergy() {
        return this.energy;
    }

    @Override
    void sleep() {
        this.energy *= 0.05;
    }

    @Override
    void eat() {
        this.energy *= 0.1;
    }

    @Override
    public void moving() {
        this.energy /= 0.25;
    }
}
