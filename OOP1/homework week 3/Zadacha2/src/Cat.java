public class Cat {
    protected String color;
    protected double furSize;

    public Cat() { }

    public Cat(String color, double furSize) {
        this.color = color;
        this.furSize = furSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFurSize() {
        return furSize;
    }

    public void setFurSize(double furSize) {
        this.furSize = furSize;
    }
}
