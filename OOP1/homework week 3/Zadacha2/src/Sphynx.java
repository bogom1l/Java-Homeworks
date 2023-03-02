public class Sphynx extends Cat {

    public Sphynx() {
        this.furSize = 0;
    }
    public Sphynx(String color) {
        super();
        this.color = color;
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
