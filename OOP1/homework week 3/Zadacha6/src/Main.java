public class Main {
    public static void main(String[] args) {

        Building building = new Building("Address1");

        House house = new House(1,2,3,4, 10);

        System.out.println(house.getTotalArea());

        house.setOwnerName("andrei");
        System.out.println(house.getOwnerName());
    }
}