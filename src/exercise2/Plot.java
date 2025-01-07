package exercise2;

import java.util.HashMap;

public class Plot extends Property{

    public enum TYPE {
        URBAN,
        AGRICULTURAL,
        INDUSTRIAL
    }

    private TYPE type;

    public Plot(String address, double area, double price, TYPE type) {
        super(address, area, price);
        setType(type);
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public void taxIt() {
        HashMap<TYPE, Integer> taxes = new HashMap<>();
        taxes.put(TYPE.URBAN,10);
        taxes.put(TYPE.AGRICULTURAL,2);
        taxes.put(TYPE.INDUSTRIAL,5);
        System.out.println(getPrice()*taxes.get(type)/100);
    }

    @Override
    public String toString() {
        return "Plot: " +
                "type=" + type + ", "+ super.toString();
    }
}
