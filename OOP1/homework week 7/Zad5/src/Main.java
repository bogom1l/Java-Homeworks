package bg.tu_varna.sit.task5;
public class Main {
    public static void main(String[] args) {

        Fragrances lemon = Fragrances.lemon;

        Drink softDrink = new SoftDrink("a",1,1,true,lemon);

        softDrink.deliver(6);

        System.out.println(softDrink.needOfDelivery());

    }
}