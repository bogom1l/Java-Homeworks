package bg.tu_varna.sit.task3;

public class GameDiscount implements Discount{

    private Person[] people;
    private double discountRate;
    private double discountRateForAdults;

    public GameDiscount(Person[] people, double discountRate, double discountRateForAdults) {
        this.people = people;
        this.discountRate = discountRate;
        this.discountRateForAdults = discountRateForAdults;
    }

    public Person[] getPeople() {
        return people;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getDiscountRateForAdults() {
        return discountRateForAdults;
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
