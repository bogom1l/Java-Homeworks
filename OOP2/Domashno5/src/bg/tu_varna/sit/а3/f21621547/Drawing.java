package bg.tu_varna.sit.а3.f21621547;

import java.util.ArrayList;
import java.util.List;

class Drawing {
    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void resizeShapes(int factor) {
        for (Shape shape : shapes) {
            shape.resize(factor);
        }
    }

    public void drawShapes() {
        for (Shape shape : shapes) {
            if (!shape.isHide()) {
                shape.draw();
                System.out.println(shape.description() + " ");
            }
        }
    }
}
