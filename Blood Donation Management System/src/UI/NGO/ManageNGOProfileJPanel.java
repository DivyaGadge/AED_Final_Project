/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NGO;

/**
 *
 * @author surajvisvesh
 */
public class ManageNGOProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNGOProfileJPanel
     */
    public ManageNGOProfileJPanel() {
        initComponents();
        userNameLbl.setText("USER NAME!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
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
        licenseLbl = new javax.swing.JLabel();
        viewLicBtn = new javax.swing.JPanel();
        viewLicLbl = new javax.swing.JLabel();
        updateLicBtn = new javax.swing.JPanel();
        updateLicLbl = new javax.swing.JLabel();
        updateProfileBtn = new javax.swing.JPanel();
        updateProfileLbl = new javax.swing.JLabel();
        stateCB = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        userNameLbl.setFont(new java.awt.Font("Helvetica Neue", 2, 20)); // NOI18N
        userNameLbl.setForeground(new java.awt.Color(153, 153, 153));
        userNameLbl.setText("User Name - Delete the text later");

        nameLbl.setText("Name");

        passLbl.setText("Password");

        passTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTFActionPerformed(evt);
            }
        });

        emailLbl.setText("Email");

        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        phoneLbl.setText("Phone");

        streetLbl.setText("Street Address");

        streetTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetTFActionPerformed(evt);
            }
        });

        cityLbl.setText("City");

        stateLbl.setText("State");

        licenseLbl.setText("NGO License");

        viewLicBtn.setBackground(new java.awt.Color(106, 106, 106));

        viewLicLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewLicLbl.setForeground(new java.awt.Color(255, 255, 255));
        viewLicLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewLicLbl.setText("View License");

        javax.swing.GroupLayout viewLicBtnLayout = new javax.swing.GroupLayout(viewLicBtn);
        viewLicBtn.setLayout(viewLicBtnLayout);
        viewLicBtnLayout.setHorizontalGroup(
            viewLicBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewLicLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        viewLicBtnLayout.setVerticalGroup(
            viewLicBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewLicLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        updateLicBtn.setBackground(new java.awt.Color(106, 106, 106));

        updateLicLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateLicLbl.setForeground(new java.awt.Color(255, 255, 255));
        updateLicLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateLicLbl.setText("Update License");

        javax.swing.GroupLayout updateLicBtnLayout = new javax.swing.GroupLayout(updateLicBtn);
        updateLicBtn.setLayout(updateLicBtnLayout);
        updateLicBtnLayout.setHorizontalGroup(
            updateLicBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateLicLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        updateLicBtnLayout.setVerticalGroup(
            updateLicBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateLicLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        updateProfileBtn.setBackground(new java.awt.Color(106, 106, 106));

        updateProfileLbl.setBackground(new java.awt.Color(215, 215, 215));
        updateProfileLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateProfileLbl.setForeground(new java.awt.Color(255, 255, 255));
        updateProfileLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateProfileLbl.setText("Update Organization's Profile");

        javax.swing.GroupLayout updateProfileBtnLayout = new javax.swing.GroupLayout(updateProfileBtn);
        updateProfileBtn.setLayout(updateProfileBtnLayout);
        updateProfileBtnLayout.setHorizontalGroup(
            updateProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateProfileLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        updateProfileBtnLayout.setVerticalGroup(
            updateProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateProfileLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        stateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "IllinoisIndiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "MontanaNebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "PennsylvaniaRhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(licenseLbl)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(viewLicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(updateLicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLbl)
                                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passLbl)
                                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLbl)
                                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneLbl)
                                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(streetLbl)
                                    .addComponent(streetTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityLbl)
                                    .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stateLbl)
                                    .addComponent(stateCB, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(updateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phoneLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(streetLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(streetTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cityLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stateLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(licenseLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewLicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateLicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(updateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTF;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel licenseLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel passLbl;
    private javax.swing.JTextField passTF;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JComboBox<String> stateCB;
    private javax.swing.JLabel stateLbl;
    private javax.swing.JLabel streetLbl;
    private javax.swing.JTextField streetTF;
    private javax.swing.JPanel updateLicBtn;
    private javax.swing.JLabel updateLicLbl;
    private javax.swing.JPanel updateProfileBtn;
    private javax.swing.JLabel updateProfileLbl;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JPanel viewLicBtn;
    private javax.swing.JLabel viewLicLbl;
    // End of variables declaration//GEN-END:variables
}
