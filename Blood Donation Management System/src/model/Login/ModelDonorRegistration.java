/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Login;

import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.volunteerEnt.Donor;

/**
 *
 * @author surajvisvesh
 */
public class ModelDonorRegistration {

    private String userType;
    private String username;
    private String name;
    private String password;
    private String email;
    private long phoneNo;
    private String street;
    private String city;
    private String state;
    private int pincode;
    private String bloodGroup;
    private String dateOfBirth;

    public void donorRegistration(String username, String name, String email, long phoneNo, String password, String street, String city, String state, int pincode, String dateOfBirth, String NGOCBvalue, String bloodGroup) {

        Donor donor = new Donor();
        donor.setName(name);
        donor.setUsername(username);
        donor.setEmail(email);
        donor.setPhoneNo(phoneNo);
        donor.setCity(city);
        donor.setStreet(street);
        donor.setPassword(password);
        donor.setPincode(pincode);
        donor.setState(state);
        donor.setBloodGroup(bloodGroup);
        donor.setNGOUsername(NGOCBvalue);
        donor.setDate(dateOfBirth);

        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "INSERT INTO Donor(user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, blood_group, DOB, NGO_username) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, username);
                pstmt.setString(2, name);
                pstmt.setString(3, email);
                pstmt.setString(4, password);
                pstmt.setLong(5, phoneNo);
                pstmt.setString(6, street);
                pstmt.setString(7, city);
                pstmt.setString(8, state);
                pstmt.setInt(9, pincode);
                pstmt.setString(10, bloodGroup);
                pstmt.setString(11, dateOfBirth);
                pstmt.setString(12, NGOCBvalue);
                

                int count = pstmt.executeUpdate();
                if (count == 1) {

                    JOptionPane.showMessageDialog(null, "Thanks for registering. We will notify you once your registration is approved.");
                    System.out.println("Email User.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "User already exists. Please try a different username or email.", "Error!", JOptionPane.ERROR_MESSAGE);

        }

    }
}
