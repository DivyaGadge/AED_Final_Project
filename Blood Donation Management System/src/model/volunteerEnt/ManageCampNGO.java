/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteerEnt;

import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author surajvisvesh
 */
public class ManageCampNGO {
    
    
    @SuppressWarnings("empty-statement")
    public ResultSet populateTable(int camp_id, DefaultTableModel model) {
        
        try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT * FROM Camps WHERE camp_id=('" + camp_id + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    while (rs.next()) {
                        System.out.println("entered if rs. block");
                        int campId = rs.getInt("camp_id");
                        String ngo_username = rs.getString("ngo_username");
                        String campName = rs.getString("campName");
                        String campDate = rs.getString("campDate");
                        String street = rs.getString("Street_address");
                        double latitude = rs.getDouble("latitude");
                        double longitude = rs.getDouble("longitude");
                        String city = rs.getString("City");
                        String state = rs.getString("State");
                        int pincode = rs.getInt("Pincode");
                        String BBusername = rs.getString("BB_username");
                        String status = rs.getString("status");
                        
                        Object row[] = {campId, campName, campDate, city, state, latitude, longitude, status};
                        model.addRow(row);
                    }
                }
            } catch (SQLException ex) {
                
            }
        return null;
        
    }
    
    
    public void endCamp() {
        
    }
    
}
