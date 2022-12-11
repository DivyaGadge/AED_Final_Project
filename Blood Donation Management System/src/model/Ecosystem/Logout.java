/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Ecosystem;

import UI.Login.homeJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author surajvisvesh
 */
public class Logout {
    JPanel mainFrameCardLayout;
    
    public Logout(JPanel mainFrameCardLayout){
        this.mainFrameCardLayout = mainFrameCardLayout;
    }
    
    public void logoutFunctionality() {
        int result = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION){
        mainFrameCardLayout.removeAll();
        mainFrameCardLayout.add(new homeJPanel(mainFrameCardLayout));
        ((CardLayout) mainFrameCardLayout.getLayout()).next(mainFrameCardLayout);
        }
    }
}
