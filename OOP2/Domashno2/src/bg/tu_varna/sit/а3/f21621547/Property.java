package bg.tu_varna.sit.а3.f21621547;

public class Property {

    public static class Builder {
        private PropertyType propertyType;
        private double area;
        private double price;
        private int rooms;
        private boolean isFurnished;
        private boolean hasGarage;
        private boolean hasGarden;

        public Builder propertyType(PropertyType propertyType) {
            this.propertyType = propertyType;
            return this;
        }

        public Builder area(double area) {
            this.area = area;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder rooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder isFurnished(boolean isFurnished) {
            this.isFurnished = isFurnished;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Property build() {
            return new Property(propertyType, area, price, rooms, isFurnished, hasGarage, hasGarden);
        }
    }

    private PropertyType propertyType;
    private double area;
    private double price;
    private int rooms;
    private boolean isFurnished;
    private boolean hasGarage;
    private boolean hasGarden;

    public Property(PropertyType propertyType, double area, double price, int rooms, boolean isFurnished, boolean hasGarage, boolean hasGarden) {
        this.propertyType = propertyType;
        this.area = area;
        this.price = price;
        this.rooms = rooms;
        this.isFurnished = isFurnished;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("PropertyType: " + propertyType + " ");
        str.append("area: " + area + " ");
        str.append("price: " + price + " ");
        str.append("rooms: " + rooms + " ");
        str.append("isFurnished: " + isFurnished + " ");
        str.append("hasGarage: " + hasGarage + " ");
        str.append("hasGarden: " + hasGarden + ";");

        return str.toString();
    }
}
