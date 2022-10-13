public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[10];

        cars[0] = new Car("BMW", "B1234OB", "200000");
        cars[1] = new Car("Audi", "CB1111CC", "300000");
        cars[2] = new Car("Mercedes-Benz", "CB1234AA", "500000");
        cars[3] = new Car("VW", "A4444BB", "1500000");
        cars[4] = new Car("Toyota", "H1122AB", "700000");
        cars[5] = new Car("Shkoda", "CH9592HC", "120000");
        cars[6] = new Car("Infinity", "OB7628CA", "20000");
        cars[7] = new Car("Chaika", "CA6666PC", "870000");
        cars[8] = new Car("Honda", "BBBBBBB", "999");
        cars[9] = new Car("Hyundai", "AAAAAAA", "3300");

        System.out.println("The Cars List is: ");
        for (int i = 0; i < cars.length; i++) {
            Car currCar = cars[i];

            System.out.println(currCar);
        }

        //smallest mileage
        double smallestMileage = Double.valueOf(cars[0].getMileage());

        for (int i = 0; i < cars.length; i++) {
            Car currCar = cars[i];

            double currMileageToCompare = Double.valueOf(currCar.getMileage());

            if(currMileageToCompare < smallestMileage) {
                smallestMileage = currMileageToCompare;
            }
        }

        System.out.println();
        System.out.println("Smallest mileage is = " + smallestMileage);

    }
}