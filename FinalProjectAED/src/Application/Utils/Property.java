/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

/**
 *
 * @author hmitt
 */
public class Property {
    private int propId;
    private int ownerId;
    private int mgtComp;
    private int mgtBroker;
    private String street;
    private String community;
    private String city;
    private String state;

    public int getPropId() {
        return propId;
    }

    public void setPropId(int propId) {
        this.propId = propId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getMgtComp() {
        return mgtComp;
    }

    public void setMgtComp(int mgtComp) {
        this.mgtComp = mgtComp;
    }

    public int getMgtBroker() {
        return mgtBroker;
    }

    public void setMgtBroker(int mgtBroker) {
        this.mgtBroker = mgtBroker;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}