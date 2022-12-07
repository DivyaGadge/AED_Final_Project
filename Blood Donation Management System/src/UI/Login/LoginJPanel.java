/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Login;

import Sql.SQLConnection;
import UI.NGO.NGOManagementJPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Ecosystem.Mail;

/**
 *
 * @author surajvisvesh
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    JPanel mainFrameCardLayout;

    public LoginJPanel(JPanel mainFrameCardLayout) {
        initComponents();
        this.mainFrameCardLayout = mainFrameCardLayout;
        errorVisibility();
//        Mail mail = new Mail();
        Mail.sendEmailMessage("surajvisvesh@gmail.com", "Thanks for registering with BLOODONATE. We will update you once your account is approved.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_icon = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        userTypeLbl = new javax.swing.JLabel();
        registerBtn = new javax.swing.JPanel();
        registerLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JPanel();
        loginLbl = new javax.swing.JLabel();
        passPanel = new javax.swing.JPanel();
        passTF = new javax.swing.JPasswordField();
        passIcon = new javax.swing.JLabel();
        leftImage = new javax.swing.JLabel();
        usernamePanel = new javax.swing.JPanel();
        usernameIcon = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        userCB = new javax.swing.JComboBox<>();
        usernameLbl1 = new javax.swing.JLabel();
        helloLbl = new javax.swing.JLabel();
        usernameError = new javax.swing.JLabel();
        passError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/suraj/login_icon.png"))); // NOI18N
        add(login_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, 150));

        passLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        passLbl.setForeground(new java.awt.Color(102, 102, 102));
        passLbl.setText("Password");
        add(passLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, -1, -1));

        userTypeLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        userTypeLbl.setForeground(new java.awt.Color(102, 102, 102));
        userTypeLbl.setText("I am a");
        add(userTypeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, -1, -1));

        registerBtn.setBackground(new java.awt.Color(1, 80, 159));

        registerLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        registerLbl.setForeground(new java.awt.Color(255, 255, 255));
        registerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLbl.setText("Register");

        javax.swing.GroupLayout registerBtnLayout = new javax.swing.GroupLayout(registerBtn);
        registerBtn.setLayout(registerBtnLayout);
        registerBtnLayout.setHorizontalGroup(
            registerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registerBtnLayout.setVerticalGroup(
            registerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, 318, -1));

        loginBtn.setBackground(new java.awt.Color(1, 80, 159));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBtnMousePressed(evt);
            }
        });

        loginLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        loginLbl.setForeground(new java.awt.Color(255, 255, 255));
        loginLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLbl.setText("Login");
        loginLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, 318, -1));

        passPanel.setBackground(new java.awt.Color(255, 255, 255));
        passPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        passTF.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        passTF.setBorder(null);
        passTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTFActionPerformed(evt);
            }
        });

        passIcon.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        passIcon.setForeground(new java.awt.Color(102, 102, 102));
        passIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/suraj/password.png"))); // NOI18N

        javax.swing.GroupLayout passPanelLayout = new javax.swing.GroupLayout(passPanel);
        passPanel.setLayout(passPanelLayout);
        passPanelLayout.setHorizontalGroup(
            passPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passPanelLayout.createSequentialGroup()
                .addComponent(passTF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        passPanelLayout.setVerticalGroup(
            passPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passTF, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(passPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(passPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 318, -1));

        leftImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/suraj/home_page.png"))); // NOI18N
        leftImage.setPreferredSize(new java.awt.Dimension(465, 590));
        add(leftImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 690));

        usernamePanel.setBackground(new java.awt.Color(255, 255, 255));
        usernamePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usernameIcon.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        usernameIcon.setForeground(new java.awt.Color(102, 102, 102));
        usernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/suraj/username.png"))); // NOI18N

        usernameTF.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        usernameTF.setBorder(null);

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePanelLayout.createSequentialGroup()
                .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        usernamePanelLayout.setVerticalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(usernameTF, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        add(usernamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, -1, -1));

        userCB.setFont(new java.awt.Font("Helvetica Neue", 3, 16)); // NOI18N
        userCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Patient", "System Admin", "Hospital Organization", "Donor", "NGO Organization", "Hospital Warehouse", "NGO Warehouse", "NGO Blood Collection Organization" }));
        userCB.setBorder(null);
        add(userCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 320, 50));

        usernameLbl1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        usernameLbl1.setForeground(new java.awt.Color(102, 102, 102));
        usernameLbl1.setText("Username");
        add(usernameLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, -1, -1));

        helloLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        helloLbl.setForeground(new java.awt.Color(102, 102, 102));
        helloLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helloLbl.setText("Hello there, Welcome Back!");
        add(helloLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 940, 63));

        usernameError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        usernameError.setForeground(new java.awt.Color(255, 51, 0));
        usernameError.setText("Please enter username!");
        add(usernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 377, -1, 30));

        passError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        passError.setForeground(new java.awt.Color(255, 51, 0));
        passError.setText("Please enter password!");
        add(passError, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 460, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void loginLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLblMousePressed
        // TODO add your handling code here:
        loginBtnFunctionality();
    }//GEN-LAST:event_loginLblMousePressed

    private void loginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMousePressed
        // TODO add your handling code here:
        loginBtnFunctionality();
    }//GEN-LAST:event_loginBtnMousePressed

    private void passTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTFActionPerformed

    public void loginBtnFunctionality() {
        errorVisibility();
        String userCBValue = userCB.getSelectedItem().toString();
        String username = usernameTF.getText();
        String password = String.valueOf(passTF.getPassword());
        switch (userCBValue) {
            case "Doctor":
                if (username.isEmpty()) {
                    usernameError.setVisible(true);
                }
                if (password.isEmpty()) {
                    passError.setVisible(true);
                    break;
                } else if (!username.isEmpty() && !password.isEmpty()) {
                    try {
                        System.out.println("entered try block");
                        Connection con = SQLConnection.establishConnection();
                        System.out.println(con);
                        if (con != null) {
                            System.out.println("entered if con not null block");

                            String query = "SELECT * FROM Doctor WHERE user_name=('" + username + "')";
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
                }

//            case "Patient":
//                System.out.println("Selected Patient");
//                break;
//            case "Hospital Administration":
//                break;
//            case "NGO Administration":
//                System.out.println("Selected Patient");
//                break;
//            case "Bloodbank Administration":
//                System.out.println("Selected Patient");
//                break;
//            case "Bloodbank Warehouse":
//                System.out.println("Selected Patient");
//                break;
//            case "Sample Testing Organization":
//                System.out.println("Selected Patient");
//                break;
//            case "Logistics Organization":
//                System.out.println("Selected Patient");
//                break;
//            case "Equipment Supplier Organizaiton":
//                System.out.println("Selected Patient");
//                break;
            default:
                break;
        }
    }

    public void errorVisibility() {
        usernameError.setVisible(false);
        passError.setVisible(false);
    }

//    public void registrationComboBoxFunctionality() {
//        String userCBValue = userCB.getSelectedItem().toString();
//        String username = usernameTF.getText();
//        String password = String.valueOf(passTF.getPassword());
//        switch (userCBValue) {
//            case "Doctor":
//                try {
//                    Connection con = SQLConnection.establishConnection();
//                    if(con!=null){
//                        String query = "SELECT * FROM Doctor WHERE user_name=?";
//                        PreparedStatement pstmt = con.prepareStatement(query);
//                        pstmt.setString(1, username);
//                        ResultSet rs = pstmt.executeQuery(query);
//                        
//                        if (rs.next()){
//                            String password_sql = rs.getString("password");
//                            if (password.equals(password_sql)){
//                                JOptionPane.showMessageDialog(null, username+"You have been successfully logged in.");
//                                System.out.println("Selected doctor");
//                                mainFrameCardLayout.removeAll();
//                                mainFrameCardLayout.add(new NGOManagementJPanel(mainFrameCardLayout, username_sql));
//                                ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
//                                JOptionPane.showMessageDialog(null, username+"You have been successfully logged in.");
//                                break; 
//                            }
//                            else{
//                                JOptionPane.showMessageDialog(null, username+" does not match with password");
//                            }
//                            
//                        }
//                        else {
//                            JOptionPane.showMessageDialog(null, username+" not registered. Please register with us to login.");
//                        }
//                    }
//                } catch (SQLException ex) {
//                Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
//                
//
//            case "Patient":
//                System.out.println("Selected Patient");
//                break;
//            case "Hospital Administration":
//                break;
//            case "NGO Administration":
//                System.out.println("Selected Patient");
//                break;
//            case "Bloodbank Administration":
//                System.out.println("Selected Patient");
//                break;
//            case "Bloodbank Warehouse":
//                System.out.println("Selected Patient");
//                break;
//            case "Sample Testing Organization":
//                System.out.println("Selected Patient");
//                break;
//            case "Logistics Organization":
//                System.out.println("Selected Patient");
//                break;
//            case "Equipment Supplier Organizaiton":
//                System.out.println("Selected Patient");
//                break;
//            default:
//                break;
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel helloLbl;
    private javax.swing.JLabel leftImage;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel login_icon;
    private javax.swing.JLabel passError;
    private javax.swing.JLabel passIcon;
    private javax.swing.JLabel passLbl;
    private javax.swing.JPanel passPanel;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JPanel registerBtn;
    private javax.swing.JLabel registerLbl;
    private javax.swing.JComboBox<String> userCB;
    private javax.swing.JLabel userTypeLbl;
    private javax.swing.JLabel usernameError;
    private javax.swing.JLabel usernameIcon;
    private javax.swing.JLabel usernameLbl1;
    private javax.swing.JPanel usernamePanel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
