package bg.tu_varna.sit.a3.f21621547;

public class HardCoverBook implements PhysicalBookType {
    private int grammage;
    private String binding;

    public HardCoverBook(int grammage, String binding) {
        this.grammage = grammage;
        this.binding = binding;
    }

    public int getAdditionalPrice() {
        return this.grammage * 3;
    }

    public String getBinding() {
        return this.binding;
    }
}