public class Terrorist extends Player{
    private int aggressiveness;
    public Terrorist(String username, int health, int armor, Gun gun, int aggressiveness) {
        super(username, health, armor, gun);
        this.aggressiveness = aggressiveness;
    }

    public void increaseAggressiveness(int number) {
        if(number >= 1000) {
            this.armor++;
        }
    }
}
