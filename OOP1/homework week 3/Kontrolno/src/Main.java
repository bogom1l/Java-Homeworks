public class Main {

    public static void main(String[] args) {

        //Terrorists
        Terrorist[] terrorists = new Terrorist[3];

        Rifle rifle1 = new Rifle("Kalashnikov", 5,40,50,10,2);
        Rifle rifle2 = new Rifle("M4A1", 8,70,30,15,4);

        terrorists[0] = new Terrorist("ivan1", 10, 10, rifle1, 25);
        terrorists[1] = new Terrorist("ivan2", 50, 50, rifle2, 1);
        terrorists[2] = new Terrorist("ivan3", 10, 10, rifle2, 1);

        //AntiTerrorists
        AntiTerrorist[] antiTerrorists = new AntiTerrorist[3];

        Pistol pistol1 = new Pistol("Glock", 11,30,20,4);
        Pistol pistol2 = new Pistol("USP", 15,70,40,7);

        antiTerrorists[0] = new AntiTerrorist("peter1", 80, 10, pistol1, 50);
        antiTerrorists[1] = new AntiTerrorist("peter2", 20, 10, pistol2, 10);
        antiTerrorists[2] = new AntiTerrorist("peter3", 30, 10, pistol2, 10);


        //Field
        Field field = new Field(terrorists, antiTerrorists);
        System.out.println(field.Start());
    }
}

