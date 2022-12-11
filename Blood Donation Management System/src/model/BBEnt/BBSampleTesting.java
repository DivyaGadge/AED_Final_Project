/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BBEnt;

import Sql.SQLConnection;
import java.sql.*;
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
                        String bloodBank = rs.getString("bb_username");
                        String bloodGroup = rs.getString("bloodGroup");
                        int bloodQty = rs.getInt("bloodQty");
                       
                        
                        Object row[] = {bloodBank,bloodGroup, bloodQty};
                        model.insertRow(0,row);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        return null;
        
    }
    
}
