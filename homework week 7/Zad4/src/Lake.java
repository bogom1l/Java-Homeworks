package bg.tu_varna.sit.task4;

public class Lake extends Waterbody{

    private double width;
    private double length;

    Lake(String name, double depth, Fish[] fish, double width, double length) {
        super(name, depth, fish);
        this.width=width;
        this.length=length;
    }

    @Override
    boolean isFloaty() {
        if(this.depth > 5 && this.length > 1000 && this.width > 1000) {
            return true;
        }
        return false;
    }
}
