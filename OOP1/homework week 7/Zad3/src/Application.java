package bg.tu_varna.sit.task3;
public class Application {
    public static void main(String[] args) {

        ItemType drink = ItemType.drink;
        ItemType food = ItemType.food;

        Item bread = new Bread("white bread BG", 5,3,food,25);
        Item cheese = new Cheese("yellow cheese", 2,6,food,10);
        Item milk = new Milk("Alaska", 1,8,drink,73);
        Item water = new Water("Devin", 2,3,drink,11);

        Item[] items = new Item[4];
        items[0] = bread;
        items[1] = cheese;
        items[2] = milk;
        items[3] = water;

        Shop shop = new Shop(items);

        System.out.println(shop.getAvailableDrinksCount());
        System.out.println(shop.getAverageDaysToExpire());
        System.out.println(shop.getItemCountDelivery());
    }
}