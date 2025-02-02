package interfaceGarage;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Garage {

    private Protocol_Garage protocolGarage;
    private HashMap<GarageDB.Vehicle_Type, PriorityQueue<Vehicle>> vehiclesMap;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private boolean isGarageOpen = true;
    private int currentVehicle = 0;
    private int hour = 0;

    public Garage(Protocol_Garage protocolGarage, HashMap<GarageDB.Vehicle_Type, PriorityQueue<Vehicle>> vehiclesMap) {
        this.protocolGarage = protocolGarage;
        this.vehiclesMap = vehiclesMap;
    }

    public void startWork() {
        // convert the map to array
        //this.vehicles = vehicles;

        vehicles.addAll(vehiclesMap.get(GarageDB.Vehicle_Type.MOTORCYCLE));
        vehicles.addAll(vehiclesMap.get(GarageDB.Vehicle_Type.CAR));
        vehicles.addAll(vehiclesMap.get(GarageDB.Vehicle_Type.TRUCK));


        Runnable helloRunnable = new Runnable() {
            @Override
            public void run() {
                tick();
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 1, 1, TimeUnit.SECONDS);
    }

    private void tick() {
        if (!isGarageOpen) {
            return;
        }

        hour++;
        System.out.println("dubug. hour = " + hour);
        Vehicle v = vehicles.get(currentVehicle);

        if (v.getFixedTime() == hour) {
            // vehicle fixed

            v.fixed();
            protocolGarage.fixed();
            hour = 0;
            currentVehicle++;
        }

        if (currentVehicle == vehicles.size()) {
            isGarageOpen = false;
            System.out.println("All fixed = day off!!");
        }
    }
}














