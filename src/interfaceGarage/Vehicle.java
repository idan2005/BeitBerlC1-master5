package interfaceGarage;

public abstract class Vehicle implements Fixable,  Comparable<Vehicle> {

    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract int getFixedTime();
    // Implement compareTo to compare vehicles by their fix time

    @Override
    public int compareTo(Vehicle other) {
        return this.model.compareTo(other.model);  // Sort vehicles alphabetically by name
    }
}
