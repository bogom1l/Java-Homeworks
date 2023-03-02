public class Main {
    public static void main(String[] args) {

        Apartament[] apartaments = new Apartament[10];

        int currFloor = 1;
        double currArea = 220.5;
        int currRooms = 22;

        String[] exposures = {"west", "east", "north", "south"};
        String currExposure = exposures[0];
        int exposuresCounter = 1;

        //filling the arrayy
        for (int i = 0; i < 10; i++) {

            apartaments[i] = new Apartament(currFloor, currArea, currRooms, currExposure);

            currFloor++;
            currArea -= 20.5;
            currRooms -= 2;
            currExposure = exposures[exposuresCounter];
            exposuresCounter++;

            if(exposuresCounter == 4) {
                exposuresCounter = 0;
            }
        }

        //printing out the array
        for (int i = 0; i < apartaments.length; i++) {
            Apartament currAp = apartaments[i];

            System.out.println(currAp);
        }

        //biggest area
        double biggestArea = apartaments[0].getArea();
        Apartament biggestAreaApartament = apartaments[0];

        for (int i = 0; i < apartaments.length; i++) {
            Apartament currApartament = apartaments[i];

            double currAreaToCompare = currApartament.getArea();

            if(biggestArea < currAreaToCompare) {
                biggestArea = currAreaToCompare;
                biggestAreaApartament = currApartament;
            }
        }

        System.out.println();
        System.out.println("Biggest area is = " + biggestArea + ", that belongs to apartament:");
        System.out.println(biggestAreaApartament);
    }
}