package exercise2;

public class Apartment extends Residential{
    private int rooms;

    public Apartment(String address, double area, double price, int parkingLots, int rooms) {
        super(address, area, price, parkingLots);
        setRooms(rooms);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if(rooms<1){
            rooms=1;
        }
        this.rooms = rooms;
    }

    @Override
    public void taxIt() {
        System.out.println("Tax: "+getPrice()*8/100);
    }

    @Override
    public String toString() {
        return "Apartment: " +
                "rooms=" + rooms + ", "+ super.toString();
    }
}
