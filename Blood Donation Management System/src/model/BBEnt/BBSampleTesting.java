/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BBEnt;

import Sql.SQLConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prishaa
 */
public class BBSampleTesting {
   
     public ResultSet populateTable(DefaultTableModel model) {
        
        try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT * FROM sample_testing";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    while (rs.next()) {
                        System.out.println("entered if rs. block");
                        int sample_id = rs.getInt("sample_id");
                        String bloodBank = rs.getString("bb_username");
                        String bloodGroup = rs.getString("bloodGroup");
                        int bloodQty = rs.getInt("bloodQty");
                       
                        
                        Object row[] = {sample_id, bloodBank,bloodGroup, bloodQty};
                        model.insertRow(0,row);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        return null;
        
    }
     
     public void testSample(int sample_id, String bb_username, String collectionDt, int bloodGroup1, String bloodGroup) {
        try {
            Connection con = SQLConnection.establishConnection();
            if (con != null) {
                String query = "UPDATE sample_testing SET testStatus='Tested' WHERE sample_id=" + sample_id + "";
               // String query1 = "UPDATE blood_bank_sample SET ----> logic for incrementing blood qty in blood inventory table ";

                PreparedStatement pstmt = con.prepareStatement(query);
               

                int count = pstmt.executeUpdate();


                    JOptionPane.showMessageDialog(null, "Blood sample has been tested.");
                   // System.out.println("Email User.");

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
          //  System.out.println("insert camp ");

        }
    }
    
}
