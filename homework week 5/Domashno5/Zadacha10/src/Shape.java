import java.awt.geom.Area;

public abstract class Shape extends Area implements Volume {
    protected int radius;
    protected Shape() {
        this.radius = 25;
    }
    protected Shape(int radius) {
        this.radius = radius;
    }

    protected double calculateSomething() {
        return Math.PI * radius * radius;
    }

}
