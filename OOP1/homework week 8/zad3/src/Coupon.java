package bg.tu_varna.sit.task3;

public class Coupon<T>{

    public void displayTotalDiscount(T item) {
        System.out.println(item.getClass().getMethods()[0]); //
    }

    public void displayAverageDiscount(T item) {
        System.out.println(item.getClass().getMethods()[1]);
    }

}
