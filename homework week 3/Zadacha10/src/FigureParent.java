public class FigureParent {
    protected int radius;
    protected FigureParent() {
        this.radius = 25;
    }
    protected FigureParent(int radius) {
        this.radius = radius;
    }

    protected double calculateSomething() {
        return Math.PI * radius * radius;
    }

}
