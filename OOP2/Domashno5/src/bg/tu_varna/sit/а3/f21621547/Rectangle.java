package bg.tu_varna.sit.а3.f21621547;

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing rectangle : ");
    }

    public void resize(double factor) {
        this.width *= factor;
        this.height *= factor;
    }

    public String description() {
        return "Rectangle with width: " + width + " and height: " + height;
    }

    public boolean isHide() {
        return false;
    }
}
