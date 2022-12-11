/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.volunteerEnt;

import Sql.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author surajvisvesh
 */
public class NGOLogistics {

    JComboBox jComboBox1;

    public void populateTable(DefaultTableModel model) {
        try {
            System.out.println("entered try block");
            Connection con = SQLConnection.establishConnection();
            System.out.println(con);
            if (con != null) {
                System.out.println("entered if con not null block");

                String query = "SELECT C.Camp_id, C.campName, C.status, SUM(quantity) available_qty,BSC.status  FROM blood_sample_collection BSC INNER JOIN Camps C ON BSC.camp_id = C.camp_id WHERE C.status = 'closed' AND BSC.status='At warehouse' GROUP BY C.camp_id, C.status, BSC.status;";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    System.out.println("entered if rs. block, sql");
                    int camp_id = rs.getInt("C.Camp_id");
                    String camp_name = rs.getString("C.CampName");
                    String camp_status = rs.getString("C.status");
                    int available_qty = rs.getInt("available_qty");
                    String bsc_status = rs.getString("BSC.status");

                    Object row[] = {camp_id, camp_name, camp_status, available_qty, bsc_status};
                    model.addRow(row);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

    public void orderPlacement(int camp_id, String camp_name, String camp_status, int available_qty, String bsc_status, String logistics_name) {

        try {
            Connection con = SQLConnection.establishConnection();
            if (con != null) {
                String query = "SELECT blood_id FROM blood_sample_collection WHERE camp_id = " + camp_id + "";
                PreparedStatement pstmt;
                int count;
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                List<Integer> blood_id = new ArrayList<Integer>();
                while (rs.next()) {
                    blood_id.add(rs.getInt("blood_id"));
                }
//                Iterator it = blood_id.iterator();
                for (int k = 0; k < blood_id.size(); k++) {
                    int blood = blood_id.get(k);
                    String query1 = "INSERT INTO Logistics_order(blood_id, logistics_org_username) VALUES(?,?) ";

                    pstmt = con.prepareStatement(query1);
                    pstmt.setInt(1, blood);
                    pstmt.setString(2, logistics_name);
                    count = pstmt.executeUpdate();
                    if (count > 0) {
                        String query2 = "UPDATE blood_sample_collection SET status='Logistics order placed' WHERE camp_id=" + blood + "";
                        pstmt.execute(query2);
                    }

                }

//                String query1 = "INSERT INTO Logistics_order(blood_id, logistics_org_username) VALUES(?,?) ";
//                String query2 = "UPDATE Donor_registration SET donor_status='collected' WHERE registration_id=" + id + "";
//                insert statement
//                String query2 = "UPDATE blood_sample_collection SET status='At Logistics' WHERE camp_id=" + camp_id + "";
//
//                PreparedStatement pstmt = con.prepareStatement(query1);
//                int count = pstmt.executeUpdate();
//                if (count > 0) {
////                    pstmt.execute(query2);
//                    JOptionPane.showMessageDialog(null, "Order has been placed with Logistics Provider.");
//                    System.out.println("Email User.");
//                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("insert camp ");

        }

    }

    public void populateLogisticsCombo(JComboBox jComboBox1) {

        this.jComboBox1 = jComboBox1;

        try {
            Connection con = SQLConnection.establishConnection();
            if (con != null) {
                String query = "SELECT user_name FROM Logistics_Org";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    jComboBox1.addItem(rs.getString("user_name"));
                }
            }

        } catch (SQLException e) {
            System.out.println("log CB population");
        }

    }
}
