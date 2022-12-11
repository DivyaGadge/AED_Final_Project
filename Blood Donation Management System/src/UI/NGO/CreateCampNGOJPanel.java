/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NGO;

import Sql.SQLConnection;
import UI.Login.LoginJPanel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author surajvisvesh
 */
public class CreateCampNGOJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCampNGO
     */
    model.volunteerEnt.CreateCampNGO createCamp;
    String ngo_username;
    public CreateCampNGOJPanel(String ngo_username) {
        initComponents();
        this.createCamp = new model.volunteerEnt.CreateCampNGO();
        createCamp.populateBBCB(BBCB);
        errorVisibility();
        this.ngo_username = ngo_username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        streetLbl = new javax.swing.JLabel();
        streetTF = new javax.swing.JTextField();
        cityLbl = new javax.swing.JLabel();
        cityTF = new javax.swing.JTextField();
        stateLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        stateLbl1 = new javax.swing.JLabel();
        pinTF = new javax.swing.JTextField();
        nameLbl2 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        BBCB = new javax.swing.JComboBox<>();
        nameError = new javax.swing.JLabel();
        latTF = new javax.swing.JTextField();
        stateLbl2 = new javax.swing.JLabel();
        stateLbl3 = new javax.swing.JLabel();
        lonTF = new javax.swing.JTextField();
        organizeCampBtn = new javax.swing.JPanel();
        organizeCampLbl = new javax.swing.JLabel();
        campDateTF = new com.toedter.calendar.JDateChooser();
        streetError = new javax.swing.JLabel();
        dateError = new javax.swing.JLabel();
        cityError = new javax.swing.JLabel();
        pinError = new javax.swing.JLabel();
        latitudeError = new javax.swing.JLabel();
        longitudeError = new javax.swing.JLabel();
        streetLbl1 = new javax.swing.JLabel();
        BBError = new javax.swing.JLabel();
        stateCB = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        streetLbl.setText("Street Address*");
        add(streetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 217, -1, -1));

        streetTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetTFActionPerformed(evt);
            }
        });
        add(streetTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 240, 305, -1));

        cityLbl.setText("City*");
        add(cityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 281, -1, -1));
        add(cityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 304, 305, -1));

        stateLbl.setText("State*");
        add(stateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 345, -1, -1));

        nameLbl.setText("Name of the Camp*");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 25, -1, -1));

        stateLbl1.setText("Pincode*");
        add(stateLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 409, -1, -1));
        add(pinTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 432, 305, -1));

        nameLbl2.setText("Camp Date*");
        add(nameLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 89, -1, -1));
        add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 48, 305, -1));

        add(BBCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 305, -1));

        nameError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        nameError.setForeground(new java.awt.Color(255, 51, 0));
        nameError.setText("Enter Valid Input");
        add(nameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 51, -1, -1));
        add(latTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 496, 305, -1));

        stateLbl2.setText("Latitude*");
        add(stateLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 473, -1, -1));

        stateLbl3.setText("Longitude*");
        add(stateLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 473, -1, -1));
        add(lonTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 496, 305, -1));

        organizeCampBtn.setBackground(new java.awt.Color(106, 106, 106));

        organizeCampLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        organizeCampLbl.setForeground(new java.awt.Color(255, 255, 255));
        organizeCampLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        organizeCampLbl.setText("OrganizeCamp");
        organizeCampLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                organizeCampLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout organizeCampBtnLayout = new javax.swing.GroupLayout(organizeCampBtn);
        organizeCampBtn.setLayout(organizeCampBtnLayout);
        organizeCampBtnLayout.setHorizontalGroup(
            organizeCampBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(organizeCampLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        organizeCampBtnLayout.setVerticalGroup(
            organizeCampBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(organizeCampLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        add(organizeCampBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, -1, -1));
        add(campDateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 112, 305, -1));

        streetError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        streetError.setForeground(new java.awt.Color(255, 51, 0));
        streetError.setText("Enter Valid Input");
        add(streetError, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 243, -1, -1));

        dateError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        dateError.setForeground(new java.awt.Color(255, 51, 0));
        dateError.setText("Enter Valid Input");
        add(dateError, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 118, -1, -1));

        cityError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        cityError.setForeground(new java.awt.Color(255, 51, 0));
        cityError.setText("Enter Valid Input");
        add(cityError, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 307, -1, -1));

        pinError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        pinError.setForeground(new java.awt.Color(255, 51, 0));
        pinError.setText("Enter Valid Input");
        add(pinError, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 435, -1, -1));

        latitudeError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        latitudeError.setForeground(new java.awt.Color(255, 51, 0));
        latitudeError.setText("Enter Valid Input");
        add(latitudeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 499, -1, -1));

        longitudeError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        longitudeError.setForeground(new java.awt.Color(255, 51, 0));
        longitudeError.setText("Enter Valid Input");
        add(longitudeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 499, -1, -1));

        streetLbl1.setText("Bloodbank Organizaiton*");
        add(streetLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 153, -1, -1));

        BBError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        BBError.setForeground(new java.awt.Color(255, 51, 0));
        BBError.setText("Enter Valid Input");
        add(BBError, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 179, -1, -1));

        stateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "IllinoisIndiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "MontanaNebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "PennsylvaniaRhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));
        add(stateCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 368, 305, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void streetTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetTFActionPerformed

    private void organizeCampLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizeCampLblMousePressed
        try {
            // TODO add your handling code here:
            organizeCampBtnFunctionality();
        } catch (SQLException ex) {
            Logger.getLogger(CreateCampNGOJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_organizeCampLblMousePressed

    public void organizeCampBtnFunctionality() throws SQLException {

        boolean valid = true;
        int pincode = 0;
        double latitude = 0;
        double longitude = 0;
        String campDate = null;
        String status = "open";
        
        String BBOrg = null;
        String name = nameTF.getText();
        try {
            latitude = Double.parseDouble(latTF.getText());
        } catch (Exception lae) {
            latitudeError.setVisible(true);
            valid = false;
        }
        try {
            longitude = Double.parseDouble(lonTF.getText());
        } catch (Exception loe) {
            longitudeError.setVisible(true);
            valid = false;
        }
        try {
            campDate = campDateTF.getDate().toString();
        } catch (Exception e) {
            dateError.setVisible(true);
            valid = false;
        }

        String street = streetTF.getText();
        String city = cityTF.getText();
        String state = stateCB.getSelectedItem().toString();
        try {
            BBOrg = BBCB.getSelectedItem().toString();
        } catch (NullPointerException e) {
            BBError.setVisible(true);
            valid = false;
        }
        try {
            pincode = Integer.parseInt(pinTF.getText());
        } catch (Exception pe) {
            pinError.setVisible(true);
            valid = false;
        }
        if (name.isEmpty()) {
            nameError.setVisible(true);
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
        if (!(Integer.toString(pincode).length() >= 5 || Integer.toString(pincode).length() <= 6)) {
            pinError.setVisible(true);
            valid = false;
        }

        if (valid) {
            
            createCamp.insertCamp(name, ngo_username, BBOrg, campDate, latitude, longitude, street, city, state, pincode, status);
            emptyTF();
            errorVisibility();
            
        }

        
    }

    public void errorVisibility() {

        nameError.setVisible(false);
        dateError.setVisible(false);
        BBError.setVisible(false);
        streetError.setVisible(false);
        cityError.setVisible(false);
        pinError.setVisible(false);
        latitudeError.setVisible(false);
        longitudeError.setVisible(false);
        

    }

    public void emptyTF() {
        nameTF.setText("");
        campDateTF.setDate(null);
        latTF.setText("");
        lonTF.setText("");
        streetTF.setText("");
        cityTF.setText("");
        pinTF.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BBCB;
    private javax.swing.JLabel BBError;
    private com.toedter.calendar.JDateChooser campDateTF;
    private javax.swing.JLabel cityError;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTF;
    private javax.swing.JLabel dateError;
    private javax.swing.JTextField latTF;
    private javax.swing.JLabel latitudeError;
    private javax.swing.JTextField lonTF;
    private javax.swing.JLabel longitudeError;
    private javax.swing.JLabel nameError;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel nameLbl2;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPanel organizeCampBtn;
    private javax.swing.JLabel organizeCampLbl;
    private javax.swing.JLabel pinError;
    private javax.swing.JTextField pinTF;
    private javax.swing.JComboBox<String> stateCB;
    private javax.swing.JLabel stateLbl;
    private javax.swing.JLabel stateLbl1;
    private javax.swing.JLabel stateLbl2;
    private javax.swing.JLabel stateLbl3;
    private javax.swing.JLabel streetError;
    private javax.swing.JLabel streetLbl;
    private javax.swing.JLabel streetLbl1;
    private javax.swing.JTextField streetTF;
    // End of variables declaration//GEN-END:variables
}