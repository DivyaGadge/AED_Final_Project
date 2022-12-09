/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sql;
import java.sql.*;


/**
 *
 * @author surajvisvesh
 */

//Class to establish connection to local Database.
public class SQLConnection {
    
    static String url = "jdbc:mysql://localhost:3306/bdms";
    private static String user = "root";
    private static String password = "admin@123";
    public static Connection establishConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
    
        } catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
    
    
}
