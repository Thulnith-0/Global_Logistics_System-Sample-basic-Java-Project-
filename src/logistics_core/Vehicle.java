package logistics_core;

//we use "abstract" because you cannot have a generic vehicle.
//we implement "Comparable" so we can sort them later.
public abstract class Vehicle implements Comparable<Vehicle> {

    //1. Protected Variables (Child classes like Truck need to see these).
    protected  String id;
    protected String brand;
    protected double capacityKg;

    //2. Constructor (To build the object)
    public Vehicle(String id, String brand, double capacityKg){
        this.id = id;
        this.brand = brand;
        this.capacityKg = capacityKg;
    }

    //3. Getters (To read the data safely)
    public String getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }
    public double getCapacityKg(){
        return capacityKg;
    }

    //4. Abstract Method (The rule)
    //We force every child class to calculate its own efficiency score.
    public abstract double calculateEfficiency();

    //5. Sorting logic (Sort by capacity: Small -> Big)

    @Override
    public int compareTo(Vehicle otherVehicle){
        return Double.compare(this.capacityKg, otherVehicle.getCapacityKg());
    }

    //6. Description
    @Override
    public String toString(){
        return "ID: " + id + " | Brand: " + brand + " | Cap: " + capacityKg + "kg";
    }
}






















