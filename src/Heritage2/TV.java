package Heritage2;

public class TV extends Device{
    private String displayType;
    private int refreshRate;
    private int wph;

    public TV(String displayType, int refreshRate, int wph) {
        setDisplayType(displayType);
        setRefreshRate(refreshRate);
        setWph(wph);
    }

    public TV(double price, double screenLengthInch, double screenWidthInch, String brand, String model, double weight, String resolution, String displayType, int refreshRate, int wph) {
        super(price, screenLengthInch, screenWidthInch, brand, model, weight, resolution);
        setDisplayType(displayType);
        setRefreshRate(refreshRate);
        setWph(wph);
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public int getWph() {
        return wph;
    }

    public void setWph(int wph) {
        this.wph = wph;
    }

    @Override
    protected double calculateEph() {
        return wph;
    }

    @Override
    public String toString() {
        return "TV{" +
                " displayType='" + displayType + '\'' +
                ", refreshRate=" + refreshRate +
                 super.toString();
    }
}
