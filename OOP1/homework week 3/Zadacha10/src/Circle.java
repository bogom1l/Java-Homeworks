public class Circle extends FigureParent{

    public Circle() {
        super();
    }

    public Circle(int radius) {
        super(50);
    }

    public double getArea() {
        return super.calculateSomething();
    }

}