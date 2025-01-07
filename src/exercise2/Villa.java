package exercise2;

public class Villa extends Residential{
    private int levels;

    public Villa(String address, double area, double price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if(levels<1){
            levels=1;
        }
        this.levels = levels;
    }

    @Override
    public void taxIt() {
        System.out.println("Tax: "+getPrice()*8/100);
    }

    @Override
    public String toString() {
        return "Villa: " +
                "levels=" + levels + ", "+ super.toString();
    }
}
