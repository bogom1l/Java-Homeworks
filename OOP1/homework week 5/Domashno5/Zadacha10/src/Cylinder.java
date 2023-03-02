public class Cylinder extends Shape {
    private int height;

    public Cylinder() {
        super();
        this.height = 20;
    }

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double calculateV() {
        return super.calculateSomething() * this.height;
    }
}
