/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Donor;

import UI.NGO.*;
import model.Ecosystem.Logout;
import UI.Login.homeJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author surajvisvesh
 */
public class DonorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOManagementJPanel
     */
    JPanel mainFrameCardLayout;
    String username;
    public DonorJPanel(JPanel mainFrameCardLayout, String username) {
        initComponents();
        this.mainFrameCardLayout = mainFrameCardLayout;
        this.username = username;
        
        headerUserName.setText(username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donorHeader = new javax.swing.JPanel();
        bloodonateLbl = new javax.swing.JLabel();
        headerUserName = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        NGOMenu = new javax.swing.JPanel();
        donationHistoryBtn = new javax.swing.JPanel();
        donHistLbl = new javax.swing.JLabel();
        donHistIcon = new javax.swing.JLabel();
        donateBldBtn = new javax.swing.JPanel();
        donateBldLbl = new javax.swing.JLabel();
        donateBldIcon = new javax.swing.JLabel();
        manageProfileBtn = new javax.swing.JPanel();
        ManageProLbl = new javax.swing.JLabel();
        proIcon = new javax.swing.JLabel();
        CardLayoutPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        donorHeader.setBackground(new java.awt.Color(223, 85, 71));

        bloodonateLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        bloodonateLbl.setForeground(new java.awt.Color(215, 215, 215));
        bloodonateLbl.setText("BLOODONATE");
        bloodonateLbl.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        headerUserName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        headerUserName.setForeground(new java.awt.Color(215, 215, 215));
        headerUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        headerUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerUserNameMousePressed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(215, 215, 215));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/suraj/logout.png"))); // NOI18N
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout donorHeaderLayout = new javax.swing.GroupLayout(donorHeader);
        donorHeader.setLayout(donorHeaderLayout);
        donorHeaderLayout.setHorizontalGroup(
            donorHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donorHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloodonateLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 798, Short.MAX_VALUE)
                .addComponent(headerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        donorHeaderLayout.setVerticalGroup(
            donorHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donorHeaderLayout.createSequentialGroup()
                .addGroup(donorHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(donorHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(headerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, donorHeaderLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(donorHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodonateLbl))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(donorHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1428, -1));

        NGOMenu.setBackground(new java.awt.Color(223, 85, 71));
        NGOMenu.setPreferredSize(new java.awt.Dimension(220, 700));
        NGOMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        donationHistoryBtn.setBackground(new java.awt.Color(223, 85, 71));
        donationHistoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                donationHistoryBtnMousePressed(evt);
            }
        });

        donHistLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        donHistLbl.setForeground(new java.awt.Color(215, 215, 215));
        donHistLbl.setText("Donation History");
        donHistLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                donHistLblMousePressed(evt);
            }
        });

        donHistIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/blood-bag.png"))); // NOI18N
        donHistIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                donHistIconMousePressed(evt);
            }
        });

        javax.swing.GroupLayout donationHistoryBtnLayout = new javax.swing.GroupLayout(donationHistoryBtn);
        donationHistoryBtn.setLayout(donationHistoryBtnLayout);
        donationHistoryBtnLayout.setHorizontalGroup(
            donationHistoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, donationHistoryBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(donHistIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(donHistLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        donationHistoryBtnLayout.setVerticalGroup(
            donationHistoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donationHistoryBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donationHistoryBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donHistLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(donHistIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NGOMenu.add(donationHistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, -1));

        donateBldBtn.setBackground(new java.awt.Color(223, 85, 71));
        donateBldBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                donateBldBtnMousePressed(evt);
            }
        });

        donateBldLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        donateBldLbl.setForeground(new java.awt.Color(215, 215, 215));
        donateBldLbl.setText("Donate Blood");

        donateBldIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/organization_icon.png"))); // NOI18N

        javax.swing.GroupLayout donateBldBtnLayout = new javax.swing.GroupLayout(donateBldBtn);
        donateBldBtn.setLayout(donateBldBtnLayout);
        donateBldBtnLayout.setHorizontalGroup(
            donateBldBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, donateBldBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(donateBldIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(donateBldLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        donateBldBtnLayout.setVerticalGroup(
            donateBldBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, donateBldBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donateBldBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donateBldLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(donateBldIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NGOMenu.add(donateBldBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, -1));

        manageProfileBtn.setBackground(new java.awt.Color(223, 85, 71));
        manageProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProfileBtnMousePressed(evt);
            }
        });

        ManageProLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageProLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageProLbl.setText("Manage Profile");
        ManageProLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageProLblMousePressed(evt);
            }
        });

        proIcon.setBackground(new java.awt.Color(204, 204, 204));
        proIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/profile_icon.png"))); // NOI18N
        proIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                proIconMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageProfileBtnLayout = new javax.swing.GroupLayout(manageProfileBtn);
        manageProfileBtn.setLayout(manageProfileBtnLayout);
        manageProfileBtnLayout.setHorizontalGroup(
            manageProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageProfileBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ManageProLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageProfileBtnLayout.setVerticalGroup(
            manageProfileBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManageProLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageProfileBtnLayout.createSequentialGroup()
                .addComponent(proIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NGOMenu.add(manageProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        add(NGOMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 280, 702));

        CardLayoutPanel.setBackground(new java.awt.Color(255, 255, 255));
        CardLayoutPanel.setLayout(new java.awt.CardLayout());
        add(CardLayoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 92, 1142, 702));
    }// </editor-fold>//GEN-END:initComponents

    private void donationHistoryBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donationHistoryBtnMousePressed
        // TODO add your handling code here:
        donHistFunctionality();  
        
    }//GEN-LAST:event_donationHistoryBtnMousePressed
    
    private void donHistLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donHistLblMousePressed
        // TODO add your handling code here:
        donHistFunctionality();
    }//GEN-LAST:event_donHistLblMousePressed

    private void donHistIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donHistIconMousePressed
        // TODO add your handling code here:
        donHistFunctionality();
    }//GEN-LAST:event_donHistIconMousePressed

    private void manageProfileBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProfileBtnMousePressed
        // TODO add your handling code here:
        manageProfileBtnFunctionality();
    }//GEN-LAST:event_manageProfileBtnMousePressed

    private void ManageProLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageProLblMousePressed
        // TODO add your handling code here:
        manageProfileBtnFunctionality();
    }//GEN-LAST:event_ManageProLblMousePressed

    private void proIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proIconMousePressed
        // TODO add your handling code here:
        manageProfileBtnFunctionality();
    }//GEN-LAST:event_proIconMousePressed

    private void donateBldBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donateBldBtnMousePressed
        // TODO add your handling code here:
        donateBldFunctionality();
        
        
    }//GEN-LAST:event_donateBldBtnMousePressed

    private void headerUserNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerUserNameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerUserNameMousePressed

    private void logoutBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMousePressed
        // TODO add your handling code here:
        
        Logout logout = new Logout(mainFrameCardLayout);
        logout.logoutFunctionality();
         
        
    }//GEN-LAST:event_logoutBtnMousePressed
    
    public void setBtnColor(JPanel panel) {
        
        panel.setBackground(new Color(210, 75, 60));
        
    }
    
    public void resetBtnColor(JPanel panel) {
        
        panel.setBackground(new Color (223, 85, 71));
        
    }
    public void manageProfileBtnFunctionality(){
        
        setBtnColor(manageProfileBtn);
        resetBtnColor(donateBldBtn);
        resetBtnColor(donationHistoryBtn);

        
        
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(new ManageDonorProfileJPanel());
        ((CardLayout) CardLayoutPanel.getLayout()).next(CardLayoutPanel);
        
    }
    
    public void donateBldFunctionality(){
        
        setBtnColor(donateBldBtn);
        resetBtnColor(manageProfileBtn);
        resetBtnColor(donationHistoryBtn);

        
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(new DonateBloodJPanel());
        ((CardLayout)CardLayoutPanel.getLayout()).next(CardLayoutPanel);
        
        
    }
    
    public void donHistFunctionality(){
        
        setBtnColor(donationHistoryBtn);
        resetBtnColor(donateBldBtn);
        resetBtnColor(manageProfileBtn);

        
        
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(new DonationHistory());
        ((CardLayout) CardLayoutPanel.getLayout()).next(CardLayoutPanel);
        
    }
    
    public void setIcons() {
        
        
        
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardLayoutPanel;
    private javax.swing.JLabel ManageProLbl;
    private javax.swing.JPanel NGOMenu;
    private javax.swing.JLabel bloodonateLbl;
    private javax.swing.JLabel donHistIcon;
    private javax.swing.JLabel donHistLbl;
    private javax.swing.JPanel donateBldBtn;
    private javax.swing.JLabel donateBldIcon;
    private javax.swing.JLabel donateBldLbl;
    private javax.swing.JPanel donationHistoryBtn;
    private javax.swing.JPanel donorHeader;
    private javax.swing.JLabel headerUserName;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel manageProfileBtn;
    private javax.swing.JLabel proIcon;
    // End of variables declaration//GEN-END:variables
}
