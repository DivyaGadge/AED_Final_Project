/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.medicalEnt;

import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author divyagadge
 */
public class ManageUser {

    public ResultSet populateTable(DefaultTableModel model) {

        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT * FROM Hospital";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    System.out.println("entered if rs. block");
                    String Hospital_Admin = rs.getString("Hospital_Admin");
                    String nameHT = rs.getString("Name");
                    String emailHT = rs.getString("Email");
                    String HUPass = rs.getString("Password");
                    Long phoneHT = rs.getLong("Phone_number");
                    String cityHT = rs.getString("City");
                    String stateHT = rs.getString("State");
                    int pinT = rs.getInt("Pincode");
                    String streetHT = rs.getString("Street_address");

                    Object row[] = {Hospital_Admin, nameHT, emailHT, HUPass, phoneHT, cityHT, stateHT, pinT, streetHT};
                    model.insertRow(0, row);
                }
            }
//

        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

  
}
