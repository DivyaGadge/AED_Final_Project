/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NGO;


import javax.swing.JPanel;

/**
 *
 * @author surajvisvesh
 */
public class CreateOrgNGOJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createOrgNGOJPanel
     */
    
    JPanel manageOrgCardLayout; //
    
    public CreateOrgNGOJPanel() {
        initComponents();
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
        userNameTF = new javax.swing.JTextField();
        userNameLbl = new javax.swing.JLabel();
        orgTypeLbl = new javax.swing.JLabel();
        orgTypeCB = new javax.swing.JComboBox<>();
        stateCB = new javax.swing.JComboBox<>();
        userNameError = new javax.swing.JLabel();
        nameError = new javax.swing.JLabel();
        passError = new javax.swing.JLabel();
        emailError = new javax.swing.JLabel();
        phoneError = new javax.swing.JLabel();
        streetError = new javax.swing.JLabel();
        cityError = new javax.swing.JLabel();
        pinError = new javax.swing.JLabel();
        createOrgBtn = new javax.swing.JPanel();
        createOrgLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        passTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTFActionPerformed(evt);
            }
        });

        emailLbl.setText("Email*");

        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        phoneLbl.setText("Phone*");

        streetLbl.setText("Street Address*");

        streetTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetTFActionPerformed(evt);
            }
        });

        cityLbl.setText("City*");

        stateLbl.setText("State*");

        nameLbl.setText("Name of the Organization*");

        passLbl.setText("Password*");

        stateLbl1.setText("Pincode*");

        userNameLbl.setText("User Name*");

        orgTypeLbl.setText("Organization Type*");

        orgTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Collection Organization", "Sample Testing Organization", "Blood Bank Warehouse" }));
        orgTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgTypeCBActionPerformed(evt);
            }
        });

        stateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "IllinoisIndiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "MontanaNebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "PennsylvaniaRhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        userNameError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        userNameError.setForeground(new java.awt.Color(255, 51, 0));
        userNameError.setText("Field cannot be empty");

        nameError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        nameError.setForeground(new java.awt.Color(255, 51, 0));
        nameError.setText("Field cannot be empty");

        passError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        passError.setForeground(new java.awt.Color(255, 51, 0));
        passError.setText("Field cannot be empty");

        emailError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        emailError.setForeground(new java.awt.Color(255, 51, 0));
        emailError.setText("Field cannot be empty");

        phoneError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        phoneError.setForeground(new java.awt.Color(255, 51, 0));
        phoneError.setText("Field cannot be empty");

        streetError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        streetError.setForeground(new java.awt.Color(255, 51, 0));
        streetError.setText("Field cannot be empty");

        cityError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        cityError.setForeground(new java.awt.Color(255, 51, 0));
        cityError.setText("Field cannot be empty");

        pinError.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        pinError.setForeground(new java.awt.Color(255, 51, 0));
        pinError.setText("Field cannot be empty");

        createOrgBtn.setBackground(new java.awt.Color(106, 106, 106));

        createOrgLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        createOrgLbl.setForeground(new java.awt.Color(255, 255, 255));
        createOrgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createOrgLbl.setText("Create New Organization");

        javax.swing.GroupLayout createOrgBtnLayout = new javax.swing.GroupLayout(createOrgBtn);
        createOrgBtn.setLayout(createOrgBtnLayout);
        createOrgBtnLayout.setHorizontalGroup(
            createOrgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createOrgLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        createOrgBtnLayout.setVerticalGroup(
            createOrgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createOrgLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

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
                                    .addGap(202, 202, 202)))
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
                            .addComponent(stateCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pincodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pinError))))
                    .addComponent(cityError))
                .addGap(31, 31, 31)
                .addComponent(createOrgBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );
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
    private javax.swing.JLabel phoneError;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JLabel pinError;
    private javax.swing.JTextField pincodeTF;
    private javax.swing.JComboBox<String> stateCB;
    private javax.swing.JLabel stateLbl;
    private javax.swing.JLabel stateLbl1;
    private javax.swing.JLabel streetError;
    private javax.swing.JLabel streetLbl;
    private javax.swing.JTextField streetTF;
    private javax.swing.JLabel userNameError;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameTF;
    // End of variables declaration//GEN-END:variables
}
