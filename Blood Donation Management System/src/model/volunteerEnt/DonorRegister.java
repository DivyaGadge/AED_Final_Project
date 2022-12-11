/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteerEnt;

import Sql.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author surajvisvesh
 */
public class DonorRegister {
    
    public void RegisterDonor() {
        try {
            Connection con = SQLConnection.establishConnection();
            if (con != null) {
                String query = "INSERT INTO Camps() VALUES()";

                PreparedStatement pstmt = con.prepareStatement(query);
               
                int count = pstmt.executeUpdate();
                if (count == 1) {

                    JOptionPane.showMessageDialog(null, "Thanks for registering. We will notify you once your registration is approved.");
                    System.out.println("Email User.");
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("insert camp ");

        }
    }
    
}
