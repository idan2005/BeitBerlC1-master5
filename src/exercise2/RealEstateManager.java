package exercise2;

import java.util.ArrayList;

public class RealEstateManager {
    private String name;
    private ArrayList<Property> properties= new ArrayList<>();

    public RealEstateManager(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    //Adds a new property to the list of properties.
    public void addProperty(Property p){
        properties.add(p);
    }

    //Returns a list of properties that are priced below the inputted price amount
    public ArrayList<Property> underPrice(double price)
    {
        ArrayList<Property> propertiesUnder = new ArrayList<>();
        for (Property property : properties) {
            if(property.getPrice()<price) {
                propertiesUnder.add(property);
            }
        }
        return propertiesUnder;
    }

    //Calculates and returns the total value of all properties of the current RealEstateManager
    public double totalPropertiesValue()
    {
        double sum=0;
        for (Property property : properties) {
            sum+=property.getPrice();
        }
        return sum;
    }
    @Override
    public String toString() {
        return "RealEstateManager: " +
                "name='" + name + '\'' +
                ", properties=" + properties;
    }
}
