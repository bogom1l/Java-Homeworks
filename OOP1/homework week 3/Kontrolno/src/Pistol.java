public class Pistol extends Gun{
    private double barrelLength;
    public Pistol(String name, int bulletsCapacity, int bulletsCount, int bulletsSingleShot, double barrelLength) {
        super(name, bulletsCapacity, bulletsCount, bulletsSingleShot);
        this.barrelLength = barrelLength;
    }
}
