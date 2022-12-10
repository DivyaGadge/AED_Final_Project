/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;



/**
 *
 * @author divyagadge
 */
public class DonorListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNGODonorsJPanel
     */
    public DonorListJPanel() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        sampleBloodBankTable1 = new javax.swing.JTable();
        logisticsTblSearchTF1 = new javax.swing.JTextField();
        serachIconLbl2 = new javax.swing.JLabel();
        updateOrgBtn = new javax.swing.JPanel();
        updateOrgLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        updateOrgBtn1 = new javax.swing.JPanel();
        updateOrgLbl1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        sampleBloodBankTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "DOB", "Email", "Phone Number", "Blood Group", "Street Address", "City", "State", "Pincode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(sampleBloodBankTable1);

        serachIconLbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/search_icon.png"))); // NOI18N

        updateOrgBtn.setBackground(new java.awt.Color(106, 106, 106));

        updateOrgLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateOrgLbl.setForeground(new java.awt.Color(255, 255, 255));
        updateOrgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateOrgLbl.setText("Add Vital Signs");

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

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Donor Details");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vital Id", "Body Temperature", "Blood Pressure", "Pulse Rate"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        updateOrgBtn1.setBackground(new java.awt.Color(106, 106, 106));

        updateOrgLbl1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateOrgLbl1.setForeground(new java.awt.Color(255, 255, 255));
        updateOrgLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateOrgLbl1.setText("Save");

        javax.swing.GroupLayout updateOrgBtn1Layout = new javax.swing.GroupLayout(updateOrgBtn1);
        updateOrgBtn1.setLayout(updateOrgBtn1Layout);
        updateOrgBtn1Layout.setHorizontalGroup(
            updateOrgBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateOrgLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        updateOrgBtn1Layout.setVerticalGroup(
            updateOrgBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateOrgLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logisticsTblSearchTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateOrgBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(211, 211, 211)
                        .addComponent(updateOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serachIconLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logisticsTblSearchTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(serachIconLbl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateOrgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateOrgBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField logisticsTblSearchTF1;
    private javax.swing.JTable sampleBloodBankTable1;
    private javax.swing.JLabel serachIconLbl2;
    private javax.swing.JPanel updateOrgBtn;
    private javax.swing.JPanel updateOrgBtn1;
    private javax.swing.JLabel updateOrgLbl;
    private javax.swing.JLabel updateOrgLbl1;
    // End of variables declaration//GEN-END:variables
}
