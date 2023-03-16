package bg.tu_varna.sit.a3.f21621547;

public class BakingFactory {

    public Sweet createSweet(String sweetType, String dough, String filling, String frosting, int layers, String cream) {

        if (sweetType == null || sweetType.isEmpty())
            return null;

        switch (sweetType) {
            case "cake":
                return new Cake(dough, filling, frosting, layers, cream);
            case "donut":
                return new Donut(dough, filling);
            case "eclair":
                return new Eclair(dough, filling, frosting);
            case "gingerbread":
                return new Gingerbread(dough, frosting);
            default:
                throw new IllegalArgumentException("Unknown sweet type - " + sweetType);

        }
    }
}