package Heritage2;

public class PC extends Computer{
    private int PSU;
    private int wph;


    public PC(String OS, String coolingSystem, boolean customBuild, int refreshRate, int PSU, int wph) {
        super(OS, coolingSystem, customBuild, refreshRate);
        setPSU(PSU);
        setWph(wph);

    }

    public PC(double price, double screenLengthInch, double screenWidthInch, String brand, String model, double weight, String resolution, String OS, String coolingSystem, boolean customBuild, int refreshRate, int PSU, int wph) {
        super(price, screenLengthInch, screenWidthInch, brand, model, weight, resolution, OS, coolingSystem, customBuild, refreshRate);
        setPSU(PSU);
        setWph(wph);
    }

    public int getPSU() {
        return PSU;
    }

    public void setPSU(int PSU) {
        this.PSU = PSU;
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
        return "PC{" +
                " coolingSystem='" + coolingSystem + '\'' +
                ", customBuild=" + customBuild +
                ", PSU=" + PSU +
                super.toString();
    }
}
