public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "335xi", "#FF0000", 300, "Petrol", "Manual", 2009);

        Truck truck = new Truck("Audi", "335xi", "#FF0000", 300, "Petrol", "Manual", 2009, 20);
        truck.setTimePassedSinceEngineStart(4);
        System.out.println(truck.isAbleToStart());

        Bus bus = new Bus("VW", "335xi", "#FF0000", 300, "Petrol", "Manual", 2009, 20, 2);
        bus.increaseCourses();
        System.out.println(bus.isLimitReached());

    }
}