package bg.tu_varna.sit.task3;

public class FoodDiscount implements Discount{

    private Person[] people;
    private double foodDiscountRate;

    public FoodDiscount(Person[] people, double foodDiscountRate) {
        this.people = people;
        this.foodDiscountRate = foodDiscountRate;
    }

    public Person[] getPeople() {
        return people;
    }

    public double getFoodDiscountRate() {
        return foodDiscountRate;
    }

    @Override
    public double calculateTotalDiscount() {
        double sum = 0;
        for (int i = 0; i < this.people.length; i++) {
            sum += this.people[i].calculateBaseDiscount();
        }

        return sum;
    }

    @Override
    public double calculateAverageDiscount() {
        double sum = 0;
        for (int i = 0; i < this.people.length; i++) {
            sum += this.people[i].calculateBaseDiscount();
        }

        return sum/this.people.length;
    }
}
