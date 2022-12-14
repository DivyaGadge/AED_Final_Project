/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SP;

import UI.Hospital.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.serviceProvider.LogisticsActiveOrders;


/**
 *
 * @author divyagadge
 */
public class LogisticsActiveOrdJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListofBBJPanel
     */
    
    LogisticsActiveOrders activeorder;
    
    public LogisticsActiveOrdJPanel() {
        initComponents();
        this.activeorder = new activeorder();
        populateHospitalUserDetailsTable();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LogisitcsActiveOrderjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        updateOrgBtn = new javax.swing.JPanel();
        updateOrgLbl = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1142, 702));

        LogisitcsActiveOrderjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Logistics Org Username", "Received From", "Description", "Delivery to", "Delivery Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LogisitcsActiveOrderjTable);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Active Orders");

        updateOrgBtn.setBackground(new java.awt.Color(106, 106, 106));

        updateOrgLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateOrgLbl.setForeground(new java.awt.Color(255, 255, 255));
        updateOrgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateOrgLbl.setText("Delivered");
        updateOrgLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateOrgLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updateOrgBtnLayout = new javax.swing.GroupLayout(updateOrgBtn);
        updateOrgBtn.setLayout(updateOrgBtnLayout);
        updateOrgBtnLayout.setHorizontalGroup(
            updateOrgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateOrgLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        updateOrgBtnLayout.setVerticalGroup(
            updateOrgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateOrgLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(844, 844, 844)
                        .addComponent(updateOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(updateOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
     private void populateHospitalUserDetailsTable() {
        int selectedRowIndex = LogisitcsActiveOrderjTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) LogisitcsActiveOrderjTable.getModel();
        activeorder.populateTable(model);
    }
    
     
    private void updateOrgLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateOrgLblMouseClicked
        // TODO add your handling code here:
        deliveredFunctionality();
    }//GEN-LAST:event_updateOrgLblMouseClicked

   
     private void deliveredFunctionality() {
        int id = (int) LogisitcsActiveOrderjTable.getValueAt(LogisitcsActiveOrderjTable.getSelectedRow(), 0);
        String logisticsUsername= LogisitcsActiveOrderjTable.getValueAt(LogisitcsActiveOrderjTable.getSelectedRow(), 1).toString();
        String receivedFrom = LogisitcsActiveOrderjTable.getValueAt(LogisitcsActiveOrderjTable.getSelectedRow(), 2).toString();
        String description = LogisitcsActiveOrderjTable.getValueAt(LogisitcsActiveOrderjTable.getSelectedRow(), 3).toString();
        String deliveryTo = LogisitcsActiveOrderjTable.getValueAt(LogisitcsActiveOrderjTable.getSelectedRow(), 4).toString();
        String deliveryStatus = LogisitcsActiveOrderjTable.getValueAt(LogisitcsActiveOrderjTable.getSelectedRow(), 5).toString();
        System.out.println("Testing");

        activeorder.deliveredFunctionality(id,logisticsUsername,receivedFrom,description,deliveryTo,deliveryStatus);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LogisitcsActiveOrderjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel updateOrgBtn;
    private javax.swing.JLabel updateOrgLbl;
    // End of variables declaration//GEN-END:variables

    private static class activeorder extends LogisticsActiveOrders {

        public activeorder() {
        }
    }
}
