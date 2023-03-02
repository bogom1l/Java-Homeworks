public class Field {
    private Terrorist[] terrorists;
    private AntiTerrorist[] antiTerrorists;
    public Field(Terrorist[] terrorists, AntiTerrorist[] antiTerrorists) {
        this.terrorists = terrorists;
        this.antiTerrorists = antiTerrorists;
    }
    public String Start() {

        String winner = "";

        for (int i = 0; i < terrorists.length; i++) {
            for (int j = 0; j < antiTerrorists.length; j++) {
                if(antiTerrorists[j].isAlive() && terrorists[i].isAlive()) {
                    int dmg = terrorists[i].gun.Shoot();
                    antiTerrorists[j].takeDamage(dmg);
                }
            }
        }

        for (int i = 0; i < antiTerrorists.length; i++) {
            for (int j = 0; j < terrorists.length; j++) {
                if(terrorists[j].isAlive() && antiTerrorists[i].isAlive()) {
                    int dmg = antiTerrorists[i].gun.Shoot();
                    terrorists[j].takeDamage(dmg);
                }
            }
        }

        boolean allTerroristsAlive = true;
        boolean allAntiTerroristsAlive = true;

        for (int i = 0; i < terrorists.length; i++) {
            if(!terrorists[i].isAlive()) {
                allTerroristsAlive = false;
                break;
            }
        }

        for (int i = 0; i < antiTerrorists.length; i++) {
            if(!antiTerrorists[i].isAlive()) {
                allAntiTerroristsAlive = false;
                break;
            }
        }

        if(allTerroristsAlive && allAntiTerroristsAlive){
            return "something is wrong";
        }

        if(allTerroristsAlive) {
            winner = "Terrorists";
        }

        if(allAntiTerroristsAlive) {
            winner = "AntiTerrorists";
        }

        return winner;
    }
}
