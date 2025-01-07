package Heritage2;

public class SmartPhone extends Device{
    private int battery;
    private int bph;
    private String OS;


    public SmartPhone(int battery, int bph, String OS) {
        setBattery(battery);
        setBph(bph);
        setOS(OS);
    }

    public SmartPhone(double price, double screenLengthInch, double screenWidthInch, String brand, String model, double weight, String resolution, int battery, int bph, String OS) {
        super(price, screenLengthInch, screenWidthInch, brand, model, weight, resolution);
        setBattery(battery);
        setBph(bph);
        setOS(OS);
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getBph() {
        return bph;
    }

    public void setBph(int bph) {
        this.bph = bph;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    protected double calculateEph() {
        return bph;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                " battery=" + battery +
                ", OS='" + OS + '\'' +
                super.toString();
    }
}
