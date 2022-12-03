/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

import java.util.Date;

/**
 *
 * @author hmitt
 */
public class Apartment {
    
    private int aptId;
    private int tenantId;
    private int size;
    private int bedroom;
    private int bathroom;
    private String type;
    private Date avlblDate;
    private int rent;
    private String details;
    private String lattitude;
    private String longitude;
    private boolean isLeased;
    public Property prop;

    public int getAptId() {
        return aptId;
    }

    public void setAptId(int aptId) {
        this.aptId = aptId;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getAvlblDate() {
        return avlblDate;
    }

    public void setAvlblDate(Date avlblDate) {
        this.avlblDate = avlblDate;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public boolean isIsLeased() {
        return isLeased;
    }

    public void setIsLeased(boolean isLeased) {
        this.isLeased = isLeased;
    }
    
    public Property getProp() {
        return prop;
    }

    public void setProp(Property prop) {
        this.prop = prop;
    }
    
}
