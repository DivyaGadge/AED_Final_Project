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

    public ResultSet populateHospitalUserDetailsTable(DefaultTableModel model) {

        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT * FROM CreateHospital WHERE status='open'";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    System.out.println("entered if rs. block");
                    String nameHT = rs.getString("nameHT");
                    String emailHT = rs.getString("emailHT");
                    String HUPass = rs.getString("HUPass");
                    String phoneHT = rs.getString("phoneHT");
                    String cityHT = rs.getString("cityHT");
                    String stateHT = rs.getString("stateHT");
                    int pinT = rs.getInt("pinT");
                    String streetHT = rs.getString("streetHT");

                    Object row[] = {nameHT, emailHT, HUPass, phoneHT, cityHT, stateHT, pinT, streetHT};
                    model.insertRow(0, row);
                }
            }
//

        } catch(Exception ex) {
            
        }
        return null;

    }

}
