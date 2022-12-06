/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SP;

import UI.Hospital.*;
import UI.NGO.*;

/**
 *
 * @author divyagadge
 */
public class EquipmentSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWareHouseJPanel
     */
    public EquipmentSupplierJPanel() {
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

        NWHHeader = new javax.swing.JPanel();
        bloodonateLbl = new javax.swing.JLabel();
        NWHMenu = new javax.swing.JPanel();
        manageHospProfileBtn = new javax.swing.JPanel();
        ManageHProLbl = new javax.swing.JLabel();
        hproIcon = new javax.swing.JLabel();
        inventoryBtn = new javax.swing.JPanel();
        ManageOrgLbl = new javax.swing.JLabel();
        orgIcon = new javax.swing.JLabel();
        manageBloodBtn = new javax.swing.JPanel();
        manageBloodLbl = new javax.swing.JLabel();
        bloodBagIcon = new javax.swing.JLabel();
        CardLayoutNWHPanel = new javax.swing.JPanel();

        NWHHeader.setBackground(new java.awt.Color(207, 98, 98));

        bloodonateLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        bloodonateLbl.setForeground(new java.awt.Color(215, 215, 215));
        bloodonateLbl.setText("BLOODONATE");
        bloodonateLbl.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        javax.swing.GroupLayout NWHHeaderLayout = new javax.swing.GroupLayout(NWHHeader);
        NWHHeader.setLayout(NWHHeaderLayout);
        NWHHeaderLayout.setHorizontalGroup(
            NWHHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NWHHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloodonateLbl)
                .addContainerGap(1168, Short.MAX_VALUE))
        );
        NWHHeaderLayout.setVerticalGroup(
            NWHHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NWHHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bloodonateLbl)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        NWHMenu.setBackground(new java.awt.Color(207, 98, 98));
        NWHMenu.setPreferredSize(new java.awt.Dimension(220, 700));
        NWHMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageHospProfileBtn.setBackground(new java.awt.Color(230, 98, 98));
        manageHospProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageHospProfileBtnMousePressed(evt);
            }
        });

        ManageHProLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageHProLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageHProLbl.setText("Manage Profile");

        hproIcon.setBackground(new java.awt.Color(204, 204, 204));
        hproIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hproIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/profile_icon.png"))); // NOI18N

        javax.swing.GroupLayout manageHospProfileBtnLayout = new javax.swing.GroupLayout(manageHospProfileBtn);
        manageHospProfileBtn.setLayout(manageHospProfileBtnLayout);
        manageHospProfileBtnLayout.setHorizontalGroup(
            manageHospProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageHospProfileBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hproIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ManageHProLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageHospProfileBtnLayout.setVerticalGroup(
            manageHospProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManageHProLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageHospProfileBtnLayout.createSequentialGroup()
                .addComponent(hproIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NWHMenu.add(manageHospProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        inventoryBtn.setBackground(new java.awt.Color(230, 98, 98));

        ManageOrgLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageOrgLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageOrgLbl.setText("Manage Order");

        orgIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/suraj/inventory_icon.png"))); // NOI18N

        javax.swing.GroupLayout inventoryBtnLayout = new javax.swing.GroupLayout(inventoryBtn);
        inventoryBtn.setLayout(inventoryBtnLayout);
        inventoryBtnLayout.setHorizontalGroup(
            inventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventoryBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orgIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ManageOrgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        inventoryBtnLayout.setVerticalGroup(
            inventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventoryBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageOrgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(orgIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NWHMenu.add(inventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, -1));

        manageBloodBtn.setBackground(new java.awt.Color(230, 98, 98));
        manageBloodBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageBloodBtnMousePressed(evt);
            }
        });

        manageBloodLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        manageBloodLbl.setForeground(new java.awt.Color(215, 215, 215));
        manageBloodLbl.setText("Inventory");

        bloodBagIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bloodBagIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/suraj/logistics_truck.png"))); // NOI18N

        javax.swing.GroupLayout manageBloodBtnLayout = new javax.swing.GroupLayout(manageBloodBtn);
        manageBloodBtn.setLayout(manageBloodBtnLayout);
        manageBloodBtnLayout.setHorizontalGroup(
            manageBloodBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageBloodBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloodBagIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(manageBloodLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageBloodBtnLayout.setVerticalGroup(
            manageBloodBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageBloodBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageBloodBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageBloodLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(bloodBagIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NWHMenu.add(manageBloodBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, -1));

        CardLayoutNWHPanel.setBackground(new java.awt.Color(255, 255, 255));
        CardLayoutNWHPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NWHHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(NWHMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(CardLayoutNWHPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(NWHHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NWHMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CardLayoutNWHPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageBloodBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBloodBtnMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_manageBloodBtnMousePressed

    private void manageHospProfileBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHospProfileBtnMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_manageHospProfileBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardLayoutNWHPanel;
    private javax.swing.JLabel ManageHProLbl;
    private javax.swing.JLabel ManageOrgLbl;
    private javax.swing.JPanel NWHHeader;
    private javax.swing.JPanel NWHMenu;
    private javax.swing.JLabel bloodBagIcon;
    private javax.swing.JLabel bloodonateLbl;
    private javax.swing.JLabel hproIcon;
    private javax.swing.JPanel inventoryBtn;
    private javax.swing.JPanel manageBloodBtn;
    private javax.swing.JLabel manageBloodLbl;
    private javax.swing.JPanel manageHospProfileBtn;
    private javax.swing.JLabel orgIcon;
    // End of variables declaration//GEN-END:variables
}
