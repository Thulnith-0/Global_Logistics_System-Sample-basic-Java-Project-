package logistics_core;
import java.util.Scanner;

public class LogisticsMain {
    public static void main(String[] args){

        //1. Create the manager and the scanner
        WestminsterLogisticsManager manager = new WestminsterLogisticsManager();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        //2. The Menu Loop
        while (running){
            System.out.println("\n--- GLOBAL LOGISTICS SYSTEM ---");
            System.out.println("1. Add a Heavy Truck");
            System.out.println("2. Add a Delivery Drone");
            System.out.println("3. List All Vehicles");
            System.out.println("4. Sort by Capacity");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //Fix: Clear the "Enter" key from the buffer

            switch (choice){
                case 1:
                    //Add Truck
                    System.out.println("Enter ID:");
                    String tId = scanner.nextLine();

                    System.out.println("Enter Brand:");
                    String tBrand = scanner.nextLine();

                    System.out.println("Enter Capacity (Kg):");
                    double tCap = scanner.nextDouble();

                    System.out.println("Enter Fuel Tank Size (L):");
                    int tTank = scanner.nextInt();

                    System.out.println("Enter Range (Km):");
                    double tRange = scanner.nextDouble();

                    //Create the Truck object and add it
                    HeavyTruck t = new HeavyTruck(tId, tBrand, tCap, tTank, tRange);
                    manager.addVehicle(t);
                    break;

                case 2:
                    //Add Drone
                    System.out.println("Enter ID:");
                    String dId =scanner.nextLine();
                    scanner.nextLine(); //Safety clear just in case

                    System.out.println("Enter Brand:");
                    String dBrand = scanner.nextLine();

                    System.out.println("Enter Capacity (Kg):");
                    double dCap = scanner.nextDouble();

                    System.out.println("Enter Max Flight Time (Mins):");
                    double dTime = scanner.nextDouble();

                    //Create the Drone object and add it.
                    DeliveryDrone d = new DeliveryDrone(dId, dBrand, dCap, dTime);
                    manager.addVehicle(d);
                    break;

                case 3:
                    manager.listVehicles();
                    break;

                case 4:
                    manager.sortVehicles();
                    manager.listVehicles(); //Show the sorted list immediately
                    break;

                case 0:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
