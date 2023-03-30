package bg.tu_varna.sit.a3.f21621547;

public class SoftCoverBook implements PhysicalBookType {
    private int grammage;

    public SoftCoverBook(int grammage) {
        this.grammage = grammage;
    }

    public int getAdditionalPrice() {
        return this.grammage * 2;
    }

    public String getBinding() {
        return "SoftCover";
    }
}