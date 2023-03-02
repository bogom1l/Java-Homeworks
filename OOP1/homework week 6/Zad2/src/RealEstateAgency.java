package bg.tu_varna.sit.task2;

public class RealEstateAgency {
    private String name;
    public Property[] properties;

    public RealEstateAgency(String name) {
        this.name = name;
        this.properties = new Property[4]; //
    }

    public double calculateTotalExpectedCommission(){
        double sum = 0;

        for(int i=0;i<this.properties.length;i++){
            sum += this.properties[i].calculateCommission();
        }

        return sum;
    }

    public int getPropertiesForSale(){
        int sum = 0;

        for(int i=0;i<this.properties.length;i++){
            if(this.properties[i].isForRent){
                sum++;
            }
        }

        return sum;
    }
}
