package interfaceGarage;

import java.util.Scanner;

public class MainGarage {

    private static GarageDB garageDB;

    public static void start() {
        garageDB = new GarageDB();
        garageDB.initMap();
        scanVehicles();

       /* garageDB.addVehicle(new MotorCycle("Yamaha"));
        garageDB.addVehicle(new Car("Mercedes"));
        garageDB.addVehicle(new Car("Ferrari"));
        garageDB.addVehicle(new Truck("Isuzu"));*/
        Garage garage = new Garage(protocolGarage,garageDB.getVehicles());
        //garage.startWork(garageDB.getVehicles());
        garage.startWork();

    }

    private static Protocol_Garage protocolGarage = new Protocol_Garage() {
        @Override
        public void fixed() {
            System.out.println("another vehicle fixed $$");
        }
    };

    public static void build(int type, String model) {
        switch (type){
            case 1:
                MotorCycle m =MotorCycle.build(model);
                garageDB.addToMap(GarageDB.Vehicle_Type.MOTORCYCLE,m);
                break;
            case 2:
                Car c =Car.build(model);
                garageDB.addToMap(GarageDB.Vehicle_Type.CAR,c);
                break;
            case 3:
                Truck t =Truck.build(model);
                garageDB.addToMap(GarageDB.Vehicle_Type.TRUCK,t);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    public static void scanVehicles() {
        Scanner scanner = new Scanner(System.in);
        Vehicle v;
        String name;
        int type;
        while(true) {
            System.out.println("Enter a number (0->stop the scan, 1->Motorcycle, 2->Car, 3->Truck)");
            try{
                type = scanner.nextInt();
            }catch (Exception e) {
                e.getMessage();
                type=-1;
            }
            if(type==0){
                break;
            } if(type!=-1){
                scanner.nextLine();
                System.out.println("Enter vehicle name");
            }
            name = scanner.nextLine();
            build(type,name);
        }
    }
}
