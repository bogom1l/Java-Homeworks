public class Gun {
    protected String name; //?
    protected int bulletsCapacity;
    protected int bulletsCount;
    protected int bulletsSingleShot;
    protected Gun(String name, int bulletsCapacity, int bulletsCount, int bulletsSingleShot) {
        this.name = name;
        this.bulletsCapacity = bulletsCapacity;
        this.bulletsCount = bulletsCount;
        this.bulletsSingleShot = bulletsSingleShot;
    }

    //не мисля че разбирам правилно какво точно трябва да прави функцията Shoot
    public int Shoot() {
        int bulletsShot = this.bulletsSingleShot;
        this.bulletsSingleShot = 0;
        return bulletsShot;
    }
}
