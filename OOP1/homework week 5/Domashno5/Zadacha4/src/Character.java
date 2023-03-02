package bg.tu_varna.sit.task4;

public abstract class Character {
    protected String name;
    protected double life;

    abstract double striking();
    abstract void defending(int dmg);
}
