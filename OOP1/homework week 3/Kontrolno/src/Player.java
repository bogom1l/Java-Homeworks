public class Player {
    protected String username;
    protected int health;
    protected int armor;
    protected Gun gun;
    public Player(String username, int health, int armor, Gun gun) {
        this.username = username;
        this.health = health;
        this.armor = armor;
        this.gun = gun;
    }
    public void takeDamage(int points) {
        if (this.armor > points)
        {
            this.armor -= points;
        }
        else if (this.armor > 0)
        {
            points -= this.armor;
            this.armor = 0;
        }

        if (this.health > points && this.armor == 0)
        {
            this.health -= points;
        }
        else if (this.health <= points && this.armor == 0)
        {
            this.health = 0;
        }
    }
    public boolean isAlive() {
        if(this.health > 0) {
            return true;
        }
        return false;
    }
}
