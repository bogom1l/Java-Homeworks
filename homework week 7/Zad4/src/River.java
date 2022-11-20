package bg.tu_varna.sit.task4;

public class River extends Waterbody{

    private int speed;

    River(String name, double depth, Fish[] fish,int speed) {
        super(name, depth, fish);
        this.speed=speed;
    }

    @Override
    boolean isFloaty() {
        if(this.speed < 30 && this.depth > 3) {
            return true;
        }
        return false;
    }
}
