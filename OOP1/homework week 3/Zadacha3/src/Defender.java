public class Defender extends Character{
    private String defenseAbility;
    private double armor;
    private String healingAbility;

    public Defender() {
        this.life = 250;
    }

    public Defender(String name, String defenseAbility, double armor, String healingAbility) {
        this.name = name;
        this.defenseAbility = defenseAbility;
        this.armor = armor;
        this.healingAbility = healingAbility;
    }

    public String getDefenseAbility() {
        return defenseAbility;
    }

    public void setDefenseAbility(String defenseAbility) {
        this.defenseAbility = defenseAbility;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public String getHealingAbility() {
        return healingAbility;
    }

    public void setHealingAbility(String healingAbility) {
        this.healingAbility = healingAbility;
    }
}
