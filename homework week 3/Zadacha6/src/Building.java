public class Building {
    protected int h;
    protected int w;
    protected int l;
    protected int area;
    protected String address;

    protected Building() {};
    protected Building(int l, int w, int h, int area) {
        this.l = l;
        this.h = h;
        this.w = w;
        this.area = area;
    }
    public Building(String address) {
        this.address = address;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public int getL() {
        return l;
    }

    public int getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }
}
