package bg.tu_varna.sit.а3.f21621547;

class GeometricShapeAdapter implements Shape {
    private GeometricShape geometricShape;

    public GeometricShapeAdapter(GeometricShape geometricShape) {
        this.geometricShape = geometricShape;
    }

    public void draw() {
        geometricShape.drawShape();
    }

    @Override
    public void resize(double factor) {
        //geometricShape.resize(factor);
    }

    public String description() {
        return geometricShape.toString();
    }

    public boolean isHide() {
        return false;
    }
}