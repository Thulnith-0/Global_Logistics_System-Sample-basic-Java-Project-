package logistics_core;
import javax.swing.table.AbstractTableModel; // Import the table tools
import java.util.ArrayList;

public class FleetTableModel extends AbstractTableModel{

    private String[] columnNames = {"ID", "Brand", "Type", "Efficiency", "Capacity",};
    private ArrayList<Vehicle> vehicleList;

    //Constructor: The GUI will pass the list here
    public FleetTableModel(ArrayList<Vehicle> list){
        this.vehicleList = list;
    }

    @Override
    public int getRowCount(){
        return vehicleList.size(); // The table needs to know how many rows to draw
    }

    @Override
    public int getColumnCount(){
        return columnNames.length; //5 Columns
    }

    @Override
    public String getColumnName(int col){
        return columnNames[col]; // The headers
    }

    //THIS IS THE MOST IMPORTANT METHOD
    //THE TABLE ASKS: "What goes in Row X, Column Y?"

    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Vehicle v = vehicleList.get(rowIndex);

        switch (columnIndex){
            case 0: return v.getId();
            case 1: return v.getBrand();
            case 2:
                // Polymorphism check to see what type it is
                if (v instanceof HeavyTruck) return "Truck";
                if (v instanceof DeliveryDrone) return "Drone";
                return "Unknown";
            case 3: return v.calculateEfficiency();
            case 4: return v.getCapacityKg();
            default: return null;
        }
    }
}
