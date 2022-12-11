/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteerEnt;

import Sql.SQLConnection;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author surajvisvesh
 */
public class ManageOrgNGO {

    public void populateTable(DefaultTableModel model) {

        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT * FROM NGO_blood_collection_org";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    System.out.println("entered if rs. block");

                    String username = rs.getString("user_name");
                    String ngo_username = rs.getString("NGO_username");
                    String name = rs.getString("Name");
                    String email = rs.getString("Email");
                    String password = rs.getString("Password");
                    String street = rs.getString("Street_address");
                    Long PhoneNo = rs.getLong("Phone_number");
                    String city = rs.getString("City");
                    String state = rs.getString("State");
                    int pincode = rs.getInt("Pincode");
//                        String enterprise = rs.getString("enterprise");
                    String orgType = rs.getString("org_type");

                    Object row[] = {name, orgType, username, password, email, PhoneNo, street, city, state, pincode};
                    model.insertRow(0, row);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
