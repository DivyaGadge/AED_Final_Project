/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
package UI.NGO;

import Sql.SQLConnection;
import javax.swing.JPanel;
import java.sql.*;
import model.volunteerEnt.CreateOrgNGO;
=======
package UI.BB;
import javax.swing.JPanel;
import Sql.SQLConnection;
import java.sql.*;
import model.BBEnt.CreateBBorg;
import model.Ecosystem.Mail;

>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java

/**
 *
 * @author prishaa
 */

<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
    /**
     * Creates new form createOrgNGOJPanel
     */
    JPanel manageOrgCardLayout; //
    String ngo_username;
    model.volunteerEnt.CreateOrgNGO createOrg;

    public CreateOrgNGOJPanel(String ngo_username) {
        initComponents();
        this.ngo_username = ngo_username;
        this.createOrg = new CreateOrgNGO();
        errorVisibility();
=======
        
        
 public class CreateOrgBBJPanel extends javax.swing.JPanel {


    JPanel manageOrgCardLayout; //
    
    String bb_username;
    model.BBEnt.CreateBBorg createOrg;

    public CreateOrgBBJPanel(String bb_username) {
        initComponents();
        this.bb_username = bb_username;
        this.createOrg = new CreateBBorg();
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java

    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTF = new javax.swing.JTextField();
        passTF = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        phoneLbl = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        streetLbl = new javax.swing.JLabel();
        streetTF = new javax.swing.JTextField();
        cityLbl = new javax.swing.JLabel();
        cityTF = new javax.swing.JTextField();
        stateLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        stateLbl1 = new javax.swing.JLabel();
        pincodeTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        userNameLbl = new javax.swing.JLabel();
        orgTypeLbl = new javax.swing.JLabel();
        orgTypeCB = new javax.swing.JComboBox<>();
        stateCB = new javax.swing.JComboBox<>();
        nameError = new javax.swing.JLabel();
        createOrgBtn = new javax.swing.JPanel();
        createOrgLbl = new javax.swing.JLabel();
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
        streetError = new javax.swing.JLabel();
        cityError = new javax.swing.JLabel();
        stateError = new javax.swing.JLabel();
        pinError = new javax.swing.JLabel();
        emailError = new javax.swing.JLabel();
        phoneNoError = new javax.swing.JLabel();
        passError = new javax.swing.JLabel();
        usernameError = new javax.swing.JLabel();
=======
        stateError = new javax.swing.JLabel();
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, 305, -1));

        passTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTFActionPerformed(evt);
            }
        });
        add(passTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 143, 305, -1));

        emailLbl.setText("Email*");
        add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 221, -1, -1));

        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });
        add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 244, 305, -1));

        phoneLbl.setText("Phone*");
        add(phoneLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 213, -1, -1));
        add(phoneTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 236, 305, -1));

        streetLbl.setText("Street Address*");
        add(streetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 323, -1, -1));

        streetTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetTFActionPerformed(evt);
            }
        });
        add(streetTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 346, 305, -1));

        cityLbl.setText("City*");
        add(cityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 323, -1, -1));
        add(cityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 346, 305, -1));

        stateLbl.setText("State*");
        add(stateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 423, -1, -1));

<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
        nameLbl.setText("Name of the Organization*");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, -1, -1));
=======
        nameLbl.setText("Name of Organisation*");
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java

        passLbl.setText("Password*");
        add(passLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 120, -1, -1));

        stateLbl1.setText("Pincode*");
        add(stateLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 423, -1, -1));
        add(pincodeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 446, 305, -1));
        add(usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 143, 305, -1));

        userNameLbl.setText("User Name*");
        add(userNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, -1, -1));

        orgTypeLbl.setText("Organization Type*");
        add(orgTypeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 22, -1, -1));

<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
        orgTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Collection Organization", "Warehouse Organization" }));
=======
        orgTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Bank", "Blood Bank Warehouse" }));
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
        orgTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgTypeCBActionPerformed(evt);
            }
        });
        add(orgTypeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 45, 305, -1));

        stateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "IllinoisIndiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "MontanaNebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "PennsylvaniaRhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));
        add(stateCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 446, 305, -1));

        nameError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        nameError.setForeground(new java.awt.Color(255, 51, 0));
        nameError.setText("Enter Valid Input");
        add(nameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        createOrgBtn.setBackground(new java.awt.Color(106, 106, 106));

        createOrgLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        createOrgLbl.setForeground(new java.awt.Color(255, 255, 255));
        createOrgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
        createOrgLbl.setText("Create New Organization");
        createOrgLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createOrgLblMousePressed(evt);
            }
        });
=======
        createOrgLbl.setText("Create New Organisation");
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java

        javax.swing.GroupLayout createOrgBtnLayout = new javax.swing.GroupLayout(createOrgBtn);
        createOrgBtn.setLayout(createOrgBtnLayout);
        createOrgBtnLayout.setHorizontalGroup(
            createOrgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createOrgLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        createOrgBtnLayout.setVerticalGroup(
            createOrgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createOrgLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
        add(createOrgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 510, 190, -1));

        streetError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        streetError.setForeground(new java.awt.Color(255, 51, 0));
        streetError.setText("Enter Valid Input");
        add(streetError, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        cityError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        cityError.setForeground(new java.awt.Color(255, 51, 0));
        cityError.setText("Enter Valid Input");
        add(cityError, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, -1, -1));

        stateError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        stateError.setForeground(new java.awt.Color(255, 51, 0));
        stateError.setText("Enter Valid Input");
        add(stateError, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        pinError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        pinError.setForeground(new java.awt.Color(255, 51, 0));
        pinError.setText("Enter Valid Input");
        add(pinError, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, -1, -1));

        emailError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        emailError.setForeground(new java.awt.Color(255, 51, 0));
        emailError.setText("Enter valid data");
        add(emailError, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        phoneNoError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        phoneNoError.setForeground(new java.awt.Color(255, 51, 0));
        phoneNoError.setText("Enter valid data");
        add(phoneNoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, -1, -1));

        passError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        passError.setForeground(new java.awt.Color(255, 51, 0));
        passError.setText("Enter valid data");
        add(passError, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, -1, -1));

        usernameError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        usernameError.setForeground(new java.awt.Color(255, 51, 0));
        usernameError.setText("Enter valid data");
        add(usernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));
=======
        stateError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        stateError.setForeground(new java.awt.Color(255, 51, 0));
        stateError.setText("Field cannot be empty");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userNameLbl)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(userNameError))
                                .addComponent(passLbl)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(passError))
                                .addComponent(emailLbl)
                                .addComponent(streetLbl)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(streetTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(streetError))
                                .addComponent(cityLbl)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cityError))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(emailError))
                                .addComponent(phoneLbl)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(phoneError)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameLbl)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(nameError)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(stateLbl)
                                    .addGap(472, 472, 472))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(stateCB, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(stateError)
                                    .addGap(61, 61, 61)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(stateLbl1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pincodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pinError))
                                .addComponent(orgTypeLbl)
                                .addComponent(orgTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(createOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349)))
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(nameError))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orgTypeLbl)
                        .addGap(6, 6, 6)
                        .addComponent(orgTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addComponent(userNameLbl)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameError))
                .addGap(16, 16, 16)
                .addComponent(passLbl)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passError))
                .addGap(18, 18, 18)
                .addComponent(emailLbl)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailError))
                .addGap(18, 18, 18)
                .addComponent(phoneLbl)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneError))
                .addGap(19, 19, 19)
                .addComponent(streetLbl)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streetError))
                .addGap(18, 18, 18)
                .addComponent(cityLbl)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateLbl)
                            .addComponent(stateLbl1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(stateCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stateError))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pincodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pinError))))
                    .addComponent(cityError))
                .addGap(31, 31, 31)
                .addComponent(createOrgBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
    }// </editor-fold>//GEN-END:initComponents

    private void passTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFActionPerformed

    private void streetTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetTFActionPerformed

    private void orgTypeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgTypeCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgTypeCBActionPerformed

<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
    private void createOrgLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createOrgLblMousePressed
        // TODO add your handling code here:
        registerBtnFunctionality();
    }//GEN-LAST:event_createOrgLblMousePressed

=======
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
    public void registerBtnFunctionality() {
        boolean valid = true;
        long phoneNo = 0;
        int pincode = 0;

        String name = nameTF.getText();
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
        String username = usernameTF.getText();
=======
        String username = userNameTF.getText();
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
        String email = emailTF.getText();
        String password = passTF.getText();
        try {
            phoneNo = Long.parseLong(phoneTF.getText());
        } catch (NumberFormatException e) {
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
            phoneNoError.setVisible(false);
=======
            phoneError.setVisible(false);
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
            valid = false;
        }
        String street = streetTF.getText();
        String city = cityTF.getText();
        String state = stateCB.getSelectedItem().toString();
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
        String userType = orgTypeCB.getSelectedItem().toString();
=======
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
        try {
            pincode = Integer.parseInt(pincodeTF.getText());
        } catch (Exception e) {
            pinError.setVisible(true);
            valid = false;
        }
        if (name.isEmpty()) {
            nameError.setVisible(true);
            valid = false;
        }
        if (username.isEmpty()) {
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
            usernameError.setVisible(true);
=======
            userNameError.setVisible(true);
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
            valid = false;
        }
        if (email.isEmpty() || email.length() < 2 || !email.matches("^(.+)@(\\S+)$")) {
            emailError.setVisible(true);
            valid = false;
        }
        if (password.isEmpty()) {
            passError.setVisible(true);
            valid = false;
        }
        if (Long.toString(phoneNo).length() != 10) {
            System.out.println("PhoneNo");
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
            phoneNoError.setVisible(true);
=======
            phoneError.setVisible(true);
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
            valid = false;
        }
        if (street.isEmpty()) {
            streetError.setVisible(true);
            valid = false;
        }
        if (city.isEmpty()) {
            cityError.setVisible(true);
            valid = false;
        }
        if (state.isEmpty()) {
            stateError.setVisible(true);
            valid = false;
        }
        if (!(Integer.toString(pincode).length() >= 5 || Integer.toString(pincode).length() <= 6)) {
            pinError.setVisible(true);
            valid = false;
        }

        if (valid) {

<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
            createOrg.insertOrg(username, ngo_username, name, email, password, phoneNo, street, city, state, pincode, userType);
=======
            createOrg.insertOrg(username, bb_username, name, email, password, phoneNo, street, city, state, pincode);
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
            emptyTF();
        }

    }

    public void errorVisibility() {

        nameError.setVisible(false);
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
        usernameError.setVisible(false);
        emailError.setVisible(false);
        passError.setVisible(false);
        phoneNoError.setVisible(false);
=======
        userNameError.setVisible(false);
        emailError.setVisible(false);
        passError.setVisible(false);
        phoneError.setVisible(false);
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
        streetError.setVisible(false);
        cityError.setVisible(false);
        stateError.setVisible(false);
        pinError.setVisible(false);

    }

    public void emptyTF() {
        nameTF.setText("");
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java
        usernameTF.setText("");
=======
        userNameTF.setText("");
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java
        emailTF.setText("");
        phoneTF.setText("");
        passTF.setText("");
        streetTF.setText("");
        cityTF.setText("");
        pincodeTF.setText("");
    }
<<<<<<< HEAD:Blood Donation Management System/src/UI/NGO/CreateOrgNGOJPanel.java

=======
>>>>>>> prishaa_branch:Blood Donation Management System/src/UI/BB/CreateOrgBBJPanel.java

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityError;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTF;
    private javax.swing.JPanel createOrgBtn;
    private javax.swing.JLabel createOrgLbl;
    private javax.swing.JLabel emailError;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel nameError;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTF;
    private javax.swing.JComboBox<String> orgTypeCB;
    private javax.swing.JLabel orgTypeLbl;
    private javax.swing.JLabel passError;
    private javax.swing.JLabel passLbl;
    private javax.swing.JTextField passTF;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JLabel phoneNoError;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JLabel pinError;
    private javax.swing.JTextField pincodeTF;
    private javax.swing.JComboBox<String> stateCB;
    private javax.swing.JLabel stateError;
    private javax.swing.JLabel stateLbl;
    private javax.swing.JLabel stateLbl1;
    private javax.swing.JLabel streetError;
    private javax.swing.JLabel streetLbl;
    private javax.swing.JTextField streetTF;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JLabel usernameError;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}