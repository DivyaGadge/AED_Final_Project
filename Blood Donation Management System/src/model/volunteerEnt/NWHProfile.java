/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteerEnt;

import Sql.SQLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author surajvisvesh
 */
public class NWHProfile {
    public NGOWarehouse populateTFs(String userName) {
        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT * FROM NGO_warehouse WHERE user_name='" + userName + "'";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    System.out.println("entered if rs. block");
                    NGOWarehouse ngoWH = new NGOWarehouse();

                    ngoWH.setUsername(rs.getString("user_name"));
                    ngoWH.setName(rs.getString("Name"));
                    ngoWH.setEmail(rs.getString("Email"));
                    ngoWH.setPassword(rs.getString("Password"));
                    ngoWH.setPhoneNo(rs.getLong("Phone_number"));
                    ngoWH.setStreet(rs.getString("Street_address"));
                    ngoWH.setCity(rs.getString("City"));
                    ngoWH.setState(rs.getString("State"));

                    return ngoWH;
//                    Object[] objects = {name, email, password, Phone_number, Street_address, City, State, Pincode};

//                    nameTF.setText(ngoProfile.getName());
//                    emailTF.setText(ngoProfile.getEmail());
//                    passTF.setText(ngoProfile.getPassword());
//                    phoneTF.setText(String.valueOf(ngoProfile.getPhoneNo()));
//                    streetTF.setText(ngoProfile.getStreet());
//                    cityTF.setText(ngoProfile.getCity());
//                    stateCB.setSelectedItem(ngoProfile.getState());
//                    String license = ngoProfile.getLicense_path();
//                    return objects;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
