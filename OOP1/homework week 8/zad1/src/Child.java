public class Child extends Pacient{
    private String name;
    private int age;
    double weight;
    public Child(String name, int age, double weight) throws InvalidAgeException {
        this.name = name;
        if(age < 3) {
            throw new InvalidAgeException("age must be more than 3!");
        }
        else {
            this.age = age;
        }
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' + "Age: " + age;
    }
}
