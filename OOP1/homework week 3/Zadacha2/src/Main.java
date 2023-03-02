public class Main {
    public static void main(String[] args) {

        Sphynx sphynx = new Sphynx("red");
        System.out.println(sphynx.furSize);
        System.out.println(sphynx.color);

        Cat cat = new Cat();
        System.out.println(cat.color);
        System.out.println(cat.furSize);
    }
}