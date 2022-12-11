/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.medicalEnt;

import model.Hospital;
import Sql.SQLConnection;
import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author divyagadge
 */
public class hospital {
    
    private String username;
    private String name;
    private String password;
    private String email;
    private long phoneNo;
    private String street;
    private String city;
    private String state;
    private int pincode;
    
    
    public void insertOrg(String username,String hospital_username,String name,String email,String password,long phoneNo,String street,String city,String state,int pincode) throws java.sql.SQLException {
        
        switch(hospital_username){
            case "Hospital Org":
                hospital hospitalCreate = new hospital();
                String enterprise_hosp = hospitalCreate.getEnterprise();
                
                try {
                        System.out.println("entered try block");
                        Connection con = (Connection) SQLConnection.establishConnection();
                        System.out.println(con);
                        if (con != null) {
                            System.out.println("entered if con not null block");
                            String query = "INSERT INTO CreateHospital(user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, enterprise, hospital_username) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

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
                            pstmt.setString(10, hospital_username);
                            pstmt.setString(11, enterprise_hosp);
                            int count = pstmt.executeUpdate();
                            if (count == 1) {
                                

                                JOptionPane.showMessageDialog(null, "Thanks for registering. Hospital organization account is now active.");
                                Mail.sendEmailMessage(email, "Thanks for registering with BLOODONATE. Your account is now active.");
                                
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "User already exists. Please try a different username or email.", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                
            case "Warehouse Organization":
                HospWarehouse hospWH = new HospWarehouse();
                String enterprise_nwh = hospWH.getEnterprise();
                
                try {
                        System.out.println("entered try block");
                        Connection con = (Connection) SQLConnection.establishConnection();
                        System.out.println(con);
                        if (con != null) {
                            System.out.println("entered if con not null block");
                            String query = "INSERT INTO Hospital_Warehouse(user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, NGO_username, enterprise) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

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
                            pstmt.setString(10, hospital_username);
                            pstmt.setString(11, enterprise_nwh);
                            int count = pstmt.executeUpdate();
                            if (count == 1) {
                                

                                JOptionPane.showMessageDialog(null, "Thanks for registering. Hospital Warehouseorganization account is now active.");
                                Mail.sendEmailMessage(email, "Thanks for registering with BLOODONATE. Your account is now active.");
                                
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "User already exists. Please try a different username or email.", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                
                
        }
        
        try {
                java.sql.Connection con = SQLConnection.establishConnection();
                if (con != null) {
                    String query = "SELECT user_name FROM BB TABLE";
                    Statement stmt = (Statement) con.createStatement();
//                Execute the sql query
                }

            } catch (SQLException ex) {
                System.out.println("Catch");
            }
    }

    private String getEnterprise() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Connection {

        public Connection() {
        }

        private PreparedStatement prepareStatement(String query) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
    

