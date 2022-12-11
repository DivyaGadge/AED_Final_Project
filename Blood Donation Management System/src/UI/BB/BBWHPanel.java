/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BB;

import java.awt.CardLayout;

/**
 *
 * @author prishaa
 */
public class BBWHPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWareHouseJPanel
     */
    public BBWHPanel() {
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

        BBWHheader = new javax.swing.JPanel();
        bloodonateLbl = new javax.swing.JLabel();
        BBWHmenu = new javax.swing.JPanel();
        manageProfileBtn = new javax.swing.JPanel();
        ManageProLbl = new javax.swing.JLabel();
        bloodInventoryBtn = new javax.swing.JPanel();
        bloodInventoryLbl = new javax.swing.JLabel();
        equipmentInventoryBtn = new javax.swing.JPanel();
        equipmentInventoryLbl = new javax.swing.JLabel();
        placeOrderBtn = new javax.swing.JPanel();
        placeOrderLbl = new javax.swing.JLabel();
        placeOrderIcon = new javax.swing.JLabel();
        manageBloodReqBtn = new javax.swing.JPanel();
        manageBloodReqLbl = new javax.swing.JLabel();
        manageBloodReqIcon = new javax.swing.JLabel();
        CardLayoutBBWHPanel = new javax.swing.JPanel();

        BBWHheader.setBackground(new java.awt.Color(207, 98, 98));

        bloodonateLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        bloodonateLbl.setForeground(new java.awt.Color(215, 215, 215));
        bloodonateLbl.setText("BLOODONATE");
        bloodonateLbl.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        javax.swing.GroupLayout BBWHheaderLayout = new javax.swing.GroupLayout(BBWHheader);
        BBWHheader.setLayout(BBWHheaderLayout);
        BBWHheaderLayout.setHorizontalGroup(
            BBWHheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BBWHheaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloodonateLbl)
                .addContainerGap(1168, Short.MAX_VALUE))
        );
        BBWHheaderLayout.setVerticalGroup(
            BBWHheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BBWHheaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bloodonateLbl)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        BBWHmenu.setBackground(new java.awt.Color(207, 98, 98));
        BBWHmenu.setPreferredSize(new java.awt.Dimension(220, 700));
        BBWHmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageProfileBtn.setBackground(new java.awt.Color(230, 98, 98));
        manageProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProfileBtnMousePressed(evt);
            }
        });

        ManageProLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageProLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageProLbl.setText("Manage Profile");
        ManageProLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageProLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout manageProfileBtnLayout = new javax.swing.GroupLayout(manageProfileBtn);
        manageProfileBtn.setLayout(manageProfileBtnLayout);
        manageProfileBtnLayout.setHorizontalGroup(
            manageProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageProfileBtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ManageProLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageProfileBtnLayout.setVerticalGroup(
            manageProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManageProLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        BBWHmenu.add(manageProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        bloodInventoryBtn.setBackground(new java.awt.Color(230, 98, 98));
        bloodInventoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bloodInventoryBtnMousePressed(evt);
            }
        });

        bloodInventoryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        bloodInventoryLbl.setForeground(new java.awt.Color(215, 215, 215));
        bloodInventoryLbl.setText("Blood Inventory");
        bloodInventoryLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bloodInventoryLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bloodInventoryBtnLayout = new javax.swing.GroupLayout(bloodInventoryBtn);
        bloodInventoryBtn.setLayout(bloodInventoryBtnLayout);
        bloodInventoryBtnLayout.setHorizontalGroup(
            bloodInventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloodInventoryBtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(bloodInventoryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        bloodInventoryBtnLayout.setVerticalGroup(
            bloodInventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloodInventoryBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloodInventoryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        BBWHmenu.add(bloodInventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, -1));

        equipmentInventoryBtn.setBackground(new java.awt.Color(230, 98, 98));
        equipmentInventoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equipmentInventoryBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                equipmentInventoryBtnMousePressed(evt);
            }
        });

        equipmentInventoryLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        equipmentInventoryLbl.setForeground(new java.awt.Color(215, 215, 215));
        equipmentInventoryLbl.setText("Equipment Inventory");
        equipmentInventoryLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                equipmentInventoryLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout equipmentInventoryBtnLayout = new javax.swing.GroupLayout(equipmentInventoryBtn);
        equipmentInventoryBtn.setLayout(equipmentInventoryBtnLayout);
        equipmentInventoryBtnLayout.setHorizontalGroup(
            equipmentInventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equipmentInventoryBtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(equipmentInventoryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        equipmentInventoryBtnLayout.setVerticalGroup(
            equipmentInventoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipmentInventoryBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equipmentInventoryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        BBWHmenu.add(equipmentInventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, -1));

        placeOrderBtn.setBackground(new java.awt.Color(230, 98, 98));
        placeOrderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placeOrderBtnMouseClicked(evt);
            }
        });

        placeOrderLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        placeOrderLbl.setForeground(new java.awt.Color(215, 215, 215));
        placeOrderLbl.setText("Place an order");
        placeOrderLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeOrderLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout placeOrderBtnLayout = new javax.swing.GroupLayout(placeOrderBtn);
        placeOrderBtn.setLayout(placeOrderBtnLayout);
        placeOrderBtnLayout.setHorizontalGroup(
            placeOrderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, placeOrderBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placeOrderIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(placeOrderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        placeOrderBtnLayout.setVerticalGroup(
            placeOrderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placeOrderBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(placeOrderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placeOrderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(placeOrderIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BBWHmenu.add(placeOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, -1));

        manageBloodReqBtn.setBackground(new java.awt.Color(230, 98, 98));
        manageBloodReqBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageBloodReqBtnMouseClicked(evt);
            }
        });

        manageBloodReqLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        manageBloodReqLbl.setForeground(new java.awt.Color(215, 215, 215));
        manageBloodReqLbl.setText("Manage Blood Request");
        manageBloodReqLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageBloodReqLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout manageBloodReqBtnLayout = new javax.swing.GroupLayout(manageBloodReqBtn);
        manageBloodReqBtn.setLayout(manageBloodReqBtnLayout);
        manageBloodReqBtnLayout.setHorizontalGroup(
            manageBloodReqBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageBloodReqBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageBloodReqIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(manageBloodReqLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageBloodReqBtnLayout.setVerticalGroup(
            manageBloodReqBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageBloodReqBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageBloodReqBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageBloodReqLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(manageBloodReqIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BBWHmenu.add(manageBloodReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, -1));

        CardLayoutBBWHPanel.setBackground(new java.awt.Color(255, 255, 255));
        CardLayoutBBWHPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BBWHheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BBWHmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(CardLayoutBBWHPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BBWHheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BBWHmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CardLayoutBBWHPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void equipmentInventoryBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equipmentInventoryBtnMousePressed
        // TODO add your handling code here:
        equipmentInventoryFunctionality();
    }//GEN-LAST:event_equipmentInventoryBtnMousePressed

    private void manageProfileBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProfileBtnMousePressed
        // TODO add your handling code here:
        manageProfileFunctionality();
    }//GEN-LAST:event_manageProfileBtnMousePressed

    private void ManageProLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageProLblMouseClicked
        // TODO add your handling code here:
        manageProfileFunctionality();
    }//GEN-LAST:event_ManageProLblMouseClicked

    private void equipmentInventoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equipmentInventoryBtnMouseClicked
        // TODO add your handling code here:
        equipmentInventoryFunctionality();
    }//GEN-LAST:event_equipmentInventoryBtnMouseClicked

    private void placeOrderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderBtnMouseClicked
        // TODO add your handling code here:
        placeOrderFunctionality();
    }//GEN-LAST:event_placeOrderBtnMouseClicked

    private void manageBloodReqBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBloodReqBtnMouseClicked
        // TODO add your handling code here:
        manageBloodReqFunctionality();
        
    }//GEN-LAST:event_manageBloodReqBtnMouseClicked

    private void bloodInventoryLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloodInventoryLblMouseClicked
        // TODO add your handling code here:
        bloodInventoryFunctionality();
    }//GEN-LAST:event_bloodInventoryLblMouseClicked

    private void bloodInventoryBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bloodInventoryBtnMousePressed
        // TODO add your handling code here:
        bloodInventoryFunctionality();
    }//GEN-LAST:event_bloodInventoryBtnMousePressed

    private void equipmentInventoryLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equipmentInventoryLblMousePressed
        // TODO add your handling code here:
        equipmentInventoryFunctionality();
    }//GEN-LAST:event_equipmentInventoryLblMousePressed

    private void placeOrderLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderLblMousePressed
        // TODO add your handling code here:
        placeOrderFunctionality();
    }//GEN-LAST:event_placeOrderLblMousePressed

    private void manageBloodReqLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBloodReqLblMouseClicked
        // TODO add your handling code here:
         manageBloodReqFunctionality();
    }//GEN-LAST:event_manageBloodReqLblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BBWHheader;
    private javax.swing.JPanel BBWHmenu;
    private javax.swing.JPanel CardLayoutBBWHPanel;
    private javax.swing.JLabel ManageProLbl;
    private javax.swing.JPanel bloodInventoryBtn;
    private javax.swing.JLabel bloodInventoryLbl;
    private javax.swing.JLabel bloodonateLbl;
    private javax.swing.JPanel equipmentInventoryBtn;
    private javax.swing.JLabel equipmentInventoryLbl;
    private javax.swing.JPanel manageBloodReqBtn;
    private javax.swing.JLabel manageBloodReqIcon;
    private javax.swing.JLabel manageBloodReqLbl;
    private javax.swing.JPanel manageProfileBtn;
    private javax.swing.JPanel placeOrderBtn;
    private javax.swing.JLabel placeOrderIcon;
    private javax.swing.JLabel placeOrderLbl;
    // End of variables declaration//GEN-END:variables

    private void manageProfileFunctionality() {
        CardLayoutBBWHPanel.removeAll();
        CardLayoutBBWHPanel.add(new BBWHManageProfile());
        ((CardLayout) CardLayoutBBWHPanel.getLayout()).next(CardLayoutBBWHPanel);
    }

    private void bloodInventoryFunctionality() {
        CardLayoutBBWHPanel.removeAll();
        CardLayoutBBWHPanel.add(new BBWHbloodInventoryPanel());
        ((CardLayout) CardLayoutBBWHPanel.getLayout()).next(CardLayoutBBWHPanel);
    }

    private void equipmentInventoryFunctionality() {
        CardLayoutBBWHPanel.removeAll();
        CardLayoutBBWHPanel.add(new BBWHEquipmentInventory());
        ((CardLayout) CardLayoutBBWHPanel.getLayout()).next(CardLayoutBBWHPanel);
    }

    private void placeOrderFunctionality() {
        CardLayoutBBWHPanel.removeAll();
        CardLayoutBBWHPanel.add(new BBWHnewOrderPanel());
        ((CardLayout) CardLayoutBBWHPanel.getLayout()).next(CardLayoutBBWHPanel);
    }

    private void manageBloodReqFunctionality() {
        CardLayoutBBWHPanel.removeAll();
        CardLayoutBBWHPanel.add(new BBWHmanageRequestsPanel());
        ((CardLayout) CardLayoutBBWHPanel.getLayout()).next(CardLayoutBBWHPanel);
    }
    
}