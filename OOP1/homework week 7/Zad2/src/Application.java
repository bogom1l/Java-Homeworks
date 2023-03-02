package bg.tu_varna.sit.task2;

public class Application {
    public static void main(String[] args) {

        PropertyType propertyForSale = PropertyType.sale;
        PropertyType propertyForRent = PropertyType.rent;
        PropertyType propertyUndefined = PropertyType.undefined;

        Parking parkingLot = new Parking();

        Property house = new House(100, 50000, propertyForSale, 1,true);
        Property apartment = new Apartament(200, 80000, propertyForRent, 1,4, parkingLot);
        Property office = new Office(300, 20000, propertyUndefined, 1, parkingLot);
        Property shop = new Shop(300, 20000, propertyForRent);

        Property[] properties = new Property[4];
        properties[0] = house;
        properties[1] = apartment;
        properties[2] = office;
        properties[3] = shop;

        RealEstateAgency realEstateAgency = new RealEstateAgency("Firma BG", properties);

        System.out.println(realEstateAgency.calculateTotalExpectedCommission());
        System.out.println(realEstateAgency.getPropertiesForSale());
    }
}