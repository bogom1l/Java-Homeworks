package bg.tu_varna.sit.a3.f21621547;

public class Gingerbread implements Sweet{
    private String dough;
    private String frosting;

    public Gingerbread(String dough, String frosting) {
        this.dough = dough;
        this.frosting = frosting;
    }

    @Override
    public void prepare() {
        System.out.println("We just baked Gingerbread" + " with " + dough + " dough and " + frosting + " frosting.");
    }
}
