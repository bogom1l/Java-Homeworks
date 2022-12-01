package bg.tu_varna.sit.task3;
public class Application {
    public static void main(String[] args) {

        Person person1 = new Person("ivan",AgeGroup.TEENAGE,3);
        Person person2 = new Person("b",AgeGroup.ADULT,6);
        Person person3 = new Person("c",AgeGroup.CHILD,8);
        Person person4 = new Person("d",AgeGroup.PENSIONER,11);

        Person[] people = new Person[4];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;

        FoodDiscount foodDiscount = new FoodDiscount(people,25);
        DrinkDiscount drinkDiscount = new DrinkDiscount(people, 10);
        GameDiscount gameDiscount = new GameDiscount(people, 15,5);

        System.out.println(foodDiscount.calculateTotalDiscount());
        System.out.println(foodDiscount.calculateAverageDiscount());

        System.out.println(drinkDiscount.calculateTotalDiscount());
        System.out.println(drinkDiscount.calculateAverageDiscount());

        System.out.println(gameDiscount.calculateTotalDiscount());
        System.out.println(gameDiscount.calculateAverageDiscount());

        Coupon coupon = new Coupon();
        coupon.displayTotalDiscount(foodDiscount);
        coupon.displayAverageDiscount(foodDiscount);
    }
}