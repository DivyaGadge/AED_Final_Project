/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BB;

import java.awt.CardLayout;


/**
 *
 * @author HP
 */
public class BBWHmanageRequestsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNGOCamps
     */
    public BBWHmanageRequestsPanel() {
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

        manageWHReqCardLayout = new javax.swing.JPanel();
        pendingReqBtn = new javax.swing.JPanel();
        pendingReqLbl = new javax.swing.JLabel();
        orderHistBtn = new javax.swing.JPanel();
        orderHistLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        manageWHReqCardLayout.setBackground(new java.awt.Color(255, 255, 255));
        manageWHReqCardLayout.setPreferredSize(new java.awt.Dimension(1142, 630));
        manageWHReqCardLayout.setLayout(new java.awt.CardLayout());

        pendingReqBtn.setBackground(new java.awt.Color(106, 106, 106));
        pendingReqBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pendingReqBtnMousePressed(evt);
            }
        });

        pendingReqLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        pendingReqLbl.setForeground(new java.awt.Color(255, 255, 255));
        pendingReqLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pendingReqLbl.setText("Pending Requests");
        pendingReqLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingReqLblMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pendingReqLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pendingReqBtnLayout = new javax.swing.GroupLayout(pendingReqBtn);
        pendingReqBtn.setLayout(pendingReqBtnLayout);
        pendingReqBtnLayout.setHorizontalGroup(
            pendingReqBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pendingReqLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        pendingReqBtnLayout.setVerticalGroup(
            pendingReqBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pendingReqLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        orderHistBtn.setBackground(new java.awt.Color(106, 106, 106));
        orderHistBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderHistBtnMouseClicked(evt);
            }
        });

        orderHistLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        orderHistLbl.setForeground(new java.awt.Color(255, 255, 255));
        orderHistLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderHistLbl.setText("Order History");
        orderHistLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderHistLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout orderHistBtnLayout = new javax.swing.GroupLayout(orderHistBtn);
        orderHistBtn.setLayout(orderHistBtnLayout);
        orderHistBtnLayout.setHorizontalGroup(
            orderHistBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderHistLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        orderHistBtnLayout.setVerticalGroup(
            orderHistBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderHistLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pendingReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderHistBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(manageWHReqCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderHistBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pendingReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(manageWHReqCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pendingReqLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingReqLblMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_pendingReqLblMousePressed

    private void orderHistLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHistLblMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_orderHistLblMousePressed

    private void pendingReqBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingReqBtnMousePressed
        // TODO add your handling code here:
        pendingReqFunctionality();
       
    }//GEN-LAST:event_pendingReqBtnMousePressed

    private void pendingReqLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingReqLblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pendingReqLblMouseClicked

    private void orderHistBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHistBtnMouseClicked
        // TODO add your handling code here:
        orderHistoryFunctionality();
    }//GEN-LAST:event_orderHistBtnMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel manageWHReqCardLayout;
    private javax.swing.JPanel orderHistBtn;
    private javax.swing.JLabel orderHistLbl;
    private javax.swing.JPanel pendingReqBtn;
    private javax.swing.JLabel pendingReqLbl;
    // End of variables declaration//GEN-END:variables

    private void pendingReqFunctionality() {
         manageWHReqCardLayout.removeAll();
        manageWHReqCardLayout.add(new BBWHmanageReqPanel());
        ((CardLayout) manageWHReqCardLayout.getLayout()).next(manageWHReqCardLayout);
    }

    private void orderHistoryFunctionality() {
        manageWHReqCardLayout.removeAll();
        manageWHReqCardLayout.add(new BBWHorderHistory());
        ((CardLayout) manageWHReqCardLayout.getLayout()).next(manageWHReqCardLayout);
    }
}
