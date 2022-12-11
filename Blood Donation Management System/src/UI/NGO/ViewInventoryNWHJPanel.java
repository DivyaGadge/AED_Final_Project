/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NGO;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author surajvisvesh
 */
public class ViewInventoryNWHJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEquipmentNWHJPanel
     */
    JPanel manageInventoryCardLayout;

    public ViewInventoryNWHJPanel(JPanel manageInventoryCardLayout) {
        initComponents();
        this.manageInventoryCardLayout = manageInventoryCardLayout;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchTF = new javax.swing.JTextField();
        serachIconLbl = new javax.swing.JLabel();
        orgTable = new javax.swing.JScrollPane();
        orderEquipmentTable = new javax.swing.JTable();
        orderEquipmentsBtn = new javax.swing.JPanel();
        orderEquipLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        searchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTFActionPerformed(evt);
            }
        });

        serachIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/search_icon.png"))); // NOI18N

        orderEquipmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Equipment Id", "Equipment Name", "Description", "Image", "Available Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderEquipmentTable.getTableHeader().setReorderingAllowed(false);
        orgTable.setViewportView(orderEquipmentTable);

        orderEquipmentsBtn.setBackground(new java.awt.Color(106, 106, 106));

        orderEquipLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        orderEquipLbl.setForeground(new java.awt.Color(255, 255, 255));
        orderEquipLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderEquipLbl.setText("Order New Equipments");
        orderEquipLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderEquipLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout orderEquipmentsBtnLayout = new javax.swing.GroupLayout(orderEquipmentsBtn);
        orderEquipmentsBtn.setLayout(orderEquipmentsBtnLayout);
        orderEquipmentsBtnLayout.setHorizontalGroup(
            orderEquipmentsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderEquipLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );
        orderEquipmentsBtnLayout.setVerticalGroup(
            orderEquipmentsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderEquipLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(853, 853, 853)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serachIconLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(933, 933, 933)
                        .addComponent(orderEquipmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(orgTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serachIconLbl)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(orgTable, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderEquipmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderEquipLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderEquipLblMousePressed
        // TODO add your handling code here:
        orderEquipBtnFunctionality();

    }//GEN-LAST:event_orderEquipLblMousePressed

    private void searchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTFActionPerformed

    private void orderEquipBtnFunctionality() {
        manageInventoryCardLayout.removeAll();
        manageInventoryCardLayout.add(new OrderEquipmentsNWHJPanel());
        ((CardLayout) manageInventoryCardLayout.getLayout()).next(manageInventoryCardLayout);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel orderEquipLbl;
    private javax.swing.JTable orderEquipmentTable;
    private javax.swing.JPanel orderEquipmentsBtn;
    private javax.swing.JScrollPane orgTable;
    private javax.swing.JTextField searchTF;
    private javax.swing.JLabel serachIconLbl;
    // End of variables declaration//GEN-END:variables
}