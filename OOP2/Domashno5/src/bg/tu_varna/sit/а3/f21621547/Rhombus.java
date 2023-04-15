package bg.tu_varna.sit.а3.f21621547;

class Rhombus implements GeometricShape {
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double area() {
        return (diagonal1 * diagonal2) / 2.0;
    }

    public double perimeter() {
        return 2.0 * Math.sqrt(Math.pow(diagonal1 / 2.0, 2) + Math.pow(diagonal2 / 2.0, 2));
    }

    public void drawShape() {
        System.out.println("Drawing rhombus: ");
    }

    public String toString() {
        return "Rhombus with diagonals: " + diagonal1 + ", " + diagonal2;
    }
}