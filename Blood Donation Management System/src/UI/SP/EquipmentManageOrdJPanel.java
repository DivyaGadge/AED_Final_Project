/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SP;

import UI.Hospital.*;

/**
 *
 * @author divyagadge
 */
public class EquipmentManageOrdJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListofBBJPanel
     */
    public EquipmentManageOrdJPanel() {
        initComponents();
    }

    private void equipmentSPTable(){
        
    }
    
    private void acceptOrderEP(){
        
    }
      
    private void sendtoLogistics(){
        
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        updateOrgBtn = new javax.swing.JPanel();
        updateOrgLbl = new javax.swing.JLabel();
        updateOrgBtn1 = new javax.swing.JPanel();
        updateOrgLbl1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1142, 702));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Equipment Org Username", "Received From", "Item Count", "Delivery Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Equipment Orders");

        updateOrgBtn.setBackground(new java.awt.Color(106, 106, 106));

        updateOrgLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateOrgLbl.setForeground(new java.awt.Color(255, 255, 255));
        updateOrgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateOrgLbl.setText("Send to Logistics Team");

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

        updateOrgBtn1.setBackground(new java.awt.Color(106, 106, 106));

        updateOrgLbl1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateOrgLbl1.setForeground(new java.awt.Color(255, 255, 255));
        updateOrgLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateOrgLbl1.setText("Accept Order");

        javax.swing.GroupLayout updateOrgBtn1Layout = new javax.swing.GroupLayout(updateOrgBtn1);
        updateOrgBtn1.setLayout(updateOrgBtn1Layout);
        updateOrgBtn1Layout.setHorizontalGroup(
            updateOrgBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateOrgLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        updateOrgBtn1Layout.setVerticalGroup(
            updateOrgBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateOrgLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(604, 604, 604)
                        .addComponent(updateOrgBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateOrgBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(updateOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel updateOrgBtn;
    private javax.swing.JPanel updateOrgBtn1;
    private javax.swing.JLabel updateOrgLbl;
    private javax.swing.JLabel updateOrgLbl1;
    // End of variables declaration//GEN-END:variables
}
