public class AntiTerrorist extends Player {
    private int skill;
    public AntiTerrorist(String username, int health, int armor, Gun gun, int skill) {
        super(username, health, armor, gun);
        this.skill = skill;
    }

    public void increaseSkill(int number) {
        if(number >= 10000) {
            this.armor += 2;
        }
    }
}
