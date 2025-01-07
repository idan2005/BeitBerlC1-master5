package exercise2;

import java.util.ArrayList;

public class DataManager2 {

    //Initializes and returns a list of pre-defined properties
    public static ArrayList<Property> getInitializedProperties() {
        ArrayList<Property> properties = new ArrayList<>();
        properties.add(new Plot("Tel Aviv, Florentin 1", 150, 3_000_000, Plot.TYPE.URBAN));
        properties.add(new Plot("Herzelia, Waeisman 51", 200, 2_000_000, Plot.TYPE.AGRICULTURAL));

        properties.add(new Apartment("Ramat Gan, Arlozorov 22", 90, 1_200_000, 1, 4));
        properties.add(new Apartment("Tel Aviv, Dizengoff 17", 70, 2_100_000, 0, 3));

        properties.add(new Villa("Caesarea, Shaked 10", 350, 7_500_000, 2, 2));
        properties.add(new Villa("Raanana, Hibiscus 45", 280, 6_000_000, 1, 3));

        properties.add(new Vacation("Eilat, Red Sea 12", 200, 4_000_000, 3, 8));
        properties.add(new Vacation("Tiberias, Galilee 9", 180, 3_500_000, 2, 6));

        properties.add(new Office("Tel Aviv, Rothschild 10", 150, 5_000_000));
        properties.add(new Office("Haifa, Carmel Center 33", 120, 3_200_000));

        properties.add(new Commercial("Petah Tikva, Jabotinsky 98", 400, 8_000_000, 6));
        properties.add(new Commercial("Holon, Industrial Zone 20", 300, 6_500_000, true, 8));

        return properties;
    }


}
