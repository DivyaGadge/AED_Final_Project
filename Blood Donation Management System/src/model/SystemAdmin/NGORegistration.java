/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.SystemAdmin;

import Sql.SQLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author surajvisvesh
 */
public class NGORegistration {

    public void populateTable(DefaultTableModel model) {
        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT * FROM NGO WHERE Approval_status = 'not_approved'";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    System.out.println("entered if rs. block, sql");
                    String user_name = rs.getString("user_name");
                    String Name = rs.getString("Name");
                    String Email = rs.getString("Email");
                    String Password = rs.getString("Password");
                    String Phone_number = rs.getString("Phone_number");
                    String Street_address = rs.getString("Street_address");
                    String City = rs.getString("City");
                    String State = rs.getString("State");
                    int Pincode = rs.getInt("Pincode");
                    String Approval_status = rs.getString("Approval_status");
                    String approval_file = rs.getString("approval_file");

                    Object row[] = {user_name, Name, Email, Password, Phone_number, Street_address, City, State, Pincode, Approval_status};
                    model.addRow(row);

                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

    public void updateUser() {

    }

}
