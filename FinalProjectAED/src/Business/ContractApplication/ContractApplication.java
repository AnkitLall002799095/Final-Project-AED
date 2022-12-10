/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ContractApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ankitlall
 */
public class ContractApplication {
    
    int appId;
    int aptId;
    int aptNum;
    int propId;
    int elecCompId;
    int waterCompId;
    int gasCompId;
    String appOwner;
    String appOwnerType;
    String propName;
    LocalDate date;
    String street;
    String community;
    String city;
    String state;
    String type;
    int roomCount;
    int bathCount;
    List<String> features;
    Double sqft;
    LocalDate availability;
    List<String> utilities;
    String appStatus;
    int managementCompanyId;
    String managementCompany;
    List<String> images;
    
    long elecAccNum;
    LocalDate elecBillingDate;
    long elecContactNum;
    
            
    public ContractApplication(int aptNum,             
            String propName, 
            LocalDate date, 
            String street, 
            String community, 
            String city, 
            String state, 
            String type, 
            int roomCount, 
            int bathCount,
            ArrayList<String> features,
            Double sqft,
            LocalDate availability,
            ArrayList<String> utilities,
            ArrayList<String> images,            
            String managementCompany,
            int aptId,
            int propId,
            int managementCompanyId,
            String appStatus,
            String appOwner,
            String appOwnerType,
            int appId,
            int elecCompId,
            int waterCompId,
            int gasCompId) 
    {
        this.aptId = aptId;
        this.propId = propId;
        this.managementCompanyId = managementCompanyId;
        this.appId = appId;
        this.aptNum = aptNum;
        this.appStatus = appStatus;
        this.availability = availability;
        this.bathCount = bathCount;
        this.street = street;
        this.city = city;
        this.community = community;
        this.date = date;
        this.state = state;
        this.type = type;
        this.roomCount = roomCount;
        this.features = features;
        this.sqft = sqft;
        this.utilities = utilities;
        this.propName = propName;
        this.images = images;
        this.managementCompany = managementCompany;
        this.appOwner = appOwner;
        this.appOwnerType = appOwnerType;
        this.elecCompId=elecCompId;
        this.waterCompId=waterCompId;
        this.gasCompId=gasCompId;
    }
    
    public void setElecAccNum(long elecAccNum) {
        this.elecAccNum = elecAccNum;
    }
    
    public void setElecBillingDate(LocalDate elecBillingDate) {
        this.elecBillingDate = elecBillingDate;
    }
        
    public void setElecContactNum(long elecContactNum) {
        this.elecContactNum=elecContactNum;
    }
    
    public long getElecAccNum() {
       return elecAccNum;
    }
    
    public LocalDate getElecBillingDate() {
        return elecBillingDate;
    }
        
    public long getElecContactNum() {
        return elecContactNum;
    }
    
    public int getAppId() {
        return appId;
    }
    
    public int getAptId() {
        return aptId;
    }
    
    public int getAptNum() {
        return aptNum;
    }
    
    public int getPropId() {
        return propId;
    }
    
    public int getElecCompId() {
        return elecCompId;
    }
    
    public int getWaterCompId() {
        return waterCompId;
    }
    
    public int getGasCompId() {
        return gasCompId;
    }
    
    public String getPropName() {
        return propName;
    }
    
    public String getAppOwner() {
        return appOwner;
    }
    
    public String getAppOwnerType() {
        return appOwnerType;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public String getStreet() {
        return street;
    }
    
    public String getCommunity() {
        return community;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }
    
    public String getType() {
        return type;
    }
    
    public int getRoomCount() {
        return roomCount;
    }
    
    public int getBathCount() {
        return bathCount;
    }
    
    public List<String> getFeatures() {
        return features;
    }
    
    public Double getSqft() {
        return sqft;
    }
    
    public LocalDate getAvailability() {
        return availability;
    }
    
    public List<String> getUtilities() {
        return utilities;
    }
    
    public String getAppStatus() {
        return appStatus;
    }
    
    public int getManagementCompanyId() {
        return managementCompanyId;
    }
    
    public String getManagementCompany() {
        return managementCompany;
    }
    
    public List<String> getImages() {
        return images;
    }
}
