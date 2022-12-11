/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BBEnt;

/**
 *
 * @author prishaa
 */
public class bbRbc {
     private int  itemId; 
private int sampleId;
private int rbcQty; 
private String expirationDt;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getSampleId() {
        return sampleId;
    }

    public void setSampleId(int sampleId) {
        this.sampleId = sampleId;
    }

    public int getRbcQty() {
        return rbcQty;
    }

    public void setRbcQty(int rbcQty) {
        this.rbcQty = rbcQty;
    }

    public String getExpirationDt() {
        return expirationDt;
    }

    public void setExpirationDt(String expirationDt) {
        this.expirationDt = expirationDt;
    }
    

}
