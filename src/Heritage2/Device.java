package Heritage2;

public abstract class Device {

    protected double price;
    protected double screenLengthInch;
    protected double screenWidthInch;
    protected String brand;
    protected String model;
    protected double weight;
    protected String resolution;

    public Device() {
    }

    public Device(double price, double screenLengthInch, double screenWidthInch,
                  String brand, String model, double weight, String resolution) {
        setScreenWidthInch(screenWidthInch);
        setPrice(price);
        setScreenLengthInch(screenLengthInch);
        setBrand(brand);
        setModel(model);
        setWeight(weight);
        setResolution(resolution);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScreenLengthInch() {
        return screenLengthInch;
    }

    public void setScreenLengthInch(double screenLengthInch) {
        this.screenLengthInch = screenLengthInch;
    }

    public double getScreenWidthInch() {
        return screenWidthInch;
    }

    public void setScreenWidthInch(double screenWidthInch) {
        this.screenWidthInch = screenWidthInch;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    protected abstract double calculateEph();

    @Override
    public String toString() {
        return ", price=" + price +
                ", screenLengthInch=" + screenLengthInch +
                ", screenWidthInch=" + screenWidthInch +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", resolution='" + resolution+
                ", EPH: "+ calculateEph() + "\n";
    }
}
