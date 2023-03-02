public class Main {
    public static void main(String[] args) {

        SoftDrink[] softDrinks = new SoftDrink[10];

        softDrinks[0] = new SoftDrink("coca cola", "01.01.2023", "100", "10");
        softDrinks[1] = new SoftDrink("fanta cola", "02.01.2023", "100", "15");
        softDrinks[2] = new SoftDrink("sprite", "11.01.2023", "100", "12");
        softDrinks[3] = new SoftDrink("potion", "02.04.2023", "100", "15");
        softDrinks[4] = new SoftDrink("lovedrink", "05.05.2023", "100", "10");
        softDrinks[5] = new SoftDrink("tasty", "30.01.2023", "100", "18");
        softDrinks[6] = new SoftDrink("something", "22.11.2023", "100", "13");
        softDrinks[7] = new SoftDrink("fanta2", "06.01.2024", "100", "50");
        softDrinks[8] = new SoftDrink("zero", "13.04.2024", "100", "22");
        softDrinks[9] = new SoftDrink("nameless", "08.07.2026", "100", "11");

        int sumSugar = 0;

        for (int i = 0; i < softDrinks.length; i++) {

            sumSugar += Integer.parseInt((softDrinks[i].getSugarPer100ml()));

        }

        System.out.println((double)sumSugar / softDrinks.length);
    }
}