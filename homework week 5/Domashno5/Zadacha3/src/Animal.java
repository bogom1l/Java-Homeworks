package bg.tu_varna.sit.task3;

public abstract class Animal implements Move {
    protected double energy;

    protected double getEnergy(){
        return this.energy;
    }

    abstract void sleep();

    abstract void eat();

}
