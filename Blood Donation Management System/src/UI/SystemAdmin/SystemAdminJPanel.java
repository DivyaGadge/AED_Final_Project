/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author surajvisvesh
 */
public class SystemAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminJPanel
     */
    JPanel mainFrameCardLayout;
    String username;
    String userType;
    public SystemAdminJPanel(JPanel mainFrameCardLayout, String username, String userType) {
        initComponents();
        this.mainFrameCardLayout = mainFrameCardLayout;
        this.userType = userType;
        this.username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NGOHeader = new javax.swing.JPanel();
        bloodonateLbl = new javax.swing.JLabel();
        headerUserName = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        NGOMenu = new javax.swing.JPanel();
        organizeCampsBtn = new javax.swing.JPanel();
        OrgCampsLbl = new javax.swing.JLabel();
        campIcon = new javax.swing.JLabel();
        organizationsBtn = new javax.swing.JPanel();
        ManageOrgLbl = new javax.swing.JLabel();
        orgIcon = new javax.swing.JLabel();
        manageProfileBtn = new javax.swing.JPanel();
        ManageProLbl = new javax.swing.JLabel();
        proIcon = new javax.swing.JLabel();
        manageDonorsBtn = new javax.swing.JPanel();
        ManageDonLbl = new javax.swing.JLabel();
        donorIcon = new javax.swing.JLabel();
        insightsBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CardLayoutPanel = new javax.swing.JPanel();

        NGOHeader.setBackground(new java.awt.Color(223, 85, 71));

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

        javax.swing.GroupLayout NGOHeaderLayout = new javax.swing.GroupLayout(NGOHeader);
        NGOHeader.setLayout(NGOHeaderLayout);
        NGOHeaderLayout.setHorizontalGroup(
            NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NGOHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloodonateLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 798, Short.MAX_VALUE)
                .addComponent(headerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NGOHeaderLayout.setVerticalGroup(
            NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NGOHeaderLayout.createSequentialGroup()
                .addGroup(NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NGOHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(headerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NGOHeaderLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodonateLbl))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        NGOMenu.setBackground(new java.awt.Color(223, 85, 71));
        NGOMenu.setPreferredSize(new java.awt.Dimension(220, 700));
        NGOMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizeCampsBtn.setBackground(new java.awt.Color(223, 85, 71));
        organizeCampsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                organizeCampsBtnMousePressed(evt);
            }
        });

        OrgCampsLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        OrgCampsLbl.setForeground(new java.awt.Color(215, 215, 215));
        OrgCampsLbl.setText("Organize Camps");
        OrgCampsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OrgCampsLblMousePressed(evt);
            }
        });

        campIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/blood-bag.png"))); // NOI18N
        campIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campIconMousePressed(evt);
            }
        });

        javax.swing.GroupLayout organizeCampsBtnLayout = new javax.swing.GroupLayout(organizeCampsBtn);
        organizeCampsBtn.setLayout(organizeCampsBtnLayout);
        organizeCampsBtnLayout.setHorizontalGroup(
            organizeCampsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, organizeCampsBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(OrgCampsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        organizeCampsBtnLayout.setVerticalGroup(
            organizeCampsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(organizeCampsBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(organizeCampsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrgCampsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(campIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NGOMenu.add(organizeCampsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, -1));

        organizationsBtn.setBackground(new java.awt.Color(223, 85, 71));
        organizationsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                organizationsBtnMousePressed(evt);
            }
        });

        ManageOrgLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageOrgLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageOrgLbl.setText("Statistics");

        orgIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/organization_icon.png"))); // NOI18N

        javax.swing.GroupLayout organizationsBtnLayout = new javax.swing.GroupLayout(organizationsBtn);
        organizationsBtn.setLayout(organizationsBtnLayout);
        organizationsBtnLayout.setHorizontalGroup(
            organizationsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, organizationsBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orgIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ManageOrgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        organizationsBtnLayout.setVerticalGroup(
            organizationsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, organizationsBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(organizationsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageOrgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(orgIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NGOMenu.add(organizationsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, -1));

        manageProfileBtn.setBackground(new java.awt.Color(223, 85, 71));
        manageProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProfileBtnMousePressed(evt);
            }
        });

        ManageProLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageProLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageProLbl.setText("Registration Requests");
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

        manageDonorsBtn.setBackground(new java.awt.Color(223, 85, 71));

        ManageDonLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageDonLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageDonLbl.setText("Manage Donors");

        donorIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPackage/suraj/donor_icon.png"))); // NOI18N

        javax.swing.GroupLayout manageDonorsBtnLayout = new javax.swing.GroupLayout(manageDonorsBtn);
        manageDonorsBtn.setLayout(manageDonorsBtnLayout);
        manageDonorsBtnLayout.setHorizontalGroup(
            manageDonorsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageDonorsBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(donorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ManageDonLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageDonorsBtnLayout.setVerticalGroup(
            manageDonorsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageDonorsBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageDonorsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageDonLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(donorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NGOMenu.add(manageDonorsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, -1));

        insightsBtn.setBackground(new java.awt.Color(223, 85, 71));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(215, 215, 215));
        jLabel9.setText("Insights");

        javax.swing.GroupLayout insightsBtnLayout = new javax.swing.GroupLayout(insightsBtn);
        insightsBtn.setLayout(insightsBtnLayout);
        insightsBtnLayout.setHorizontalGroup(
            insightsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insightsBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        insightsBtnLayout.setVerticalGroup(
            insightsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insightsBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insightsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NGOMenu.add(insightsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, -1));

        jPanel10.setBackground(new java.awt.Color(223, 85, 71));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(215, 215, 215));
        jLabel10.setText("Insights");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NGOMenu.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 280, -1));

        CardLayoutPanel.setBackground(new java.awt.Color(255, 255, 255));
        CardLayoutPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NGOHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(NGOMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(CardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(NGOHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NGOMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void headerUserNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerUserNameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_headerUserNameMousePressed

    private void logoutBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_logoutBtnMousePressed

    private void OrgCampsLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrgCampsLblMousePressed
        // TODO add your handling code here:
//        organizeCampsBtnFunctionality();
    }//GEN-LAST:event_OrgCampsLblMousePressed

    private void campIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campIconMousePressed
        // TODO add your handling code here:
//        organizeCampsBtnFunctionality();
    }//GEN-LAST:event_campIconMousePressed

    private void organizeCampsBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizeCampsBtnMousePressed
        // TODO add your handling code here:
//        organizeCampsBtnFunctionality();

    }//GEN-LAST:event_organizeCampsBtnMousePressed

    private void organizationsBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationsBtnMousePressed
        // TODO add your handling code here:
//        manageOrganizationsBtnFunctionality();

    }//GEN-LAST:event_organizationsBtnMousePressed

    private void ManageProLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageProLblMousePressed
        // TODO add your handling code here:
        manageRegFunctionality();
    }//GEN-LAST:event_ManageProLblMousePressed

    private void proIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proIconMousePressed
        // TODO add your handling code here:
//        manageProfileBtnFunctionality();
    }//GEN-LAST:event_proIconMousePressed

    private void manageProfileBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProfileBtnMousePressed
        // TODO add your handling code here:
//        manageProfileBtnFunctionality();
    }//GEN-LAST:event_manageProfileBtnMousePressed
    
    public void manageRegFunctionality(){
        setBtnColor(manageProfileBtn);
//        resetBtnColor(organizationsBtn);
//        resetBtnColor(organizeCampsBtn);
//        resetBtnColor(insightsBtn);
//        resetBtnColor(manageDonorsBtn);
        
        
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(new ManageRegistration());
        ((CardLayout) CardLayoutPanel.getLayout()).next(CardLayoutPanel);
    }
    
    public void setBtnColor(JPanel panel) {
        
        panel.setBackground(new Color(210, 75, 60));
        
    }
    
    public void resetBtnColor(JPanel panel) {
        
        panel.setBackground(new Color (223, 85, 71));
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardLayoutPanel;
    private javax.swing.JLabel ManageDonLbl;
    private javax.swing.JLabel ManageOrgLbl;
    private javax.swing.JLabel ManageProLbl;
    private javax.swing.JPanel NGOHeader;
    private javax.swing.JPanel NGOMenu;
    private javax.swing.JLabel OrgCampsLbl;
    private javax.swing.JLabel bloodonateLbl;
    private javax.swing.JLabel campIcon;
    private javax.swing.JLabel donorIcon;
    private javax.swing.JLabel headerUserName;
    private javax.swing.JPanel insightsBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JPanel manageDonorsBtn;
    private javax.swing.JPanel manageProfileBtn;
    private javax.swing.JLabel orgIcon;
    private javax.swing.JPanel organizationsBtn;
    private javax.swing.JPanel organizeCampsBtn;
    private javax.swing.JLabel proIcon;
    // End of variables declaration//GEN-END:variables
}