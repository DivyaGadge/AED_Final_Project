/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.medicalEnt;
import Sql.SQLConnection;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author divyagadge
 */
public class ManageDoctorAvail {

   public ResultSet populateTable(DefaultTableModel model) {

        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");
                
         String query = "SELECT * FROM DoctorCampDetails";  //table name in database
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                
        while (rs.next()) {
                    System.out.println("entered if rs. block");
                    String NGOname = rs.getString("NGO_name");
                    String Campdetails = rs.getString("Camp_details");
                    String Location = rs.getString("Location");
                    String date = rs.getString("Date");
//                    int REquiredQ = rs.getInt("equipment_count");
                  
                    Object row[] = {NGOname, Campdetails, Location, date };
                    model.insertRow(0, row);
                }

            }
            
            } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
}
   
   
   
   
    
}
