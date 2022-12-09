/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.BBEnt;

/**
 *
 * @author prishaa
 */
public class BBSampleTesting {

    private int sample_id;
    private String sample_testing_org_username;
    private String bloodGroup;
    private String testStatus;
    private String collectionDate;
    private float plasmaQty;
    private float plateletQty;
    private float rbcQty;
    private float bloodSampleCount;
    
    public int getSample_id() {
        return sample_id;
    }

    public void setSample_id(int sample_id) {
        this.sample_id = sample_id;
    }

    public String getSample_testing_org_username() {
        return sample_testing_org_username;
    }

    public void setSample_testing_org_username(String sample_testing_org_username) {
        this.sample_testing_org_username = sample_testing_org_username;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate;
    }

    public float getPlasmaQty() {
        return plasmaQty;
    }

    public void setPlasmaQty(float plasmaQty) {
        this.plasmaQty = plasmaQty;
    }

    public float getPlateletQty() {
        return plateletQty;
    }

    public void setPlatelet(float platelet) {
        this.plateletQty = plateletQty;
    }

    public float getRbcQty() {
        return rbcQty;
    }

    public void setRbcQty(float rbcQty) {
        this.rbcQty = rbcQty;
    }
    
}
