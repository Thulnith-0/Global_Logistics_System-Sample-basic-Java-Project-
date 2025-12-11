package logistics_core;

public class DeliveryDrone extends Vehicle {

    private double maxFlightTimeMins;

    public DeliveryDrone(String id, String brand, double capacityKg, double maxFlightTimeMins){
        super(id,brand,capacityKg);
        this.maxFlightTimeMins = maxFlightTimeMins;
    }

    @Override
    public double calculateEfficiency(){
        //For a drone, efficiency is just its max flight time
        return maxFlightTimeMins;
    }

    @Override
    public String toString(){
        return "DRONE - " + super.toString() + " | Flight Time: " + maxFlightTimeMins + " mins";
    }
}
