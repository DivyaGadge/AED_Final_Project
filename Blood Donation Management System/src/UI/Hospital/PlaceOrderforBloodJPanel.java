/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;

/**
 *
 * @author divyagadge
 */
public class PlaceOrderforBloodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlaceOrderforBloodJPanel
     */
    public PlaceOrderforBloodJPanel() {
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

        placeorderBtn = new javax.swing.JPanel();
        placeorderLbl = new javax.swing.JLabel();

        placeorderBtn.setBackground(new java.awt.Color(106, 106, 106));

        placeorderLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        placeorderLbl.setForeground(new java.awt.Color(255, 255, 255));
        placeorderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeorderLbl.setText("Place Order");

        javax.swing.GroupLayout placeorderBtnLayout = new javax.swing.GroupLayout(placeorderBtn);
        placeorderBtn.setLayout(placeorderBtnLayout);
        placeorderBtnLayout.setHorizontalGroup(
            placeorderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeorderLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        placeorderBtnLayout.setVerticalGroup(
            placeorderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeorderLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(804, Short.MAX_VALUE)
                .addComponent(placeorderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addComponent(placeorderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel placeorderBtn;
    private javax.swing.JLabel placeorderLbl;
    // End of variables declaration//GEN-END:variables
}
