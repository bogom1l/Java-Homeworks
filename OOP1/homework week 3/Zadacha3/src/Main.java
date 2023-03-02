public class Main {
    public static void main(String[] args) {

        Character character = new Character();

        Attacker attacker = new Attacker();
        attacker.setName("Ivan");
        attacker.setEfficiency("high level efficency");

        System.out.println(attacker.life);
        System.out.println(attacker.getName());
        System.out.println(attacker.getEfficiency());

        attacker.setLife(5000);
        System.out.println(attacker.life);
        System.out.println();

        Defender defender = new Defender();
        defender.setArmor(12345);
        defender.setDefenseAbility("low level defense ability");
        defender.setHealingAbility("medium level healing ability");

        System.out.println(defender.getLife());
        System.out.println(defender.getDefenseAbility());
        System.out.println(defender.getHealingAbility());
        System.out.println(defender.getArmor());

        defender.setLife(500);
        System.out.println(defender.getLife());
    }
}