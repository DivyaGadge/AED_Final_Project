/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.serviceProvider;

import Sql.SQLConnection;
import javax.swing.table.DefaultTableModel;
//import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author divyagadge
 */
public class LogisticsDeliveredOrders {

   
       public ResultSet populateTable(DefaultTableModel model) {
        
            try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");
                
                String query = "SELECT * FROM Logistics_order";  //table name in database ..change the table name in db
                Statement stmt = con.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery(query);
                
         while (rs.next()) {
                    System.out.println("entered if rs. block");
                    String order_id = rs.getString("order_id");
                    String Logisitcsorgname = rs.getString("logistics_org_username");
                    String Description = rs.getString("order_decription");
                    String ReceivedFrom = rs.getString("order_received_from");
                    String DeliveryTo = rs.getString("order_recipient");
                    String DeliveryStatus = rs.getString("delivery_status");
                    

                    Object row[] = {order_id, Logisitcsorgname, Description, ReceivedFrom, DeliveryTo, DeliveryStatus};
                    model.insertRow(0, row);
                }

            }
           
            } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
}
}
