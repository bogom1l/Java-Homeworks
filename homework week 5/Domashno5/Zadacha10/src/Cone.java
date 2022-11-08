public class Cone extends Shape {
    private int height;

    public Cone() {
        super();
        this.height = 10;
    }

    public Cone(int radius, int height) {
        super(radius);
        this.height = height;
    }


    @Override
    public double calculateV() {
        return super.calculateSomething() * (this.height/3);
    }
}
