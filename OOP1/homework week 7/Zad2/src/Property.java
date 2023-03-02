package bg.tu_varna.sit.task2;

public abstract class Property implements Commission {
        double area;
        double price;
        PropertyType propertyType;

    Property(double area, double price, PropertyType propertyType) {
        this.area = area;
        this.price = price;
        this.propertyType = propertyType;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

}
