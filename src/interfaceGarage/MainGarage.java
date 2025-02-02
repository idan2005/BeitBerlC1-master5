package interfaceGarage;

public class MainGarage {

    private static GarageDB garageDB;

    public static void start() {
        garageDB = new GarageDB();
        garageDB.initMap();
        build(1,"Honda CBR500R");
        build(1,"Kawasaki Ninja");
        build(2,"Honda Civic");
        build(2,"Ford Focus");
        build(3,"Ford Ranger");
        build(3,"Volvo FMX" );
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
}
