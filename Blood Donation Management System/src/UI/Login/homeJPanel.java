/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Login;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author surajvisvesh
 */
public class homeJPanel extends javax.swing.JPanel {
    
    JPanel mainFrameCardLayout;
    
    
    /**
     * Creates new form homeJPanel
     */
    public homeJPanel(JPanel mainFrameCardLayout) {
        initComponents();
        this.mainFrameCardLayout = mainFrameCardLayout;
        underscoreVisibility(true, false, false);
        loadLoginPage();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginCardLayout = new javax.swing.JPanel();
        NGOHeader = new javax.swing.JPanel();
        bloodonateLbl = new javax.swing.JLabel();
        loginHeaderBtn = new javax.swing.JLabel();
        registerHeaderBtn = new javax.swing.JLabel();
        aboutUsHeaderBtn = new javax.swing.JLabel();
        loginUnderscore = new javax.swing.JPanel();
        registerUnderscore = new javax.swing.JPanel();
        aboutusUnderscore = new javax.swing.JPanel();

        loginCardLayout.setBackground(new java.awt.Color(255, 255, 255));
        loginCardLayout.setLayout(new java.awt.CardLayout());

        NGOHeader.setBackground(new java.awt.Color(223, 85, 71));

        bloodonateLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        bloodonateLbl.setForeground(new java.awt.Color(215, 215, 215));
        bloodonateLbl.setText("BLOODONATE");
        bloodonateLbl.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        loginHeaderBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        loginHeaderBtn.setForeground(new java.awt.Color(215, 215, 215));
        loginHeaderBtn.setText("LOGIN");
        loginHeaderBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        loginHeaderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginHeaderBtnMousePressed(evt);
            }
        });

        registerHeaderBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        registerHeaderBtn.setForeground(new java.awt.Color(215, 215, 215));
        registerHeaderBtn.setText("REGISTER");
        registerHeaderBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        registerHeaderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registerHeaderBtnMousePressed(evt);
            }
        });

        aboutUsHeaderBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        aboutUsHeaderBtn.setForeground(new java.awt.Color(215, 215, 215));
        aboutUsHeaderBtn.setText("ABOUT US");
        aboutUsHeaderBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        aboutUsHeaderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutUsHeaderBtnMousePressed(evt);
            }
        });

        loginUnderscore.setBackground(new java.awt.Color(215, 215, 215));
        loginUnderscore.setPreferredSize(new java.awt.Dimension(100, 6));

        javax.swing.GroupLayout loginUnderscoreLayout = new javax.swing.GroupLayout(loginUnderscore);
        loginUnderscore.setLayout(loginUnderscoreLayout);
        loginUnderscoreLayout.setHorizontalGroup(
            loginUnderscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        loginUnderscoreLayout.setVerticalGroup(
            loginUnderscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        registerUnderscore.setBackground(new java.awt.Color(215, 215, 215));
        registerUnderscore.setPreferredSize(new java.awt.Dimension(92, 4));

        javax.swing.GroupLayout registerUnderscoreLayout = new javax.swing.GroupLayout(registerUnderscore);
        registerUnderscore.setLayout(registerUnderscoreLayout);
        registerUnderscoreLayout.setHorizontalGroup(
            registerUnderscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        registerUnderscoreLayout.setVerticalGroup(
            registerUnderscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        aboutusUnderscore.setBackground(new java.awt.Color(215, 215, 215));
        aboutusUnderscore.setPreferredSize(new java.awt.Dimension(92, 4));

        javax.swing.GroupLayout aboutusUnderscoreLayout = new javax.swing.GroupLayout(aboutusUnderscore);
        aboutusUnderscore.setLayout(aboutusUnderscoreLayout);
        aboutusUnderscoreLayout.setHorizontalGroup(
            aboutusUnderscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        aboutusUnderscoreLayout.setVerticalGroup(
            aboutusUnderscoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout NGOHeaderLayout = new javax.swing.GroupLayout(NGOHeader);
        NGOHeader.setLayout(NGOHeaderLayout);
        NGOHeaderLayout.setHorizontalGroup(
            NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NGOHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloodonateLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 840, Short.MAX_VALUE)
                .addGroup(NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginHeaderBtn)
                    .addComponent(loginUnderscore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerHeaderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerUnderscore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aboutUsHeaderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aboutusUnderscore, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        NGOHeaderLayout.setVerticalGroup(
            NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NGOHeaderLayout.createSequentialGroup()
                .addGroup(NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NGOHeaderLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginHeaderBtn)
                            .addComponent(registerHeaderBtn)
                            .addComponent(aboutUsHeaderBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NGOHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginUnderscore, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                            .addComponent(registerUnderscore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aboutusUnderscore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(NGOHeaderLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(bloodonateLbl)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NGOHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(NGOHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginHeaderBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginHeaderBtnMousePressed
        // TODO add your handling code here:
        underscoreVisibility(true, false, false);
        loadLoginPage();
    }//GEN-LAST:event_loginHeaderBtnMousePressed

    private void registerHeaderBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerHeaderBtnMousePressed
        // TODO add your handling code here:
        underscoreVisibility(false, true, false);
        loadRegistrationPage();
    }//GEN-LAST:event_registerHeaderBtnMousePressed

    private void aboutUsHeaderBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsHeaderBtnMousePressed
        // TODO add your handling code here:
        underscoreVisibility(false, false, true);
    }//GEN-LAST:event_aboutUsHeaderBtnMousePressed

    public void loadLoginPage() {
        loginCardLayout.removeAll();
        loginCardLayout.add(new LoginJPanel(mainFrameCardLayout));
        ((CardLayout) loginCardLayout.getLayout()).next(loginCardLayout);
    }
    
    public void loadRegistrationPage() {
        loginCardLayout.removeAll();
        loginCardLayout.add(new RegistrationJPanel(loginCardLayout));
        ((CardLayout) loginCardLayout.getLayout()).next(loginCardLayout);
    }
    
    public void underscoreVisibility(boolean login, boolean register, boolean aboutus) {
        
        loginUnderscore.setVisible(login);
        registerUnderscore.setVisible(register);
        aboutusUnderscore.setVisible(aboutus);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NGOHeader;
    private javax.swing.JLabel aboutUsHeaderBtn;
    private javax.swing.JPanel aboutusUnderscore;
    private javax.swing.JLabel bloodonateLbl;
    private javax.swing.JPanel loginCardLayout;
    private javax.swing.JLabel loginHeaderBtn;
    private javax.swing.JPanel loginUnderscore;
    private javax.swing.JLabel registerHeaderBtn;
    private javax.swing.JPanel registerUnderscore;
    // End of variables declaration//GEN-END:variables
}