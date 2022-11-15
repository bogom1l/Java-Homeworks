package bg.tu_varna.sit.task2;
public class Main {
    public static void main(String[] args) {

        Apartament apartament = new Apartament(4,2,500,100,true);
        House house = new House(2,true,600,200,false);
        Office office = new Office(true, 10, 50, 50, true);
        Shop shop = new Shop(80, 90, true);

        RealEstateAgency realEstateAgency = new RealEstateAgency("FirmaBG");

        realEstateAgency.properties[0] = apartament;
        realEstateAgency.properties[1] = house;
        realEstateAgency.properties[2] = office;
        realEstateAgency.properties[3] = shop;

        System.out.println(realEstateAgency.getPropertiesForSale());
        System.out.println(realEstateAgency.calculateTotalExpectedCommission());
    }
}