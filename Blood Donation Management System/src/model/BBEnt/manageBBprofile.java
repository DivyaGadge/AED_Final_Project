/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BBEnt;

import Sql.SQLConnection;
import java.sql.*;

/**
 *
 * @author prishaa
 */
public class manageBBprofile {
    
    public BBMgmt populateTFs(String userName) {
        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT * FROM BloodBank WHERE user_name='" + userName + "'";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    System.out.println("entered if rs. block");
                    BBMgmt bbProfile = new BBMgmt();
                 
                    
                    
                    bbProfile.setUsername(rs.getString("user_name"));
                    bbProfile.setName(rs.getString("Name"));
                    bbProfile.setEmail(rs.getString("Email"));
                    bbProfile.setPassword(rs.getString("Password"));
                    bbProfile.setPhoneNo(rs.getLong("Phone_number"));
                    bbProfile.setStreet(rs.getString("Street_address"));
                    bbProfile.setCity(rs.getString("City"));
                    bbProfile.setState(rs.getString("State"));
                    bbProfile.setPincode(rs.getInt("Pincode"));
                    bbProfile.setLicense_path("approval_file");
                    
                    return bbProfile;
                    }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
