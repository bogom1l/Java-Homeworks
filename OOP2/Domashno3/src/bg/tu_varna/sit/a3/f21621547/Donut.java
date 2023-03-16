package bg.tu_varna.sit.a3.f21621547;

public class Donut implements Sweet{
    private String dough;
    private String filling;

    public Donut(String dough, String filling) {
        this.dough = dough;
        this.filling = filling;
    }

    @Override
    public void prepare() {
        System.out.println("We just baked Donut" +  " with " + dough + " dough, " + filling + " filling.");
    }
}
