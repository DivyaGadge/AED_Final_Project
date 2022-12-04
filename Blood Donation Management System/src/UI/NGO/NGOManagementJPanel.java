/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.NGO;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author surajvisvesh
 */
public class NGOManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOManagementJPanel
     */
    public NGOManagementJPanel() {
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

        NGOHeader = new javax.swing.JPanel();
        bloodonateLbl = new javax.swing.JLabel();
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NGOHeader.setBackground(new java.awt.Color(207, 98, 98));

        bloodonateLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        bloodonateLbl.setForeground(new java.awt.Color(215, 215, 215));
        bloodonateLbl.setText("BLOODONATE");
        bloodonateLbl.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        javax.swing.GroupLayout NGOHeaderLayout = new javax.swing.GroupLayout(NGOHeader);
        NGOHeader.setLayout(NGOHeaderLayout);
        NGOHeaderLayout.setHorizontalGroup(
            NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NGOHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloodonateLbl)
                .addContainerGap(1168, Short.MAX_VALUE))
        );
        NGOHeaderLayout.setVerticalGroup(
            NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NGOHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bloodonateLbl)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        add(NGOHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1428, -1));

        NGOMenu.setBackground(new java.awt.Color(207, 98, 98));
        NGOMenu.setPreferredSize(new java.awt.Dimension(220, 700));
        NGOMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizeCampsBtn.setBackground(new java.awt.Color(207, 98, 98));
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

        organizationsBtn.setBackground(new java.awt.Color(207, 98, 98));
        organizationsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                organizationsBtnMousePressed(evt);
            }
        });

        ManageOrgLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageOrgLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageOrgLbl.setText("Organizations");

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

        manageProfileBtn.setBackground(new java.awt.Color(207, 98, 98));
        manageProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProfileBtnMousePressed(evt);
            }
        });

        ManageProLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        ManageProLbl.setForeground(new java.awt.Color(215, 215, 215));
        ManageProLbl.setText("Manage NGO Profile");
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

        manageDonorsBtn.setBackground(new java.awt.Color(207, 98, 98));

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

        insightsBtn.setBackground(new java.awt.Color(207, 98, 98));

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

        jPanel10.setBackground(new java.awt.Color(207, 98, 98));

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

        add(NGOMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 280, 702));

        CardLayoutPanel.setBackground(new java.awt.Color(255, 255, 255));
        CardLayoutPanel.setLayout(new java.awt.CardLayout());
        add(CardLayoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 92, 1142, 702));
    }// </editor-fold>//GEN-END:initComponents

    private void organizeCampsBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizeCampsBtnMousePressed
        // TODO add your handling code here:
        organizeCampsBtnFunctionality();  
        
    }//GEN-LAST:event_organizeCampsBtnMousePressed
    
    private void OrgCampsLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrgCampsLblMousePressed
        // TODO add your handling code here:
        organizeCampsBtnFunctionality();
    }//GEN-LAST:event_OrgCampsLblMousePressed

    private void campIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campIconMousePressed
        // TODO add your handling code here:
        organizeCampsBtnFunctionality();
    }//GEN-LAST:event_campIconMousePressed

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

    private void organizationsBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationsBtnMousePressed
        // TODO add your handling code here:
        manageOrganizationsBtnFunctionality();
        
        
    }//GEN-LAST:event_organizationsBtnMousePressed
    
    public void setBtnColor(JPanel panel) {
        
        panel.setBackground(new Color(230, 98, 98));
        
    }
    
    public void resetBtnColor(JPanel panel) {
        
        panel.setBackground(new Color (207, 98, 98));
        
    }
    public void manageProfileBtnFunctionality(){
        
        setBtnColor(manageProfileBtn);
        resetBtnColor(organizationsBtn);
        resetBtnColor(organizeCampsBtn);
        resetBtnColor(insightsBtn);
        resetBtnColor(manageDonorsBtn);
        
        
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(new ManageNGOProfileJPanel());
        ((CardLayout) CardLayoutPanel.getLayout()).next(CardLayoutPanel);
        
    }
    
    public void manageOrganizationsBtnFunctionality(){
        
        setBtnColor(organizationsBtn);
        resetBtnColor(manageProfileBtn);
        resetBtnColor(organizeCampsBtn);
        resetBtnColor(insightsBtn);
        resetBtnColor(manageDonorsBtn);
        
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(new ManageNGOOrganizationsJPanel());
        ((CardLayout)CardLayoutPanel.getLayout()).next(CardLayoutPanel);
        
        
    }
    
    public void organizeCampsBtnFunctionality(){
        
        setBtnColor(organizeCampsBtn);
        resetBtnColor(organizationsBtn);
        resetBtnColor(manageProfileBtn);
        resetBtnColor(insightsBtn);
        resetBtnColor(manageDonorsBtn);
        
        
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(new ManageNGOCampsJPanel());
        ((CardLayout) CardLayoutPanel.getLayout()).next(CardLayoutPanel);
        
    }
    
    public void setIcons() {
        
        
        
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
    private javax.swing.JPanel insightsBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel manageDonorsBtn;
    private javax.swing.JPanel manageProfileBtn;
    private javax.swing.JLabel orgIcon;
    private javax.swing.JPanel organizationsBtn;
    private javax.swing.JPanel organizeCampsBtn;
    private javax.swing.JLabel proIcon;
    // End of variables declaration//GEN-END:variables
}