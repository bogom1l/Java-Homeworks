package bg.tu_varna.sit.a3.f21621547;

public class Main {
    public static void main(String[] args) {

        BakingFactory bakingFactory = new BakingFactory();

        Sweet cake = bakingFactory.createSweet("cake", "vanilla", "strawberry", "buttercream", 2, "whipped");
        Sweet donut = bakingFactory.createSweet("donut", "yeast", "chocolate", null, 12, null);
        Sweet eclair = bakingFactory.createSweet("eclair", "puff", "custard", "chocolate", 0, null);
        Sweet gingerbread = bakingFactory.createSweet("gingerbread", "ginger", "royal", "none", 1, null);

        cake.prepare();
        donut.prepare();
        eclair.prepare();
        gingerbread.prepare();

        //Exception throw
        Sweet unknownSweet = bakingFactory.createSweet("Chocolate", "test1", "test12", "test13", 1, null);
    }
}