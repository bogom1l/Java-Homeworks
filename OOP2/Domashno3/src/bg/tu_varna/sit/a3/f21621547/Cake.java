package bg.tu_varna.sit.a3.f21621547;

public class Cake implements Sweet {

    private String dough;
    private String filling;
    private String frosting;
    private int layers;
    private String cream;

    public Cake(String dough, String filling, String frosting, int layers, String cream) {
        this.dough = dough;
        this.filling = filling;
        this.frosting = frosting;
        this.layers = layers;
        this.cream = cream;
    }

    @Override
    public void prepare() {
        System.out.println("We just baked Cake" + " with " + dough + " dough, " + filling + " filling, " + frosting + " frosting, " + layers + " layers and " + cream + " cream.");
    }

}