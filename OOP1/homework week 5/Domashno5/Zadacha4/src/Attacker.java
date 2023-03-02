package bg.tu_varna.sit.task4;

public class Attacker extends Character{
    private double efficiency;

    public Attacker(double efficiency) {
        this.life = 150;
        this.efficiency = efficiency;
    }

    @Override
    double striking() {
        return this.efficiency;
    }

    @Override
    void defending(int dmg) {
        this.life -= dmg;
    }
}
