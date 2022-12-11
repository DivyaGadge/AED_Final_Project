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
public class manageBBWarehouseProfile {
    
    public BBWarehouse populateTFs(String userName) {
        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT * FROM BloodBankWarehouse WHERE user_name='" + userName + "'";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    System.out.println("entered if rs. block");
                    BBWarehouse bbwarehouseProfile = new BBWarehouse();
                 
                    
                    
                    bbwarehouseProfile.setUsername(rs.getString("user_name"));
                    bbwarehouseProfile.setName(rs.getString("Name"));
                    bbwarehouseProfile.setEmail(rs.getString("Email"));
                    bbwarehouseProfile.setPassword(rs.getString("Password"));
                    bbwarehouseProfile.setPhoneNo(rs.getLong("Phone_number"));
                    bbwarehouseProfile.setStreet(rs.getString("Street_address"));
                    bbwarehouseProfile.setCity(rs.getString("City"));
                    bbwarehouseProfile.setState(rs.getString("State"));
                    bbwarehouseProfile.setPincode(rs.getInt("Pincode"));
                    //bbwarehouseProfile.setLicense_path("approval_file");
                    
                    return bbwarehouseProfile;
                    }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
