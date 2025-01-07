package Heritage2;

public class Laptop extends Computer{
    private int battery;
    private boolean touchscreen;
    private int bph;


    public Laptop(String OS, String coolingSystem, boolean customBuild, int refreshRate, int battery, boolean touchscreen, int bph) {
        super(OS, coolingSystem, customBuild, refreshRate);
        setBattery(battery);
        setTouchscreen(touchscreen);
        setBattery(bph);
    }

    public Laptop(double price, double screenLengthInch, double screenWidthInch, String brand,
                  String model, double weight, String resolution, String OS, String coolingSystem,
                  boolean customBuild, int refreshRate, int battery, boolean touchscreen, int bph) {
        super(price, screenLengthInch, screenWidthInch, brand, model, weight, resolution, OS, coolingSystem, customBuild, refreshRate);
        setBattery(battery);
        setTouchscreen(touchscreen);
        setBph(bph);

    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public int getBph() {
        return bph;
    }

    public void setBph(int bph) {
        this.bph = bph;
    }

    @Override
    protected double calculateEph() {
        return bph;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                " battery=" + battery +
                ", touchscreen=" + touchscreen +
                super.toString();
    }
}
