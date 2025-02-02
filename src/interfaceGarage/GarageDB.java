package interfaceGarage;

import java.util.*;


public class GarageDB {
    public enum Vehicle_Type{
        MOTORCYCLE,
        CAR,
        TRUCK
    }
    private static HashMap<Vehicle_Type, PriorityQueue<Vehicle>> vehiclesQueueHashMap = new HashMap<>();
    //private ArrayList<Vehicle> vehicles = new ArrayList<>();
    public void initMap()
    {
        vehiclesQueueHashMap.put(Vehicle_Type.MOTORCYCLE,new PriorityQueue<>());
        vehiclesQueueHashMap.put(Vehicle_Type.CAR,new PriorityQueue<>());
        vehiclesQueueHashMap.put(Vehicle_Type.TRUCK,new PriorityQueue<>());
    }
   /* public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }*/
    public HashMap<Vehicle_Type, PriorityQueue<Vehicle>> getVehicles() {
        return vehiclesQueueHashMap;
    }

    public void addToMap(Vehicle_Type type, Vehicle vehicle)
    {
        vehiclesQueueHashMap.get(type).add(vehicle);
    }

}
