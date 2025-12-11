package logistics_core;

import javax.swing.*; //Standard Swing imports
import java.awt.*;
import java.util.ArrayList;

public class FleetGUI extends JFrame{ // It inherits from a Window (JFrame)

    public FleetGUI(ArrayList<Vehicle> List){
        //1. Basic Window Setup
        setTitle("Global Logistics Fleet Dashboard");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// Close only this window, not the whole app

        //2. Create the Model (The Waiter)
        FleetTableModel model = new FleetTableModel(List);

        //3. Create the Table and link it to the Model
        JTable table = new JTable(model);

        //4. Add Sorting (Bonus feature!)
        table.setAutoCreateRowSorter(true);

        //5. Add the table to a ScrollPane (So you can scroll if there are many vehicles)
        JScrollPane scrollPane = new JScrollPane(table);

        //6. Add to the Window
        add(scrollPane, BorderLayout.CENTER);
    }

}
