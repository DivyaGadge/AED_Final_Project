/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BB;


/**
 *
 * @author prishaa
 */
public class ManageBBProfilePage extends javax.swing.JPanel {

   
    public ManageBBProfilePage() {
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
        pinlbl = new javax.swing.JLabel();
        pinTF = new javax.swing.JTextField();

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

        licenseLbl.setText("Blood Bank License");

        viewLicBtn.setBackground(new java.awt.Color(106, 106, 106));

        viewLicLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewLicLbl.setForeground(new java.awt.Color(255, 255, 255));
        viewLicLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewLicLbl.setText("View License");

        javax.swing.GroupLayout viewLicBtnLayout = new javax.swing.GroupLayout(viewLicBtn);
        viewLicBtn.setLayout(viewLicBtnLayout);
        viewLicBtnLayout.setHorizontalGroup(
            viewLicBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLicBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewLicLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        viewLicBtnLayout.setVerticalGroup(
            viewLicBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLicBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewLicLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLicBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateLicLbl)
                .addContainerGap())
        );
        updateLicBtnLayout.setVerticalGroup(
            updateLicBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLicBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateLicLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        updateProfileBtn.setBackground(new java.awt.Color(106, 106, 106));

        updateProfileLbl.setBackground(new java.awt.Color(215, 215, 215));
        updateProfileLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateProfileLbl.setForeground(new java.awt.Color(255, 255, 255));
        updateProfileLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateProfileLbl.setText("Update Profile");

        javax.swing.GroupLayout updateProfileBtnLayout = new javax.swing.GroupLayout(updateProfileBtn);
        updateProfileBtn.setLayout(updateProfileBtnLayout);
        updateProfileBtnLayout.setHorizontalGroup(
            updateProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProfileBtnLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(updateProfileLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        updateProfileBtnLayout.setVerticalGroup(
            updateProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProfileBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateProfileLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        stateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));
        stateCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateCBActionPerformed(evt);
            }
        });

        pinlbl.setText("Pincode");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pinTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLbl)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streetLbl)
                    .addComponent(streetTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLbl)
                    .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLbl)
                    .addComponent(stateCB, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLbl)
                    .addComponent(passLbl)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinlbl)
                    .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(licenseLbl)
                        .addGap(18, 18, 18)
                        .addComponent(viewLicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateLicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(updateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(808, 808, 808))
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
                .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
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
                .addGap(17, 17, 17)
                .addComponent(pinlbl)
                .addGap(5, 5, 5)
                .addComponent(pinTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateLicBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(licenseLbl)
                    .addComponent(viewLicBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(updateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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

    private void stateCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateCBActionPerformed


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
    private javax.swing.JTextField pinTF;
    private javax.swing.JLabel pinlbl;
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
