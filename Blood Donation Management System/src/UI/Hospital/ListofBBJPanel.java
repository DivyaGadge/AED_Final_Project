/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;

import java.awt.CardLayout;

/**
 *
 * @author divyagadge
 */
public class ListofBBJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListofBBJPanel
     */
    public ListofBBJPanel() {
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
        ListofBBjTable = new javax.swing.JTable();
        ListofBBjLabel = new javax.swing.JLabel();
        ReqtoBBBtn = new javax.swing.JPanel();
        RedtoBBLbl = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1142, 702));

        ListofBBjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Blood Bank Name", "Street Address", "City", "State", "Zip Code", "Email", "Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ListofBBjTable);

        ListofBBjLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ListofBBjLabel.setText("List of Blood Banks");

        ReqtoBBBtn.setBackground(new java.awt.Color(106, 106, 106));
        ReqtoBBBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReqtoBBBtnMouseClicked(evt);
            }
        });

        RedtoBBLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        RedtoBBLbl.setForeground(new java.awt.Color(255, 255, 255));
        RedtoBBLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedtoBBLbl.setText("Request to Blood Bank");

        javax.swing.GroupLayout ReqtoBBBtnLayout = new javax.swing.GroupLayout(ReqtoBBBtn);
        ReqtoBBBtn.setLayout(ReqtoBBBtnLayout);
        ReqtoBBBtnLayout.setHorizontalGroup(
            ReqtoBBBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RedtoBBLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        ReqtoBBBtnLayout.setVerticalGroup(
            ReqtoBBBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RedtoBBLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(844, 844, 844)
                        .addComponent(ReqtoBBBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListofBBjLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(ListofBBjLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(ReqtoBBBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ReqtoBBBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReqtoBBBtnMouseClicked
        // TODO add your handling code here:
        requesttoBB();
    }//GEN-LAST:event_ReqtoBBBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListofBBjLabel;
    private javax.swing.JTable ListofBBjTable;
    private javax.swing.JLabel RedtoBBLbl;
    private javax.swing.JPanel ReqtoBBBtn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void requesttoBB() {
        CardLayoutHPanel.removeAll();
        CardLayoutHPanel.add(new ManageRequestJPanel());
        ((CardLayout) CardLayoutHPanel.getLayout()).next(CardLayoutHPanel);
    }

}
