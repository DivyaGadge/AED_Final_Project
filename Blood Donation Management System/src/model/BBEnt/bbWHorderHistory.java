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

public class bbWHorderHistory {
  public ResultSet populateTable(DefaultTableModel model) {
        
        try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT * FROM BBbloodInventory";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    while (rs.next()) {
                        System.out.println("entered if rs. block");
                        int bloodAp = rs.getInt("bloodAp");
                        int bloodAm = rs.getInt("bloodAm");
                        int bloodBp = rs.getInt("bloodBp");
                        int bloodBm= rs.getInt("bloodBm");
                        int bloodABp = rs.getInt("bloodABp");
                        int bloodABm = rs.getInt("bloodABm");
                        int bloodOp = rs.getInt("bloodOp");
                        int bloodOm = rs.getInt("bloodOm");
                       
                        
                        Object row[] = {bloodAp,bloodAm , bloodBp, bloodBm, bloodABp,bloodABm,bloodOp,bloodOm};
                        model.insertRow(0,row);
                    }
                }
            } catch (SQLException ex) {
                
            }
        return null;
        
    }
}
