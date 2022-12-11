/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BB;


import com.mysql.cj.protocol.Resultset;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BBEnt.BBWHnewOrder;


/**
 *
 * @author prishaa
 *
 */
public class BBWHnewOrderPanel extends javax.swing.JPanel {
    BBWHnewOrder newOrder;
    /**
     * Creates new form ManageEquipmentNWHJPanel
     */
    public BBWHnewOrderPanel() {
         initComponents();
        this.newOrder = new newOrder();
        populateNewOrderTable();
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
        BBWHequipTable = new javax.swing.JScrollPane();
        newOrderTbl = new javax.swing.JTable();
        orderEquipmentsBtn = new javax.swing.JPanel();
        placeOrderLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1142, 702));

        newOrderTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        newOrderTbl.getTableHeader().setReorderingAllowed(false);
        BBWHequipTable.setViewportView(newOrderTbl);

        orderEquipmentsBtn.setBackground(new java.awt.Color(106, 106, 106));

        placeOrderLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        placeOrderLbl.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeOrderLbl.setText("Order New Equipments");
        placeOrderLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                placeOrderLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout orderEquipmentsBtnLayout = new javax.swing.GroupLayout(orderEquipmentsBtn);
        orderEquipmentsBtn.setLayout(orderEquipmentsBtnLayout);
        orderEquipmentsBtnLayout.setHorizontalGroup(
            orderEquipmentsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeOrderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
        );
        orderEquipmentsBtnLayout.setVerticalGroup(
            orderEquipmentsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeOrderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addComponent(BBWHequipTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderEquipmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BBWHequipTable, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(orderEquipmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void populateNewOrderTable() {
        int selectedRowIndex = newOrderTbl.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) newOrderTbl.getModel();   
        newOrder.populateTable(model);
            
    }
    private void placeOrderLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderLblMousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_placeOrderLblMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BBWHequipTable;
    private javax.swing.JTable newOrderTbl;
    private javax.swing.JPanel orderEquipmentsBtn;
    private javax.swing.JLabel placeOrderLbl;
    private javax.swing.JTextField searchTF;
    // End of variables declaration//GEN-END:variables

    private static class newOrder extends BBWHnewOrder {

        public newOrder() {
        }
    }
}
