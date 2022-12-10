/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Login;

import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Ecosystem.Mail;
import model.volunteerEnt.NGOManagement;
/**
 *
 * @author surajvisvesh
 */
public class OrganizationRegistration {
    
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
    private String license_path;
    private final String approval_status = "not_approved";
//    private String enterprise;
    
    public void registration(String userType, String username, String name, String email, long phoneNo, String password, String street, String city, String state, int pincode, String license_path) {
        this.userType = userType;
        this.username = username;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.license_path = license_path;
        
        switch (userType) {
                case "NGO Organization":
                    NGOManagement ngo = new NGOManagement();
                    ngo.setName(name);
                    ngo.setUsername(username);
                    ngo.setEmail(email);
                    ngo.setPhoneNo(phoneNo);
                    ngo.setCity(city);
                    ngo.setStreet(street);
                    ngo.setPassword(password);
                    ngo.setPincode(pincode);
                    ngo.setState(state);
                    ngo.setLicense_path(license_path);
                    ngo.setApproval_status(approval_status);
                    

                    try {
                        System.out.println("entered try block");
                        Connection con = SQLConnection.establishConnection();
                        System.out.println(con);
                        if (con != null) {
                            System.out.println("entered if con not null block");
                            String query = "INSERT INTO NGO(user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, license, approval_status) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

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

                            pstmt.setString(10, license_path);
                            pstmt.setString(11, approval_status);
                            int count = pstmt.executeUpdate();
                            if (count == 1) {
                                

                                JOptionPane.showMessageDialog(null, "Thanks for registering. We will notify you once your registration is approved.");
                                Mail.sendEmailMessage(email, "Thanks for registering with *BLOODONATE*. We will update you once your account is approved.");
                                
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "User already exists. Please try a different username or email.", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                case "Hospital Organization":
//                    NGOManagement ngo = new NGOManagement();
//                    ngo.setName(name);
//                    ngo.setUsername(username);
//                    ngo.setEmail(email);
//                    ngo.setPhoneNo(phoneNo);
//                    ngo.setCity(city);
//                    ngo.setStreet(street);
//                    ngo.setPassword(password);
//                    ngo.setPincode(pincode);
//                    ngo.setState(state);
//                    ngo.setLicense_path(license_path);
//                    ngo.setApproval_status(approval_status);

                    try {
                        System.out.println("entered try block");
                        Connection con = SQLConnection.establishConnection();
                        System.out.println(con);
                        if (con != null) {
                            System.out.println("entered if con not null block");
                            String query = "INSERT INTO NGO(user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, license, approval_status) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

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

                            pstmt.setString(10, license_path);
                            pstmt.setString(11, approval_status);
                            int count = pstmt.executeUpdate();
                            if (count == 1) {
                                

                                JOptionPane.showMessageDialog(null, "Thanks for registering. We will notify you once your registration is approved.");
                                Mail.sendEmailMessage(email, "Thanks for registering with *BLOODONATE*. We will update you once your account is approved.");
                                
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "User already exists. Please try a different username or email.", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                    
                case "Bloodbank Organization":
//                    BBMgmt bb = new BBMgmt();
//                    bb.setName(name);
//                    bb.setUsername(username);
//                    bb.setEmail(email);
//                    bb.setPhoneNo(phoneNo);
//                    bb.setCity(city);
//                    bb.setStreet(street);
//                    bb.setPassword(password);
//                    bb.setPincode(pincode);
//                    bb.setState(state);
//                    bb.setLicense_path(license_path);
//                    bb.setApproval_status(approval_status);

                    try {
                        System.out.println("entered try block");
                        Connection con = SQLConnection.establishConnection();
                        System.out.println(con);
                        if (con != null) {
                            System.out.println("entered if con not null block");

                            String query = "INSERT INTO BloodBank_Org(user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, license, approval_status) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

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

                            pstmt.setString(10, license_path);
                            pstmt.setString(11, approval_status);
                            int count = pstmt.executeUpdate();
                            if (count == 1) {
                                

                                JOptionPane.showMessageDialog(null, "Thanks for registering. We will notify you once your registration is approved.");
                                Mail.sendEmailMessage(email, "Thanks for registering with *BLOODONATE*. We will update you once your account is approved.");
                                
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "User already exists. Please try a different username or email.", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                    
                case "Logistics Organization":
//                    NGOManagement ngo = new NGOManagement();
//                    ngo.setName(name);
//                    ngo.setUsername(username);
//                    ngo.setEmail(email);
//                    ngo.setPhoneNo(phoneNo);
//                    ngo.setCity(city);
//                    ngo.setStreet(street);
//                    ngo.setPassword(password);
//                    ngo.setPincode(pincode);
//                    ngo.setState(state);
//                    ngo.setLicense_path(license_path);
//                    ngo.setApproval_status(approval_status);

                    try {
                        System.out.println("entered try block");
                        Connection con = SQLConnection.establishConnection();
                        System.out.println(con);
                        if (con != null) {
                            System.out.println("entered if con not null block");
                            String query = "INSERT INTO NGO(user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, license, approval_status) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

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

                            pstmt.setString(10, license_path);
                            pstmt.setString(11, approval_status);
                            int count = pstmt.executeUpdate();
                            if (count == 1) {
                                

                                JOptionPane.showMessageDialog(null, "Thanks for registering. We will notify you once your registration is approved.");
                                Mail.sendEmailMessage(email, "Thanks for registering with *BLOODONATE*. We will update you once your account is approved.");
                                
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "User already exists. Please try a different username or email.", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                    
                case "Equipments Provider":
//                    NGOManagement ngo = new NGOManagement();
//                    ngo.setName(name);
//                    ngo.setUsername(username);
//                    ngo.setEmail(email);
//                    ngo.setPhoneNo(phoneNo);
//                    ngo.setCity(city);
//                    ngo.setStreet(street);
//                    ngo.setPassword(password);
//                    ngo.setPincode(pincode);
//                    ngo.setState(state);
//                    ngo.setLicense_path(license_path);
//                    ngo.setApproval_status(approval_status);

                    try {
                        System.out.println("entered try block");
                        Connection con = SQLConnection.establishConnection();
                        System.out.println(con);
                        if (con != null) {
                            System.out.println("entered if con not null block");

                            String query = "INSERT INTO NGO(user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, license, approval_status) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

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

                            pstmt.setString(10, license_path);
                            pstmt.setString(11, approval_status);
                            int count = pstmt.executeUpdate();
                            if (count == 1) {
                                

                                JOptionPane.showMessageDialog(null, "Thanks for registering. We will notify you once your registration is approved.");
                                Mail.sendEmailMessage(email, "Thanks for registering with *BLOODONATE*. We will update you once your account is approved.");
                                
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "User already exists. Please try a different username or email.", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                    
                
            }
    }
    
}
