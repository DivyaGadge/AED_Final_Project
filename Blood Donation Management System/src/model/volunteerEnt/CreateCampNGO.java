/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteerEnt;

import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author surajvisvesh
 */
public class CreateCampNGO {

    JComboBox BBCB;

    public void insertCamp(String name, String ngo_username, String BBOrg, String campDate, double latitude, double longitude, String street, String city, String state, int pincode, String status) throws SQLException {

        try {
            Connection con = SQLConnection.establishConnection();
            if (con != null) {
                String query = "INSERT INTO Camps(ngo_username, campName, campDate, Street_address, latitude, longitude, City, State, Pincode, BB_username, status) VALUES(?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, ngo_username);
                pstmt.setString(2, name);
                pstmt.setString(3, campDate);
                pstmt.setString(4, street);
                pstmt.setDouble(5, latitude);
                pstmt.setDouble(6, longitude);
                pstmt.setString(7, city);
                pstmt.setString(8, state);
                pstmt.setInt(9, pincode);
                pstmt.setString(10, BBOrg);
                pstmt.setString(11, status);

                int count = pstmt.executeUpdate();
                if (count == 1) {

                    JOptionPane.showMessageDialog(null, "Thanks for registering. We will notify you once your registration is approved.");
                    System.out.println("Email User.");
                }

            }
        } catch (SQLException ex) {
            System.out.println("insert camp ");

        }

    }

    public void populateBBCB(JComboBox BBCB) {
        this.BBCB = BBCB;
        try {
            Connection con = SQLConnection.establishConnection();
            if (con != null) {
                String query = "SELECT user_name FROM BB TABLE";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    BBCB.addItem(rs.getString("user_name"));
                }
//                Execute the sql query
            }

        } catch (SQLException e) {
            System.out.println("BBCB population");
        }
    }
}
