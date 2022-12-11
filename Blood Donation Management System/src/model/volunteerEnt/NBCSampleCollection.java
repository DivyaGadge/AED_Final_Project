/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteerEnt;

import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author surajvisvesh
 */
public class NBCSampleCollection {

    public void populateTable(DefaultTableModel model) {
        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT registration_id, C.camp_id, campName, donor_username, Blood_group, Email  FROM Donor_registration DR INNER JOIN Donor D ON DR.donor_username = D.user_name INNER JOIN Camps C ON DR.camp_id = C.camp_id WHERE DR.donor_status='registered' ";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    System.out.println("entered if rs. block, sql");
                    int donorUsername = rs.getInt("registration_id");
                    String bloodGroup = rs.getString("campName");
                    String body_temp = rs.getString("donor_username");
                    String blood_pressure = rs.getString("Blood_group");
                    String pulse_rate = rs.getString("Email");
                    int camp_id = rs.getInt("camp_id");

                    Object row[] = {donorUsername, bloodGroup, body_temp, blood_pressure, pulse_rate, camp_id};
                    model.addRow(row);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

    public void collectSample(int id, String camp_name, String donorUsername, String bloodGroup, String email, int camp_id) {
        try {
            Connection con = SQLConnection.establishConnection();
            if (con != null) {
                String query = "INSERT INTO blood_sample_collection(donor_registration_id, camp_id, blood_group) VALUES(?,?,?)";
                String query2 = "UPDATE Donor_registration SET donor_status='collected' WHERE registration_id=" + id + "";
                System.out.println("berfore execution");
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setInt(1, id);
                pstmt.setInt(2, camp_id);
                pstmt.setString(3, bloodGroup);
                int count = pstmt.executeUpdate();
                System.out.println("after execution");
                if (count > 0) {

                    pstmt.execute(query2);
                    JOptionPane.showMessageDialog(null, "Blood has been collected successfully.");
                    System.out.println("Email User.");
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("insert camp ");

        }
    }
}
