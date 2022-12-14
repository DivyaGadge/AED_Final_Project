/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;



/**
 *
 * @author divyagadge
 */
public class DoctorHospProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNGOProfileJPanel
     */
    public DoctorHospProfileJPanel() {
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

        docnameLbl = new javax.swing.JLabel();
        DpassLbl = new javax.swing.JLabel();
        docnameTF = new javax.swing.JTextField();
        DpassTF = new javax.swing.JTextField();
        docemailLbl = new javax.swing.JLabel();
        demailTF = new javax.swing.JTextField();
        docphoneLbl = new javax.swing.JLabel();
        docphoneTF = new javax.swing.JTextField();
        docstreetLbl = new javax.swing.JLabel();
        docstreetTF = new javax.swing.JTextField();
        doccityLbl = new javax.swing.JLabel();
        doccityTF = new javax.swing.JTextField();
        docstateLbl = new javax.swing.JLabel();
        docupdateProfileBtn = new javax.swing.JPanel();
        docupdateProfileLbl = new javax.swing.JLabel();
        docstateCB = new javax.swing.JComboBox<>();
        docpinlbl = new javax.swing.JLabel();
        docpinTF = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        docnameLbl.setText("Doctor Name");

        DpassLbl.setText("Password");

        DpassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DpassTFActionPerformed(evt);
            }
        });

        docemailLbl.setText("Email");

        demailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demailTFActionPerformed(evt);
            }
        });

        docphoneLbl.setText("Phone");

        docstreetLbl.setText("Street Address");

        docstreetTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docstreetTFActionPerformed(evt);
            }
        });

        doccityLbl.setText("City");

        docstateLbl.setText("State");

        docupdateProfileBtn.setBackground(new java.awt.Color(106, 106, 106));

        docupdateProfileLbl.setBackground(new java.awt.Color(215, 215, 215));
        docupdateProfileLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        docupdateProfileLbl.setForeground(new java.awt.Color(255, 255, 255));
        docupdateProfileLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        docupdateProfileLbl.setText("Update Profile");

        javax.swing.GroupLayout docupdateProfileBtnLayout = new javax.swing.GroupLayout(docupdateProfileBtn);
        docupdateProfileBtn.setLayout(docupdateProfileBtnLayout);
        docupdateProfileBtnLayout.setHorizontalGroup(
            docupdateProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(docupdateProfileBtnLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(docupdateProfileLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        docupdateProfileBtnLayout.setVerticalGroup(
            docupdateProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(docupdateProfileBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(docupdateProfileLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        docstateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));
        docstateCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docstateCBActionPerformed(evt);
            }
        });

        docpinlbl.setText("Pincode");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(docupdateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docpinTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docnameLbl)
                    .addComponent(docnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DpassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docphoneLbl)
                    .addComponent(docphoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docstreetLbl)
                    .addComponent(docstreetTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doccityLbl)
                    .addComponent(doccityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docstateLbl)
                    .addComponent(docstateCB, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docemailLbl)
                    .addComponent(DpassLbl)
                    .addComponent(demailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docpinlbl))
                .addContainerGap(783, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(docnameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(docemailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(demailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DpassLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DpassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(docphoneLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docphoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(docstreetLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docstreetTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(doccityLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doccityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(docstateLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docstateCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(docpinlbl)
                .addGap(5, 5, 5)
                .addComponent(docpinTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(docupdateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DpassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DpassTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DpassTFActionPerformed

    private void demailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_demailTFActionPerformed

    private void docstreetTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docstreetTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docstreetTFActionPerformed

    private void docstateCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docstateCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docstateCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DpassLbl;
    private javax.swing.JTextField DpassTF;
    private javax.swing.JTextField demailTF;
    private javax.swing.JLabel doccityLbl;
    private javax.swing.JTextField doccityTF;
    private javax.swing.JLabel docemailLbl;
    private javax.swing.JLabel docnameLbl;
    private javax.swing.JTextField docnameTF;
    private javax.swing.JLabel docphoneLbl;
    private javax.swing.JTextField docphoneTF;
    private javax.swing.JTextField docpinTF;
    private javax.swing.JLabel docpinlbl;
    private javax.swing.JComboBox<String> docstateCB;
    private javax.swing.JLabel docstateLbl;
    private javax.swing.JLabel docstreetLbl;
    private javax.swing.JTextField docstreetTF;
    private javax.swing.JPanel docupdateProfileBtn;
    private javax.swing.JLabel docupdateProfileLbl;
    // End of variables declaration//GEN-END:variables
}
