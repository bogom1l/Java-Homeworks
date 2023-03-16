package bg.tu_varna.sit.a3.f21621547;

public class Eclair implements Sweet {
    private String dough;
    private String filling;
    private String frosting;

    public Eclair(String dough, String filling, String frosting) {
        this.dough = dough;
        this.filling = filling;
        this.frosting = frosting;
    }

    @Override
    public void prepare() {
        System.out.println("We just baked Eclair" + " with " + dough + " dough, " + filling + " filling and " + frosting + " frosting.");
    }
}
