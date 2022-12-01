package bg.tu_varna.sit.task3;

public class DrinkDiscount implements Discount{

    private Person[] people;
    private double drinkDiscountRate;

    public DrinkDiscount(Person[] people, double drinkDiscountRate) {
        this.people = people;
        this.drinkDiscountRate = drinkDiscountRate;
    }

    public Person[] getPeople() {
        return people;
    }

    public double getDrinkDiscountRate() {
        return drinkDiscountRate;
    }


    @Override
    public double calculateTotalDiscount() {
        double sum = 0;
        for (int i = 0; i < this.people.length; i++) {
            if(this.people[i].getAgeGroup() == AgeGroup.PENSIONER || this.people[i].getAgeGroup() == AgeGroup.ADULT)
            {
                sum += this.people[i].calculateBaseDiscount();
            }
        }

        return sum;
    }

    @Override
    public double calculateAverageDiscount() {
        double sum = 0;
        for (int i = 0; i < this.people.length; i++) {
            if(this.people[i].getAgeGroup() == AgeGroup.PENSIONER || this.people[i].getAgeGroup() == AgeGroup.ADULT)
            {
                sum += this.people[i].calculateBaseDiscount();
            }
        }

        return sum/this.people.length;
    }
}
