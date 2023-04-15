package bg.tu_varna.sit.а3.f21621547;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle(5, 10));
        drawing.addShape(new Circle(10));
        drawing.addShape(new GeometricShapeAdapter(new Triangle(6, 4, 5)));
        drawing.addShape(new GeometricShapeAdapter(new Rhombus(9, 8)));

        drawing.drawShapes();
        System.out.println();

        drawing.resizeShapes(3);
        drawing.drawShapes();
    }
}