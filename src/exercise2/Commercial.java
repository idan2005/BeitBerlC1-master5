package exercise2;

public class Commercial extends Property{
    private boolean storeRoom;
    private double yield;

    public Commercial(String address, double area, double price, double yield) {
        super(address, area, price);
        setYield(yield);
        setStoreRoom(false);
    }

    public Commercial(String address, double area, double price, boolean storeRoom, double yield) {
        super(address, area, price);
        setStoreRoom(storeRoom);
        setYield(yield);
    }

    public boolean isStoreRoom() {
        return storeRoom;
    }

    public void setStoreRoom(boolean storeRoom) {
        this.storeRoom = storeRoom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        if(yield < 0.0){
            yield=0.0;
        }
        this.yield = yield;
    }

    public void expectedYield(){
        System.out.println(String.format("Expected Monthly Profit: %.2f", (getPrice() * (yield/100) / 12)));
    }

    @Override
    public void taxIt() {
        System.out.println("Tax: "+getPrice()*5/100);
    }

    @Override
    public String toString() {
        return "Commercial: " +
                "storeRoom=" + storeRoom +
                ", yield=" + yield + ", "+ super.toString();
    }
}
