/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BB;

import com.mysql.cj.protocol.Resultset;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.BBEnt.BBbloodInventory;


/**
 *
 * @author prishaa
 */
public class BBWHbloodInventoryPanel extends javax.swing.JPanel {
    
    BBbloodInventory bloodInventory;

    /**
     * Creates new form ManageEquipmentNWHJPanel
     */
    public BBWHbloodInventoryPanel() {
        initComponents();
        this.bloodInventory = new bloodInventory();
        populateBloodInventoryTable();
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
        bloodInvTbl = new javax.swing.JScrollPane();
        bloodInventoryTbl = new javax.swing.JTable();
        unitAvailability = new javax.swing.JLabel();
        unitType = new javax.swing.JLabel();
        blood = new javax.swing.JLabel();
        plasma = new javax.swing.JLabel();
        platelet = new javax.swing.JLabel();
        rbc = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        bloodInventoryTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"
            }
        ));
        bloodInventoryTbl.getTableHeader().setReorderingAllowed(false);
        bloodInvTbl.setViewportView(bloodInventoryTbl);

        unitAvailability.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unitAvailability.setText("SAMPLE UNIT AVAILABILITY");

        unitType.setText("UNIT TYPE");

        blood.setText("BLOOD");

        plasma.setText("PLASMA");

        platelet.setText("PLATELET");

        rbc.setText("RBC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unitAvailability)
                .addGap(623, 623, 623)
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(platelet)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(plasma)
                            .addComponent(rbc)
                            .addComponent(blood)
                            .addComponent(unitType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(bloodInvTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(unitAvailability)
                .addGap(42, 42, 42)
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(bloodInvTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(unitType)
                        .addGap(18, 18, 18)
                        .addComponent(blood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(plasma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(platelet)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


     public void populateBloodInventoryTable() {
        int selectedRowIndex = bloodInventoryTbl.getSelectedRow();


        DefaultTableModel model = (DefaultTableModel) bloodInventoryTbl.getModel();
       
        bloodInventory.populateTable(model);
            
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blood;
    private javax.swing.JScrollPane bloodInvTbl;
    private javax.swing.JTable bloodInventoryTbl;
    private javax.swing.JLabel plasma;
    private javax.swing.JLabel platelet;
    private javax.swing.JLabel rbc;
    private javax.swing.JTextField searchTF;
    private javax.swing.JLabel unitAvailability;
    private javax.swing.JLabel unitType;
    // End of variables declaration//GEN-END:variables

    private static class bloodInventory extends BBbloodInventory {

        public bloodInventory() {
        }
    }

}
