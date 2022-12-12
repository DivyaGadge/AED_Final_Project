/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;

import java.awt.CardLayout;

/**
 *
 * @author divyagadge
 */
public class ManageandCreateHospitalUsersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNGOOrganizationsJPanel
     */
    public ManageandCreateHospitalUsersJPanel() {
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

        manageHUserCardLayout = new javax.swing.JPanel();
        createHUserBtn = new javax.swing.JPanel();
        createHUserLbl = new javax.swing.JLabel();
        manageHUserBtn = new javax.swing.JPanel();
        manageHUserLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        manageHUserCardLayout.setBackground(new java.awt.Color(255, 255, 255));
        manageHUserCardLayout.setPreferredSize(new java.awt.Dimension(1142, 630));
        manageHUserCardLayout.setLayout(new java.awt.CardLayout());

        createHUserBtn.setBackground(new java.awt.Color(106, 106, 106));
        createHUserBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createHUserBtnMouseClicked(evt);
            }
        });

        createHUserLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        createHUserLbl.setForeground(new java.awt.Color(255, 255, 255));
        createHUserLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createHUserLbl.setText("Create User");
        createHUserLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createHUserLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout createHUserBtnLayout = new javax.swing.GroupLayout(createHUserBtn);
        createHUserBtn.setLayout(createHUserBtnLayout);
        createHUserBtnLayout.setHorizontalGroup(
            createHUserBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createHUserLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        createHUserBtnLayout.setVerticalGroup(
            createHUserBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createHUserLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        manageHUserBtn.setBackground(new java.awt.Color(106, 106, 106));
        manageHUserBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageHUserBtnMouseClicked(evt);
            }
        });

        manageHUserLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        manageHUserLbl.setForeground(new java.awt.Color(255, 255, 255));
        manageHUserLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageHUserLbl.setText("Manage User");
        manageHUserLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageHUserLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageHUserBtnLayout = new javax.swing.GroupLayout(manageHUserBtn);
        manageHUserBtn.setLayout(manageHUserBtnLayout);
        manageHUserBtnLayout.setHorizontalGroup(
            manageHUserBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageHUserLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        manageHUserBtnLayout.setVerticalGroup(
            manageHUserBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageHUserLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageHUserCardLayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createHUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageHUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageHUserBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createHUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(manageHUserCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createHUserLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createHUserLblMousePressed
        // TODO add your handling code here:

        createHUserBtnFunctionality();

    }//GEN-LAST:event_createHUserLblMousePressed

    private void manageHUserLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHUserLblMousePressed
        // TODO add your handling code here:
        manageHUserBtnFunctionality();
    }//GEN-LAST:event_manageHUserLblMousePressed

    private void createHUserBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createHUserBtnMouseClicked
        // TODO add your handling code here:
        createHUserBtnFunctionality();
    }//GEN-LAST:event_createHUserBtnMouseClicked

    private void manageHUserBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHUserBtnMouseClicked
        // TODO add your handling code here:
        manageHUserBtnFunctionality();
    }//GEN-LAST:event_manageHUserBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel createHUserBtn;
    private javax.swing.JLabel createHUserLbl;
    private javax.swing.JPanel manageHUserBtn;
    private javax.swing.JPanel manageHUserCardLayout;
    private javax.swing.JLabel manageHUserLbl;
    // End of variables declaration//GEN-END:variables

    private void createHUserBtnFunctionality() {
        manageHUserCardLayout.removeAll();
        manageHUserCardLayout.add(new CreateHospitalUsersJPanel());
        ((CardLayout) manageHUserCardLayout.getLayout()).next(manageHUserCardLayout);
    }

    private void manageHUserBtnFunctionality() {
        manageHUserCardLayout.removeAll();
        manageHUserCardLayout.add(new ManageHopsitalUsersJPanel());
        ((CardLayout) manageHUserCardLayout.getLayout()).next(manageHUserCardLayout);
    }
}
