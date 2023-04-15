package bg.tu_varna.sit.а3.f21621547;

class Triangle implements GeometricShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }

    public void drawShape() {
        System.out.println("Drawing triangle: ");
    }

    public String toString() {
        return "Triangle with sides: " + side1 + ", " + side2 + ", " + side3;
    }
}