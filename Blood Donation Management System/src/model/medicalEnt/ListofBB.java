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
public class ListofBB {
    
    public ResultSet populateTable(DefaultTableModel model) {

        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");
                
         String query = "SELECT * FROM ListofBloodBank";  //table name in database
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                
         while (rs.next()) {
                    System.out.println("entered if rs. block");
                    String BBName = rs.getString("BBName");
                    String address = rs.getString("StreetAddress");
                    String cityHT = rs.getString("city");
                    String stateHT = rs.getString("state");
                    int pinT = rs.getInt("pincode");
                    String emailHT = rs.getString("email");
                    Long phoneHT = rs.getLong("phone_number");
                    

                    Object row[] = {BBName, address, cityHT, stateHT, pinT, emailHT, phoneHT};
                    model.insertRow(0, row);
                }

            }
            
           
            } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
}
}
