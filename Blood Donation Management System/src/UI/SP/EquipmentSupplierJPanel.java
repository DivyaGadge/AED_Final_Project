/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SP;

import UI.Hospital.*;
import java.awt.CardLayout;


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

        EquipementSHeader = new javax.swing.JPanel();
        bloodonateLbl = new javax.swing.JLabel();
        EquipmentSMenu = new javax.swing.JPanel();
        manageESProfileBtn = new javax.swing.JPanel();
        ManageESProLbl = new javax.swing.JLabel();
        maangeordESBtn = new javax.swing.JPanel();
        ManageESOrderLbl = new javax.swing.JLabel();
        inventoryESBtn = new javax.swing.JPanel();
        inventoryESLbl = new javax.swing.JLabel();
        CardLayoutESPanel = new javax.swing.JPanel();

        EquipementSHeader.setBackground(new java.awt.Color(207, 98, 98));

        bloodonateLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        bloodonateLbl.setForeground(new java.awt.Color(215, 215, 215));
        bloodonateLbl.setText("BLOODONATE");
        bloodonateLbl.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        javax.swing.GroupLayout EquipementSHeaderLayout = new javax.swing.GroupLayout(EquipementSHeader);
        EquipementSHeader.setLayout(EquipementSHeaderLayout);
        EquipementSHeaderLayout.setHorizontalGroup(
            EquipementSHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipementSHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloodonateLbl)
                .addContainerGap(1168, Short.MAX_VALUE))
        );
        EquipementSHeaderLayout.setVerticalGroup(
            EquipementSHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipementSHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bloodonateLbl)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        EquipmentSMenu.setBackground(new java.awt.Color(207, 98, 98));
        EquipmentSMenu.setPreferredSize(new java.awt.Dimension(220, 700));
        EquipmentSMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageESProfileBtn.setBackground(new java.awt.Color(230, 98, 98));
        manageESProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageESProfileBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageESProfileBtnMousePressed(evt);
            }
        });

        ManageESProLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageESProLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageESProLbl.setText("Manage Profile");

        javax.swing.GroupLayout manageESProfileBtnLayout = new javax.swing.GroupLayout(manageESProfileBtn);
        manageESProfileBtn.setLayout(manageESProfileBtnLayout);
        manageESProfileBtnLayout.setHorizontalGroup(
            manageESProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageESProfileBtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ManageESProLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageESProfileBtnLayout.setVerticalGroup(
            manageESProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManageESProLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        EquipmentSMenu.add(manageESProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        maangeordESBtn.setBackground(new java.awt.Color(230, 98, 98));
        maangeordESBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maangeordESBtnMouseClicked(evt);
            }
        });

        ManageESOrderLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageESOrderLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageESOrderLbl.setText("Manage Order");

        javax.swing.GroupLayout maangeordESBtnLayout = new javax.swing.GroupLayout(maangeordESBtn);
        maangeordESBtn.setLayout(maangeordESBtnLayout);
        maangeordESBtnLayout.setHorizontalGroup(
            maangeordESBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maangeordESBtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ManageESOrderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        maangeordESBtnLayout.setVerticalGroup(
            maangeordESBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maangeordESBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ManageESOrderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        EquipmentSMenu.add(maangeordESBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, -1));

        inventoryESBtn.setBackground(new java.awt.Color(230, 98, 98));
        inventoryESBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryESBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inventoryESBtnMousePressed(evt);
            }
        });

        inventoryESLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        inventoryESLbl.setForeground(new java.awt.Color(215, 215, 215));
        inventoryESLbl.setText("Inventory");

        javax.swing.GroupLayout inventoryESBtnLayout = new javax.swing.GroupLayout(inventoryESBtn);
        inventoryESBtn.setLayout(inventoryESBtnLayout);
        inventoryESBtnLayout.setHorizontalGroup(
            inventoryESBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventoryESBtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(inventoryESLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        inventoryESBtnLayout.setVerticalGroup(
            inventoryESBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryESBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inventoryESLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        EquipmentSMenu.add(inventoryESBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, -1));

        CardLayoutESPanel.setBackground(new java.awt.Color(255, 255, 255));
        CardLayoutESPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EquipementSHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(EquipmentSMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(CardLayoutESPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(EquipementSHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EquipmentSMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CardLayoutESPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inventoryESBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryESBtnMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_inventoryESBtnMousePressed

    private void manageESProfileBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageESProfileBtnMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_manageESProfileBtnMousePressed

    private void manageESProfileBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageESProfileBtnMouseClicked
        // TODO add your handling code here:
        manageESProfile();
    }//GEN-LAST:event_manageESProfileBtnMouseClicked

    private void maangeordESBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maangeordESBtnMouseClicked
        // TODO add your handling code here:
        manageESorder();
    }//GEN-LAST:event_maangeordESBtnMouseClicked

    private void inventoryESBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryESBtnMouseClicked
        // TODO add your handling code here:
        inventoryES();
    }//GEN-LAST:event_inventoryESBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardLayoutESPanel;
    private javax.swing.JPanel EquipementSHeader;
    private javax.swing.JPanel EquipmentSMenu;
    private javax.swing.JLabel ManageESOrderLbl;
    private javax.swing.JLabel ManageESProLbl;
    private javax.swing.JLabel bloodonateLbl;
    private javax.swing.JPanel inventoryESBtn;
    private javax.swing.JLabel inventoryESLbl;
    private javax.swing.JPanel maangeordESBtn;
    private javax.swing.JPanel manageESProfileBtn;
    // End of variables declaration//GEN-END:variables

    private void manageESProfile() {
        CardLayoutESPanel.removeAll();
        CardLayoutESPanel.add(new ManageProfileEqpSupplierJPanel());
        ((CardLayout) CardLayoutESPanel.getLayout()).next(CardLayoutESPanel);
    }

    private void manageESorder() {
        CardLayoutESPanel.removeAll();
        CardLayoutESPanel.add(new EquipmentManageOrdJPanel());
        ((CardLayout) CardLayoutESPanel.getLayout()).next(CardLayoutESPanel);
    }

    private void inventoryES() {
       CardLayoutESPanel.removeAll();
       CardLayoutESPanel.add(new EquipmentInventoryJPanel());
       ((CardLayout) CardLayoutESPanel.getLayout()).next(CardLayoutESPanel);
    }
  }
