/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Login;

import Sql.SQLConnection;
import UI.Login.LoginJPanel;
import UI.NGO.NGOBloodColJPanel;
import UI.NGO.NGOManagementJPanel;
import UI.NGO.NGOWareHouseJPanel;
import UI.SystemAdmin.SystemAdminJPanel;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author surajvisvesh
 */
public class Login {

    String username;
    String password;
    String userType;
    JPanel mainFrameCardLayout;

    public void loginFunctionality(String username, String password, String userType, JPanel mainFrameCardLayout) {
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.mainFrameCardLayout = mainFrameCardLayout;
        switch (userType) {
            case "NGO Organization":
                try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM Doctor WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            case "NGO Warehouse":
                System.out.println("NGO Warehouse");
                try {
                    System.out.println("entered try block");
                    Connection con = SQLConnection.establishConnection();
                    System.out.println(con);
                    if (con != null) {
                        System.out.println("entered if con not null block");
                        String query = "SELECT user_name, Password FROM NGO_warehouse WHERE user_name=('" + username + "')";
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(query);

                        if (rs.next()) {
                            System.out.println("entered if rs. block");
                            String password_sql = rs.getString("password");
                            String username_sql = rs.getString("user_name");
                            if (password.equals(password_sql)) {
                                mainFrameCardLayout.removeAll();
                                mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                                ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                                JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            case "NGO Blood Collection":
                try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM NGO_blood_collection_org WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            System.out.println("Selected doctor");
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            case "Donor":
                try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM Donor WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            System.out.println("Selected doctor");
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            case "Hospital Organization":
                try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM Hospital WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            System.out.println("Selected doctor");
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            case "Hospital Warehouse":
                try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM Hospital_Warehouse_management WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            System.out.println("Selected doctor");
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            case "Bloodbank Organization":
                try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM BloodBank_Org WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            System.out.println("Selected doctor");
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            case "Doctor":
               try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM Doctor WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            System.out.println("Selected doctor");
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            case "Bloodbank Warehouse":
                try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM BloodBank_Warehouse_Management WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            System.out.println("Selected doctor");
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
//            case "Sample Tester":
//                try {
//                System.out.println("entered try block");
//                Connection con = SQLConnection.establishConnection();
//                System.out.println(con);
//                if (con != null) {
//                    System.out.println("entered if con not null block");
//
//                    String query = "SELECT user_name, Password FROM Doctor WHERE user_name=('" + username + "')";
//                    Statement stmt = con.createStatement();
//                    ResultSet rs = stmt.executeQuery(query);
//
//                    if (rs.next()) {
//                        System.out.println("entered if rs. block");
//                        String password_sql = rs.getString("password");
//                        String username_sql = rs.getString("user_name");
//                        if (password.equals(password_sql)) {
//                            System.out.println("Selected doctor");
//                            mainFrameCardLayout.removeAll();
//                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
//                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
//                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
//                            break;
//                        } else {
//                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
//                        }
//
//                    } else {
//                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
//                    }
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
            case "Logistics Organization":
                try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM Logistics_Org WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            System.out.println("Selected doctor");
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            case "Equipments Provider":
                try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM EquipmentSupplier WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            System.out.println("Selected doctor");
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            case "System Admin":
                try {
                System.out.println("entered try block");
                Connection con = SQLConnection.establishConnection();
                System.out.println(con);
                if (con != null) {
                    System.out.println("entered if con not null block");

                    String query = "SELECT user_name, Password FROM system_admin WHERE user_name=('" + username + "')";
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(query);

                    if (rs.next()) {
                        System.out.println("entered if rs. block");
                        String password_sql = rs.getString("password");
                        String username_sql = rs.getString("user_name");
                        if (password.equals(password_sql)) {
                            System.out.println("Selected doctor");
                            mainFrameCardLayout.removeAll();
                            mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
                            ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
                            JOptionPane.showMessageDialog(mainFrameCardLayout, username + ", You have been successfully logged in.");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, username + ", Please enter correct password", "error message", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "You are not registered. Please register with us to login.", "error message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            default:
                break;
        }

    }
}
