public class Cone extends FigureParent {
    private int height;

    public Cone() {
        super();
        this.height = 10;
    }

    public Cone(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {
        return super.calculateSomething() * (this.height/3);
    }

}
