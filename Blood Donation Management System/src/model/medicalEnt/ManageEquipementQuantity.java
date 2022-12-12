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
public class ManageEquipementQuantity {
    
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
                    String EquipmentID = rs.getString("equipment_id");
                    String EquipmentName = rs.getString("equipment_name");
                    String Description = rs.getString("equipment_supplier");
                    String HospitalName = rs.getString("hospital_username");
                    int REquiredQ = rs.getInt("equipment_count");
                    
                    

                    Object row[] = {EquipmentID, EquipmentName, Description, REquiredQ, HospitalName};
                    model.insertRow(0, row);
                }

            }
            
           
            } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
}
}

