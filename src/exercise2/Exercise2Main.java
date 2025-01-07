package exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise2Main {

    public static RealEstateManager realEstateManager= new RealEstateManager("Shlomo");
    // Starts the flow of the program
    public static void start() {
        realEstateManager.setProperties(DataManager2.getInitializedProperties());
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean keepLooping=true;
        while(keepLooping)
        {
            System.out.println("- - - - - - - - - - \nEnter a number(-1 to exit)\n" +
                    "1-properties List\n2- financial Report\n3-commercial Yield\n4-properties By City\n5- Number Of Cities");
            num =scanner.nextInt();
            switch (num) {
                case -1:
                    keepLooping=false;
                    break;
                case 1:
                    try{
                        propertiesList();
                    }catch (PriceException ex)
                    {
                        System.out.println("Property List Error: "+ex.getMessage());
                    }
                    break;
                case 2:
                    financialReport();
                    break;
                case 3:
                    commercialYield();
                    break;
                case 4:
                    propertiesByCity();
                    break;
                case 5:
                    NumberOfCities();
                    break;
                default:
                    System.out.println("Invalid input, try again");
            }

        }
    }
    //Calculates and prints the number of unique cities from the properties list, each city's name
    private static void NumberOfCities() {
        HashMap<String, Integer> diffCities=new HashMap<>();
        String city,address;
        String allCities="";
        int count=0;
        for (Property property : realEstateManager.getProperties()) {
            address=property.getAddress();
            city = address.substring(0,address.indexOf(","));
            if (city.contains("-")) {
                city = city.replace('-', ' ');
            }
            city = city.toLowerCase();
            if(diffCities.get(city)==null){
                diffCities.put(city,1);
                count++;
                allCities+=city+"\n";
            }
        }
        System.out.println(count);
        System.out.println(allCities);
    }

    //Filters and displays properties located in the inputted city
    private static void propertiesByCity() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a city name");
        String city= s.nextLine();
        if (city.contains("-")) {
            city = city.replace('-', ' ');
        }
        for (Property property : realEstateManager.getProperties()) {
            if(property.getAddress().toLowerCase().contains(city.toLowerCase())){
                System.out.println(property);
            }
        }
    }

    //Calculates and prints the total expected yield from all commercial properties
    private static void commercialYield() {
        double sum=0;
        for (Property property : realEstateManager.getProperties()) {
            if(property instanceof Commercial){
                ((Commercial) property).expectedYield();
                sum+=((Commercial) property).getYield()/100*property.getPrice()/12;
            }
        }
        System.out.println(String.format("Total is: %.2f", sum));
    }

    //Prints for each property the address and tax
    private static void financialReport() {
        for (Property property : realEstateManager.getProperties()) {
            System.out.print(property.getAddress()+": ");
            property.taxIt();
        }
    }

    //Displays all properties priced under the inputted limit.
    // If the limit received it negative the function throws a PriceException
    private static void propertiesList() throws PriceException {
        System.out.println("Enter price");
        Scanner s = new Scanner(System.in);
        double price= s.nextDouble();
        if(price<0){
            throw new PriceException("Invalid price, price cant be negative");
        }
        ArrayList<Property> p = realEstateManager.underPrice(price);
        for (Property property : p) {
            System.out.println(property);
        }
    }

}
