package bg.tu_varna.sit.task4;

public class Main {
    public static void main(String[] args) {

        Fish edibleFish = new EdibleFish("a", 1,1);
        Fish nonEdibleFish = new NonEdibleFish("b", 2,true);

        Fish[] fish = new Fish[2];
        fish[0] = edibleFish;
        fish[1]=nonEdibleFish;

        Waterbody lake = new Lake("c", 6, fish,1444,2444);
        Waterbody river = new River("c", 3, fish,15);

        System.out.println(lake.isFloaty());
        System.out.println(river.isFloaty());


    }
}