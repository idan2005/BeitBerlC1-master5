package Heritage2;

public abstract class Computer extends Device{
    protected String OS;
    protected String coolingSystem; // e.g., air-cooled, liquid-cooled
    protected boolean customBuild;
    protected int refreshRate;

    public Computer(String OS, String coolingSystem, boolean customBuild, int refreshRate) {
        setOS(OS);
        setCustomBuild(customBuild);
        setCoolingSystem(coolingSystem);
        setRefreshRate(refreshRate);
    }

    public Computer(double price, double screenLengthInch, double screenWidthInch, String brand, String model, double weight, String resolution, String OS, String coolingSystem, boolean customBuild, int refreshRate) {
        super(price, screenLengthInch, screenWidthInch, brand, model, weight, resolution);
        setOS(OS);
        setCustomBuild(customBuild);
        setCoolingSystem(coolingSystem);
        setRefreshRate(refreshRate);
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public boolean isCustomBuild() {
        return customBuild;
    }

    public void setCustomBuild(boolean customBuild) {
        this.customBuild = customBuild;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    @Override
    public String toString() {
        return  ", OS='" + OS + '\'' +
                ", coolingSystem='" + coolingSystem + '\'' +
                ", customBuild=" + customBuild +
                ", refreshRate=" + refreshRate +
                super.toString();
    }
}
