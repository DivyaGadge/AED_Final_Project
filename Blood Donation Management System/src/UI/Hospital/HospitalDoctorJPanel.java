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
public class HospitalDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWareHouseJPanel
     */
    public HospitalDoctorJPanel() {
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

        HDoctorHeader = new javax.swing.JPanel();
        bloodonateLbl = new javax.swing.JLabel();
        HDocMenu = new javax.swing.JPanel();
        manageHDocProfileBtn = new javax.swing.JPanel();
        ManageHDocLbl = new javax.swing.JLabel();
        activecampsdBtn = new javax.swing.JPanel();
        activecampsdLbl = new javax.swing.JLabel();
        historydBtn = new javax.swing.JPanel();
        historydLbl = new javax.swing.JLabel();
        CardLayoutHDocPanel = new javax.swing.JPanel();

        HDoctorHeader.setBackground(new java.awt.Color(207, 98, 98));

        bloodonateLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        bloodonateLbl.setForeground(new java.awt.Color(215, 215, 215));
        bloodonateLbl.setText("BLOODONATE");
        bloodonateLbl.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        javax.swing.GroupLayout HDoctorHeaderLayout = new javax.swing.GroupLayout(HDoctorHeader);
        HDoctorHeader.setLayout(HDoctorHeaderLayout);
        HDoctorHeaderLayout.setHorizontalGroup(
            HDoctorHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HDoctorHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloodonateLbl)
                .addContainerGap(1168, Short.MAX_VALUE))
        );
        HDoctorHeaderLayout.setVerticalGroup(
            HDoctorHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HDoctorHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bloodonateLbl)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        HDocMenu.setBackground(new java.awt.Color(207, 98, 98));
        HDocMenu.setPreferredSize(new java.awt.Dimension(220, 700));
        HDocMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageHDocProfileBtn.setBackground(new java.awt.Color(230, 98, 98));
        manageHDocProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageHDocProfileBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageHDocProfileBtnMousePressed(evt);
            }
        });

        ManageHDocLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageHDocLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageHDocLbl.setText("Manage Profile");

        javax.swing.GroupLayout manageHDocProfileBtnLayout = new javax.swing.GroupLayout(manageHDocProfileBtn);
        manageHDocProfileBtn.setLayout(manageHDocProfileBtnLayout);
        manageHDocProfileBtnLayout.setHorizontalGroup(
            manageHDocProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageHDocProfileBtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ManageHDocLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageHDocProfileBtnLayout.setVerticalGroup(
            manageHDocProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManageHDocLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        HDocMenu.add(manageHDocProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        activecampsdBtn.setBackground(new java.awt.Color(230, 98, 98));
        activecampsdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activecampsdBtnMouseClicked(evt);
            }
        });

        activecampsdLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        activecampsdLbl.setForeground(new java.awt.Color(215, 215, 215));
        activecampsdLbl.setText("Active Camps");

        javax.swing.GroupLayout activecampsdBtnLayout = new javax.swing.GroupLayout(activecampsdBtn);
        activecampsdBtn.setLayout(activecampsdBtnLayout);
        activecampsdBtnLayout.setHorizontalGroup(
            activecampsdBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activecampsdBtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(activecampsdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        activecampsdBtnLayout.setVerticalGroup(
            activecampsdBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activecampsdBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activecampsdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        HDocMenu.add(activecampsdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, -1));

        historydBtn.setBackground(new java.awt.Color(230, 98, 98));
        historydBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historydBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                historydBtnMousePressed(evt);
            }
        });

        historydLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        historydLbl.setForeground(new java.awt.Color(215, 215, 215));
        historydLbl.setText("History");

        javax.swing.GroupLayout historydBtnLayout = new javax.swing.GroupLayout(historydBtn);
        historydBtn.setLayout(historydBtnLayout);
        historydBtnLayout.setHorizontalGroup(
            historydBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historydBtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(historydLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        historydBtnLayout.setVerticalGroup(
            historydBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historydBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(historydLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        HDocMenu.add(historydBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, -1));

        CardLayoutHDocPanel.setBackground(new java.awt.Color(255, 255, 255));
        CardLayoutHDocPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HDoctorHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(HDocMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(CardLayoutHDocPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HDoctorHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HDocMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CardLayoutHDocPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void historydBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historydBtnMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_historydBtnMousePressed

    private void manageHDocProfileBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHDocProfileBtnMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_manageHDocProfileBtnMousePressed

    private void manageHDocProfileBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHDocProfileBtnMouseClicked
        // TODO add your handling code here:
        manageDoctorsProfile();
    }//GEN-LAST:event_manageHDocProfileBtnMouseClicked

    private void activecampsdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activecampsdBtnMouseClicked
        // TODO add your handling code here:
        activeCamps();
    }//GEN-LAST:event_activecampsdBtnMouseClicked

    private void historydBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historydBtnMouseClicked
        // TODO add your handling code here:
        historyDoc();
    }//GEN-LAST:event_historydBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardLayoutHDocPanel;
    private javax.swing.JPanel HDocMenu;
    private javax.swing.JPanel HDoctorHeader;
    private javax.swing.JLabel ManageHDocLbl;
    private javax.swing.JPanel activecampsdBtn;
    private javax.swing.JLabel activecampsdLbl;
    private javax.swing.JLabel bloodonateLbl;
    private javax.swing.JPanel historydBtn;
    private javax.swing.JLabel historydLbl;
    private javax.swing.JPanel manageHDocProfileBtn;
    // End of variables declaration//GEN-END:variables

    private void manageDoctorsProfile() {
        CardLayoutHDocPanel.removeAll();
        CardLayoutHDocPanel.add(new DoctorHospProfileJPanel());
        ((CardLayout) CardLayoutHDocPanel.getLayout()).next(CardLayoutHDocPanel);

    }

    private void activeCamps() {
        CardLayoutHDocPanel.removeAll();
        CardLayoutHDocPanel.add(new ActiveCampsJPanel());
        ((CardLayout) CardLayoutHDocPanel.getLayout()).next(CardLayoutHDocPanel);

    }

    private void historyDoc() {
       CardLayoutHDocPanel.removeAll();
       CardLayoutHDocPanel.add(new DoctorHistoryJPanel());
       ((CardLayout) CardLayoutHDocPanel.getLayout()).next(CardLayoutHDocPanel);

    }
}
