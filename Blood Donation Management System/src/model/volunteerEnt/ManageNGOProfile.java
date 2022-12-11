/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteerEnt;

import Sql.SQLConnection;
import java.sql.*;


/**
 *
 * @author surajvisvesh
 */
public class ManageNGOProfile {


    public NGOManagement populateTFs(String userName) {
        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT * FROM NGO WHERE user_name='" + userName + "'";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    System.out.println("entered if rs. block");
                    NGOManagement ngoProfile = new NGOManagement();
                 
                    
                    
                    ngoProfile.setUsername(rs.getString("user_name"));
                    ngoProfile.setName(rs.getString("Name"));
                    ngoProfile.setEmail(rs.getString("Email"));
                    ngoProfile.setPassword(rs.getString("Password"));
                    ngoProfile.setPhoneNo(rs.getLong("Phone_number"));
                    ngoProfile.setStreet(rs.getString("Street_address"));
                    ngoProfile.setCity(rs.getString("City"));
                    ngoProfile.setState(rs.getString("State"));
                    ngoProfile.setPincode(rs.getInt("Pincode"));
                    ngoProfile.setLicense_path("approval_file");
                    
                    return ngoProfile;
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
