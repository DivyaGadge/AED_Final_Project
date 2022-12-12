/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NGO;

import javax.swing.table.DefaultTableModel;
import model.volunteerEnt.NBCSampleCollection;

/**
 *
 * @author surajvisvesh
 */
public class NBCSampleColJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NCBBloodColJPanel
     */
    NBCSampleCollection nbcCollection;
    
    public NBCSampleColJPanel() {
        initComponents();
        this.nbcCollection = new NBCSampleCollection();
        populateTable();
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
        donorTable = new javax.swing.JTable();
        collectBloodBtn = new javax.swing.JPanel();
        collectBloodLbl = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        serachIconLbl = new javax.swing.JLabel();
        donorTableLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        donorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor Name", "vital 1", "vital 2", "vital 3", "donor_status", "camp_id"
            }
        ));
        jScrollPane1.setViewportView(donorTable);

        collectBloodBtn.setBackground(new java.awt.Color(106, 106, 106));

        collectBloodLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        collectBloodLbl.setForeground(new java.awt.Color(255, 255, 255));
        collectBloodLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collectBloodLbl.setText("Collect Blood");
        collectBloodLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                collectBloodLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout collectBloodBtnLayout = new javax.swing.GroupLayout(collectBloodBtn);
        collectBloodBtn.setLayout(collectBloodBtnLayout);
        collectBloodBtnLayout.setHorizontalGroup(
            collectBloodBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(collectBloodLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );
        collectBloodBtnLayout.setVerticalGroup(
            collectBloodBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(collectBloodLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        serachIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/search_icon.png"))); // NOI18N

        donorTableLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        donorTableLbl.setText("Select a donor to collect blood");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(donorTableLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(serachIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(collectBloodBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serachIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(donorTableLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(collectBloodBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void collectBloodLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collectBloodLblMousePressed
        // TODO add your handling code here:
        collectBldFunctionality();
    }//GEN-LAST:event_collectBloodLblMousePressed
    
    private void collectBldFunctionality() {
        int id = (int) donorTable.getValueAt(donorTable.getSelectedRow(), 0);
        String camp_name = donorTable.getValueAt(donorTable.getSelectedRow(), 1).toString();
        String donorUsername = donorTable.getValueAt(donorTable.getSelectedRow(), 2).toString();
        String bloodGroup = donorTable.getValueAt(donorTable.getSelectedRow(), 3).toString();
        String email = donorTable.getValueAt(donorTable.getSelectedRow(), 4).toString();
        int camp_id = (int) donorTable.getValueAt(donorTable.getSelectedRow(), 5);
        
        nbcCollection.collectSample(id, camp_name, donorUsername, bloodGroup, email, camp_id);
        
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) donorTable.getModel();
        nbcCollection.populateTable(model);
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel collectBloodBtn;
    private javax.swing.JLabel collectBloodLbl;
    private javax.swing.JTable donorTable;
    private javax.swing.JLabel donorTableLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchTF;
    private javax.swing.JLabel serachIconLbl;
    // End of variables declaration//GEN-END:variables

    private void collectSample(int id, String camp_name, String donorUsername, String bloodGroup, String email, int camp_id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}