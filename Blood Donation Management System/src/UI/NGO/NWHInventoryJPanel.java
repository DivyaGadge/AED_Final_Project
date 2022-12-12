/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NGO;

import java.awt.CardLayout;

/**
 *
 * @author surajvisvesh
 */
public class NWHInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNWHEquipmentsJPanel
     */
    public NWHInventoryJPanel() {
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

        manageInventoryCardLayout = new javax.swing.JPanel();
        orderEquipBtn = new javax.swing.JPanel();
        orderEquipLbl = new javax.swing.JLabel();
        viewInventoryBtn = new javax.swing.JPanel();
        viewInventoryLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageInventoryCardLayout.setBackground(new java.awt.Color(255, 255, 255));
        manageInventoryCardLayout.setPreferredSize(new java.awt.Dimension(1142, 630));
        manageInventoryCardLayout.setLayout(new java.awt.CardLayout());
        add(manageInventoryCardLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, -1, -1));

        orderEquipBtn.setBackground(new java.awt.Color(106, 106, 106));

        orderEquipLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        orderEquipLbl.setForeground(new java.awt.Color(255, 255, 255));
        orderEquipLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderEquipLbl.setText("Order Equipments");
        orderEquipLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderEquipLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout orderEquipBtnLayout = new javax.swing.GroupLayout(orderEquipBtn);
        orderEquipBtn.setLayout(orderEquipBtnLayout);
        orderEquipBtnLayout.setHorizontalGroup(
            orderEquipBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderEquipLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        orderEquipBtnLayout.setVerticalGroup(
            orderEquipBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderEquipLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        add(orderEquipBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 6, -1, -1));

        viewInventoryBtn.setBackground(new java.awt.Color(106, 106, 106));

        viewInventoryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewInventoryLbl.setForeground(new java.awt.Color(255, 255, 255));
        viewInventoryLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewInventoryLbl.setText("View Inventory");
        viewInventoryLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewInventoryLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout viewInventoryBtnLayout = new javax.swing.GroupLayout(viewInventoryBtn);
        viewInventoryBtn.setLayout(viewInventoryBtnLayout);
        viewInventoryBtnLayout.setHorizontalGroup(
            viewInventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewInventoryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        viewInventoryBtnLayout.setVerticalGroup(
            viewInventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewInventoryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        add(viewInventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 6, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void orderEquipLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderEquipLblMousePressed
        // TODO add your handling code here:

        orderEquipBtnFunctionality();
        
    }//GEN-LAST:event_orderEquipLblMousePressed

    private void viewInventoryLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewInventoryLblMousePressed
        // TODO add your handling code here:
        
        viewInventoryBtnFunctionality();
        
    }//GEN-LAST:event_viewInventoryLblMousePressed
    
    public void viewInventoryBtnFunctionality() {
        
        manageInventoryCardLayout.removeAll();
        manageInventoryCardLayout.add(new ViewInventoryNWHJPanel(manageInventoryCardLayout));
        ((CardLayout) manageInventoryCardLayout.getLayout()).next(manageInventoryCardLayout);
        
    }
    
    public void orderEquipBtnFunctionality() {
        
        manageInventoryCardLayout.removeAll();
        manageInventoryCardLayout.add(new OrderEquipmentsNWHJPanel());
        ((CardLayout) manageInventoryCardLayout.getLayout()).next(manageInventoryCardLayout);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel manageInventoryCardLayout;
    private javax.swing.JPanel orderEquipBtn;
    private javax.swing.JLabel orderEquipLbl;
    private javax.swing.JPanel viewInventoryBtn;
    private javax.swing.JLabel viewInventoryLbl;
    // End of variables declaration//GEN-END:variables
}