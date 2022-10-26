public class Cylinder extends FigureParent {
    private int height;

    public Cylinder() {
        super();
        this.height = 20;
    }

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {
        return super.calculateSomething() * this.height;
    }
}
