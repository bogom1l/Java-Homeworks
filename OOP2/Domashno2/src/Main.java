import bg.tu_varna.sit.а3.f21621547.Agency;
import bg.tu_varna.sit.а3.f21621547.Property;
import bg.tu_varna.sit.а3.f21621547.PropertyType;

public class Main {
    public static void main(String[] args) {

        Agency agency = Agency.getInstance();
        agency.setName("MarinoviAgency");
        agency.setAddress("Sofia, Ulitsa Ivan Ivanov 123");

        Property property1 = new Property.Builder()
                .propertyType(PropertyType.Apartament)
                .area(500)
                .price(125000)
                .rooms(4)
                .isFurnished(true)
                .hasGarage(true)
                .hasGarden(false)
                .build();

        Property property2 = new Property.Builder()
                .propertyType(PropertyType.Office)
                .area(20)
                .price(15000)
                .rooms(2)
                .isFurnished(false)
                .hasGarage(false)
                .hasGarden(false)
                .build();

        Property property3 = new Property.Builder()
                .propertyType(PropertyType.House)
                .area(420)
                .price(800000)
                .rooms(6)
                .hasGarden(true)
                .build();

        agency.addProperty(property1);
        agency.addProperty(property2);
        agency.addProperty(property3);

        System.out.println(agency);

        agency.removeProperty(property2);

        System.out.println("-----After removal:\n");
        System.out.println(agency);
    }
}