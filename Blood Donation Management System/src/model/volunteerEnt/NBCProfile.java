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
import java.util.ArrayList;

/**
 *
 * @author surajvisvesh
 */
public class NBCProfile {

    public NGOBloodCollection populateTFs(String userName) {
        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT * FROM NGO_blood_collection_org WHERE user_name='" + userName + "'";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    System.out.println("entered if rs. block");
                    NGOBloodCollection ngoBC = new NGOBloodCollection();

                    ngoBC.setUsername(rs.getString("user_name"));
                    ngoBC.setName(rs.getString("Name"));
                    ngoBC.setEmail(rs.getString("Email"));
                    ngoBC.setPassword(rs.getString("Password"));
                    ngoBC.setPhoneNo(rs.getLong("Phone_number"));
                    ngoBC.setStreet(rs.getString("Street_address"));
                    ngoBC.setCity(rs.getString("City"));
                    ngoBC.setState(rs.getString("State"));

                    return ngoBC;
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
