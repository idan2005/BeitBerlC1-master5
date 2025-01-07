package exercise2;

public class Office extends Property{
    public Office(String address, double area, double price) {
        super(address, area, price);
    }

    @Override
    public void taxIt() {
        System.out.println("Tax: "+getPrice()*5/100);
    }

    @Override
    public String toString() {
        return "Office: "+ super.toString();
    }
}
