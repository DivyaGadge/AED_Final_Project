/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;

import javax.swing.JPanel;
import com.mysql.cj.protocol.Resultset;
import javax.swing.JOptionPane;
import model.medicalEnt.ManageDoctorAvail;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author divyagadge
 */
public class ManageRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRequestJPanel
     */
    
    ManageDoctorAvail managedocavail;
    
    public ManageRequestJPanel() {
        initComponents();
        this.managedocavail = new managedocavail();
        populateHospitalUserDetailsTable();
    }

    private void populateHospitalUserDetailsTable() {
        int selectedRowIndex = campDjTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) campDjTable.getModel();
        managedocavail.populateTable(model);
    }
    
    private void populateCampDetailsTable(){
        
    }
    
    private void populateDocAvailTable(){
        
    }
    
    private void assigndoc(){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampDetailsJLabel = new javax.swing.JLabel();
        CampDJScrollPanel = new javax.swing.JScrollPane();
        campDjTable = new javax.swing.JTable();
        DocAvailablejScrollPanel = new javax.swing.JScrollPane();
        DocAvailablejTable = new javax.swing.JTable();
        assignDocBtn = new javax.swing.JPanel();
        assignDocLbl = new javax.swing.JLabel();

        CampDetailsJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        CampDetailsJLabel.setText("Camp Details");

        campDjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NGO", "Camp", "Location", "Date"
            }
        ));
        CampDJScrollPanel.setViewportView(campDjTable);

        DocAvailablejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doctor", "Availability"
            }
        ));
        DocAvailablejScrollPanel.setViewportView(DocAvailablejTable);

        assignDocBtn.setBackground(new java.awt.Color(106, 106, 106));

        assignDocLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        assignDocLbl.setForeground(new java.awt.Color(255, 255, 255));
        assignDocLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignDocLbl.setText("Assign a Doctor");

        javax.swing.GroupLayout assignDocBtnLayout = new javax.swing.GroupLayout(assignDocBtn);
        assignDocBtn.setLayout(assignDocBtnLayout);
        assignDocBtnLayout.setHorizontalGroup(
            assignDocBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(assignDocLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        assignDocBtnLayout.setVerticalGroup(
            assignDocBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(assignDocLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DocAvailablejScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampDetailsJLabel)
                    .addComponent(CampDJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(436, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(assignDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(CampDetailsJLabel)
                .addGap(18, 18, 18)
                .addComponent(CampDJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DocAvailablejScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CampDJScrollPanel;
    private javax.swing.JLabel CampDetailsJLabel;
    private javax.swing.JScrollPane DocAvailablejScrollPanel;
    private javax.swing.JTable DocAvailablejTable;
    private javax.swing.JPanel assignDocBtn;
    private javax.swing.JLabel assignDocLbl;
    private javax.swing.JTable campDjTable;
    // End of variables declaration//GEN-END:variables

    
}
