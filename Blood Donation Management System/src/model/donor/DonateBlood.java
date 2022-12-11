/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.donor;

import model.volunteerEnt.*;
import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author surajvisvesh
 */
public class DonateBlood {
    
    public void populateTable(DefaultTableModel model) {
        
        try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT * FROM Camps WHERE status='open'";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    while (rs.next()) {
                        System.out.println("entered if rs. block, sql");
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
                        model.insertRow(0,row);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                
            }
        
    }
    
    
    public void donorRegister(int id, String username) {
        
        try {
            Connection con = SQLConnection.establishConnection();
            if (con != null) {
                String status = "registered";
                String query = "INSERT INTO Donor_registration(camp_id, donor_username, donor_status) VALUES (?,?,?)";

                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setInt(1, id);
                pstmt.setString(2, username);
                pstmt.setString(3, status);
                

                int count = pstmt.executeUpdate();
                if (count == 1) {

                    JOptionPane.showMessageDialog(null, "Registered for the camp.");
                    System.out.println("Email User.");
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("insert camp ");

        }
        
    }
    
}
