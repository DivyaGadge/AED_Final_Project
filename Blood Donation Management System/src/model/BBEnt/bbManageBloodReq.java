/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BBEnt;

import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prishaa
 */
public class bbManageBloodReq {
    
    String logisticSupplier;

    public String getLogisticSupplier() {
        return logisticSupplier;
    }

    public void setLogisticSupplier(String logisticSupplier) {
        this.logisticSupplier = logisticSupplier;
    }
    
    
  public ResultSet populateTable(DefaultTableModel model) {
        
        try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT * FROM bbManageBloodRequest";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    while (rs.next()) {
                        System.out.println("entered if rs. block");
                        int order_id=rs.getInt("order_id");
                        String orderDt = rs.getString("orderDt");
                        String hospitalName = rs.getString("hospitalName");
                        int bloodUnit = rs.getInt("bloodunit");
                        String bloodType = rs.getString("bloodType");
                     
                        Object row[] = {order_id,orderDt,hospitalName,bloodUnit,bloodType};
                        model.insertRow(0,row);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        return null;
        
    }
  
  
  
   public ResultSet populateOrderTable(DefaultTableModel model) {
        
        try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT * FROM bbManageBloodRequest";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    while (rs.next()) {
                        System.out.println("entered if rs. block");
                        int order_id=rs.getInt("order_id");
                        String orderDt = rs.getString("orderDt");
                        String deliveryDt = rs.getString("deliveryDt");
                        String logisticSupplier = rs.getString("logisticSupplier");
                        String hospitalName = rs.getString("hospitalName");
                        int bloodUnit = rs.getInt("bloodunit");
                        String bloodType = rs.getString("bloodType");
                       
                        
                        Object row[] = {order_id,orderDt,deliveryDt,hospitalName,bloodUnit,bloodType,logisticSupplier};
                        model.insertRow(0,row);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        return null;
        
    }
   
   
   

   
    

    public void placeOrder(int order_id, String orderDt, String hospital, int bloodUnit, int bloodGroup, String logisticSupplier) {

        try {
            Connection con = SQLConnection.establishConnection();
            if (con != null) {
                String query = "UPDATE bbManageBloodRequest SET logisticSupplier ="+logisticSupplier+"WHERE order_id=" + order_id + "";

                PreparedStatement pstmt = con.prepareStatement(query);
               

                int count = pstmt.executeUpdate();


                    JOptionPane.showMessageDialog(null, "Blood sample has been tested.");
                   // System.out.println("Email User.");

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
          //  System.out.println("insert camp ");

        }
    }
}
