/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BBEnt;

/**
 *
 * @author HP
 */
public class bbPlatelet {
      private int  itemId; 
private int sampleId;
private int plateletQty; 
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

    public int getPlateletQty() {
        return plateletQty;
    }

    public void setPlateletQty(int plateletQty) {
        this.plateletQty = plateletQty;
    }

    public String getExpirationDt() {
        return expirationDt;
    }

    public void setExpirationDt(String expirationDt) {
        this.expirationDt = expirationDt;
    }

}
