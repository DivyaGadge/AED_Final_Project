/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BBEnt;

import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prishaa
 */
public class bbManageBloodReq {
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
                        String orderDt = rs.getString("orderDt");
                        String hospitalName = rs.getString("hospitalName");
                        int bloodUnit = rs.getInt("bloodunit");
                        String bloodType = rs.getString("bloodType");
                     
                        Object row[] = {orderDt,hospitalName,bloodUnit,bloodType};
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
                        String orderDt = rs.getString("orderDt");
                        String deliveryDt = rs.getString("deliveryDt");
                        String logisticSupplier = rs.getString("logisticSupplier");
                        String hospitalName = rs.getString("hospitalName");
                        int bloodUnit = rs.getInt("bloodunit");
                        String bloodType = rs.getString("bloodType");
                       
                        
                        Object row[] = {orderDt,deliveryDt,logisticSupplier,hospitalName,bloodUnit,bloodType};
                        model.insertRow(0,row);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        return null;
        
    }
}
