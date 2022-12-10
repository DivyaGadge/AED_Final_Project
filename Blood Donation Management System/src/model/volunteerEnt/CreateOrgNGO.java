/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteerEnt;
import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Ecosystem.Mail;
/**
 *
 * @author surajvisvesh
 */
public class CreateOrgNGO {
    
    private String username;
    private String name;
    private String password;
    private String email;
    private long phoneNo;
    private String street;
    private String city;
    private String state;
    private int pincode;
    
    
    public void insertOrg(String username,String ngo_username,String name,String email,String password,long phoneNo,String street,String city,String state,int pincode) {
        
        switch(ngo_username){
            case "Blood Collection Organization":
                NGOBloodCollection ngoBC = new NGOBloodCollection();
                String enterprise_nbc = ngoBC.getEnterprise();
                
                try {
                        System.out.println("entered try block");
                        Connection con = SQLConnection.establishConnection();
                        System.out.println(con);
                        if (con != null) {
                            System.out.println("entered if con not null block");
                            String query = "INSERT INTO NGO_blood_collection_org(user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, enterprise, ngo_username) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

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
                            pstmt.setString(10, ngo_username);
                            pstmt.setString(11, enterprise_nbc);
                            int count = pstmt.executeUpdate();
                            if (count == 1) {
                                

                                JOptionPane.showMessageDialog(null, "Thanks for registering. Bloodbank collection organization account is now active.");
                                Mail.sendEmailMessage(email, "Thanks for registering with *BLOODONATE*. Your account is now active.");
                                
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "User already exists. Please try a different username or email.", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                
            case "Warehouse Organization":
                NGOWarehouse ngoWH = new NGOWarehouse();
                String enterprise_nwh = ngoWH.getEnterprise();
                
                try {
                        System.out.println("entered try block");
                        Connection con = SQLConnection.establishConnection();
                        System.out.println(con);
                        if (con != null) {
                            System.out.println("entered if con not null block");
                            String query = "INSERT INTO NGO_warehouse(user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, NGO_username, enterprise) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

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
                            pstmt.setString(10, ngo_username);
                            pstmt.setString(11, enterprise_nwh);
                            int count = pstmt.executeUpdate();
                            if (count == 1) {
                                

                                JOptionPane.showMessageDialog(null, "Thanks for registering. Bloodbank collection organization account is now active.");
                                Mail.sendEmailMessage(email, "Thanks for registering with *BLOODONATE*. Your account is now active.");
                                
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "User already exists. Please try a different username or email.", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                
                
        }
        
        try {
                Connection con = SQLConnection.establishConnection();
                if (con != null) {
                    String query = "SELECT user_name FROM BB TABLE";
                    Statement stmt = con.createStatement();
//                Execute the sql query
                }

            } catch (SQLException ex) {
                System.out.println("Catch");
            }
    }
    
}
