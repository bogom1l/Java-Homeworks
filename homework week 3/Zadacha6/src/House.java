public class House extends Building{
    private int floors;
    private String ownerName;
    private int totalArea;

    public House(int l, int w, int h, int area, int floors) {
        super(l, w, h, area);
        this.totalArea = floors * this.area;
    }

    public int getFloors() {
        return floors;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getTotalArea() {
        return totalArea;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
