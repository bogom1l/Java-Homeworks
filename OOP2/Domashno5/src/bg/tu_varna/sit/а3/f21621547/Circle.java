package bg.tu_varna.sit.а3.f21621547;

class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing circle");
    }

    public void resize(double factor) {
        this.radius *= factor;
    }

    public String description() {
        return "Circle with radius: " + radius;
    }

    public boolean isHide() {
        return false;
    }
}