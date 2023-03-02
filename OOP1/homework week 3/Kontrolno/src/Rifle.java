public class Rifle extends Pistol{
    private int countBarrels;
    public Rifle(String name, int bulletsCapacity, int bulletsCount, int bulletsSingleShot, double barrelLength, int countBarrels) {
        super(name, bulletsCapacity, bulletsCount, bulletsSingleShot, barrelLength);
        this.countBarrels = countBarrels;
    }
}
