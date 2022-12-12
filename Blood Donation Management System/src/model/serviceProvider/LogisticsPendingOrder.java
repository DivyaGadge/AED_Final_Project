/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.serviceProvider;

//import Sql.SQLConnection;
import Sql.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author divyagadge
 */
public class LogisticsPendingOrder {

  
    public java.sql.ResultSet populateTable(DefaultTableModel model) {

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
                    String LogisticSupplier = rs.getString("logisticSupplier");
                    String Description = rs.getString("order_decription");
                    String ReceivedFrom = rs.getString("order_received_from");
                    String DeliveryTo = rs.getString("order_recipient");
                    String DeliveryStatus = rs.getString("delivery_status");
                    

                    Object row[] = {order_id, LogisticSupplier, Description, ReceivedFrom, DeliveryTo, DeliveryStatus};
                    model.insertRow(0, row);
                }

            }
            
           
            } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        return null;
}
  


    public void placeOrder(int order_id, String logisticSupplier, String receivedFrom, String description, String deliveryTo, String deliveryStatus) {
        try {
            Connection con = SQLConnection.establishConnection();
            if (con != null) {
                String query = "UPDATE bbManageBloodRequest SET logisticSupplier ="+logisticSupplier+"WHERE order_id=" + order_id + "";

                PreparedStatement pstmt = con.prepareStatement(query);
               

                int count = pstmt.executeUpdate();


                    JOptionPane.showMessageDialog(null, "Blood sample has been tested.");
                   // System.out.println("Email User.");

            }
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
          //  System.out.println("insert camp ");

        }
    }
        
    
    }
