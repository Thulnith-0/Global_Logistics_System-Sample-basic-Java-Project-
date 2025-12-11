package logistics_core;

public class HeavyTruck extends Vehicle {
    private int fuelTankSize; //liters
    private double rangeKm; //max distance

    //Constructor
    public HeavyTruck(String id, String brand, double capacityKg, int fuelTankSize, double range){
        super(id,brand,capacityKg);
        this.fuelTankSize = fuelTankSize;
        this.rangeKm = rangeKm;
    }

    @Override
    public double calculateEfficiency(){
        //efficiency = KM per Liter
        return rangeKm / fuelTankSize;
    }

    @Override
    public String toString(){
        return "TRUCK - " + super.toString() + " | Efficiency: " + calculateEfficiency() + " km/l";
    }
}

