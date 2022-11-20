package bg.tu_varna.sit.task2;

public class RealEstateAgency {
    private String name;
    private Property[] properties;

    public String getName() {
        return name;
    }

    public Property[] getProperties() {
        return properties;
    }

    public RealEstateAgency(String name, Property[] properties) {
        this.name = name;
        this.properties = properties;
    }

    public double calculateTotalExpectedCommission() {
        double sum = 0;
        for (int i = 0; i <this.properties.length; i++) {
            sum += this.properties[i].calculateCommission();
        }
        return sum;
    }

    public double getPropertiesForSale() {
        int sum = 0;
        for (int i = 0; i <this.properties.length; i++) {
            if(this.properties[i].propertyType.equals("sale")){
                sum ++;
            }
        }
        return sum;
    }
}
