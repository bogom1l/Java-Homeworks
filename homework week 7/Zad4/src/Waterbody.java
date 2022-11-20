package bg.tu_varna.sit.task4;

public abstract class Waterbody implements Usage{

    String name;
    double depth;
    Fish[] fish;

    Waterbody(String name, double depth, Fish[] fish) {
        this.name = name;
        try {
            if (depth < 0) {
                throw new Exception("Дълбочината не може да бъде отрицателна величина");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.depth = depth;
        this.fish = fish;
    }

    @Override
    public boolean IsProductable() {
        for (int i = 0; i < fish.length; i++) {
            if(fish[i] instanceof EdibleFish && fish[i].quantity > 10){
                return true;
            }
        }
        return false;
    }

    abstract boolean isFloaty();

    double calculateProduction() {
        return 0;
    }
}
