package bg.tu_varna.sit.task3;

public class Horse extends Animal{

    public Horse(double e) {
        this.energy = e;
    }

    @Override
    protected double getEnergy() {
        return this.energy;
    }

    @Override
    void sleep() {
        this.energy *= 0.07;
    }

    @Override
    void eat() {
        this.energy *= 0.15;
    }

    @Override
    public void moving() {
        this.energy /= 0.15;
    }
}
