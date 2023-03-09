package bg.tu_varna.sit.а3.f21621547;

import java.util.*;

public class Agency {

    private static Agency agency;
    private String name;
    private String address;
    private static List<Property> propertyList;

    private Agency() {}

    public static Agency getInstance() {
        if (agency == null) {
            agency = new Agency();
            propertyList = new ArrayList<>();
        }
        return agency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addProperty(Property toBeAdded) {
        propertyList.add(toBeAdded);
    }

    public void removeProperty(Property toBeRemoved) {
        if(propertyList.contains(toBeRemoved)){
            propertyList.remove(toBeRemoved);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Agency name: " + name);
        stringBuilder.append("Agency address: " + address);
        stringBuilder.append("\n-Properties:\n");

        for (Property p : propertyList) {
            stringBuilder.append(p.toString());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

}
