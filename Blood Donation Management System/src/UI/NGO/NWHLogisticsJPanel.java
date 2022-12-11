/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NGO;

/**
 *
 * @author surajvisvesh
 */
public class NWHLogisticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NWHBloodJPanel
     */
    public NWHLogisticsJPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        sampleBloodBankTable = new javax.swing.JTable();
        sampleTblLbl1 = new javax.swing.JLabel();
        serachIconLbl1 = new javax.swing.JLabel();
        logisticsTblSearchTF = new javax.swing.JTextField();
        orderBtn = new javax.swing.JPanel();
        orderLbl = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        sampleTblLbl2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sampleBloodBankTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Camp Id", "Camp Name", "Sample Count", "Sample Status"
            }
        ));
        jScrollPane1.setViewportView(sampleBloodBankTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 41, 1050, 435));

        sampleTblLbl1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        sampleTblLbl1.setText("Select Samples");
        add(sampleTblLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 12, -1, -1));

        serachIconLbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/search_icon.png"))); // NOI18N
        add(serachIconLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1066, 6, -1, -1));
        add(logisticsTblSearchTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 12, 208, -1));

        orderBtn.setBackground(new java.awt.Color(106, 106, 106));

        orderLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        orderLbl.setForeground(new java.awt.Color(255, 255, 255));
        orderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderLbl.setText("Place Order");

        javax.swing.GroupLayout orderBtnLayout = new javax.swing.GroupLayout(orderBtn);
        orderBtn.setLayout(orderBtnLayout);
        orderBtnLayout.setHorizontalGroup(
            orderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        orderBtnLayout.setVerticalGroup(
            orderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        add(orderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(951, 494, -1, -1));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 494, 261, 53));

        sampleTblLbl2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        sampleTblLbl2.setText("Select Logistics Partner");
        add(sampleTblLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 494, -1, 53));
    }// </editor-fold>//GEN-END:initComponents
    
    private void populateLogCB() {
//        sql query to get username of Logistics
    }
    
    private void orderBtnFunctionality() {
        
        
        
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField logisticsTblSearchTF;
    private javax.swing.JPanel orderBtn;
    private javax.swing.JLabel orderLbl;
    private javax.swing.JTable sampleBloodBankTable;
    private javax.swing.JLabel sampleTblLbl1;
    private javax.swing.JLabel sampleTblLbl2;
    private javax.swing.JLabel serachIconLbl1;
    // End of variables declaration//GEN-END:variables
}
