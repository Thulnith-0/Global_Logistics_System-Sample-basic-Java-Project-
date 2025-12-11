package logistics_core;

import java.util.ArrayList;
import java.util.Collections;

public class WestminsterLogisticsManager implements LogisticsManager {

    //1. The database (An ArrayList that can hold trucks and drones)
    //we make it public so we can access it easily in the exam context
    public ArrayList<Vehicle> vehicleList;
    public WestminsterLogisticsManager(){
        //Initialize the empty list
        vehicleList = new ArrayList<>();
    }

    //2. Add Vehicle Logic
    @Override
    public void addVehicle(Vehicle v){
        if (vehicleList.size() < 100){
            vehicleList.add(v);
            System.out.println("Success! Vehicle added.");
        }
        else {
            System.out.println("Error: Parking is full.");
        }
    }
    //3. List vehicle logic
    @Override
    public void listVehicles(){
        System.out.println("\n--- FLEET LIST ---");

        for (Vehicle v : vehicleList){
            //polymorphism: java automatically picks the right toString()
            // (Truck version or Drone version)
            System.out.println(v.toString());
        }
    }

    //4. Sort vehicles Logic
    @Override
    public void sortVehicles() {
        //This command works because we added "implements Comparable" in Vehicle.java
        Collections.sort(vehicleList);
        System.out.println("Fleet sorted by capacity (Smallest to Biggest).");
    }
}
