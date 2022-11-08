public class Circle extends Shape {

    public Circle() {
        super();
    }

    public Circle(int radius) {
        super(50);
    }

    public double getArea() {
        return super.calculateSomething();
    }

    @Override
    public double calculateV() {
        return 1;
    }
}