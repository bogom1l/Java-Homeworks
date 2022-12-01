package bg.tu_varna.sit.task3;

public class Person {
    private String name;
    private AgeGroup ageGroup;
    private double productPrice;

    public Person(String name, AgeGroup ageGroup, double productPrice) {
        this.name = name;
        this.ageGroup = ageGroup;
        this.productPrice = productPrice;
    }

    public String getName() {
        return name;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double calculateBaseDiscount() {
        if(this.ageGroup == AgeGroup.CHILD || this.ageGroup == AgeGroup.PENSIONER) {
            return this.productPrice * 0.08;
        }
        return this.productPrice * 0.03;
    }


}
