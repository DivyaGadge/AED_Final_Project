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
public class BBWHnewOrder {
//   private int equipment_id;
//private String username;
//private String equipmentName;
//private int equipmentCount;
//private String equipmentSupplier;
//private String equipmentDescription;

    
    public ResultSet populateTable(DefaultTableModel model) {
        
        try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT * FROM newOrder";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    while (rs.next()) {
                        System.out.println("entered if rs. block");
                        int equipmentId = rs.getInt("equipmentId");
                        String bb_username = rs.getString("bb_username");
                        String equipmentName = rs.getString("equipmentName");
                        String equipmentDesc = rs.getString("equipmentDesc");
                        String equipmentSupplier = rs.getString("equipmentSupplier");
                        int equipmentCount = rs.getInt("equipmentCount");
                        
                        Object row[] = {equipmentId,bb_username , equipmentName, equipmentDesc, equipmentCount,equipmentSupplier};
                        model.insertRow(0,row);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        return null;
        
    }
}
   