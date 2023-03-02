package bg.tu_varna.sit.task4;

public class Defender extends Character{

    private double defensiveSkill;
    private double armor;
    private double healingSkill;

    public Defender() {
        this.life = 250;
    }

    @Override
    double striking() {
        return 10;
    }

    @Override
    void defending(int dmg) {
        this.life -= dmg;
    }
}
