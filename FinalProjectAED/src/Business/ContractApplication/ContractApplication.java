/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ContractApplication;

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
    String propName;
    Date date;
    String street;
    String community;
    String city;
    String state;
    String type;
    int roomCount;
    int bathCount;
    List<String> features;
    Double sqft;
    Date availability;
    List<String> utilities;
    String appStatus;
    int managementCompanyId;
    String managementCompany;
    List<String> images;
            
    public ContractApplication(int aptNum,             
            String propName, 
            Date date, 
            String street, 
            String community, 
            String city, 
            String state, 
            String type, 
            int roomCount, 
            int bathCount,
            ArrayList<String> features,
            Double sqft,
            Date availability,
            ArrayList<String> utilities,
            ArrayList<String> images,            
            String managementCompany,
            int aptId,
            int propId,
            int managementCompanyId,
            String appStatus,
            String appOwner,
            int appId) 
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
        
        this.appStatus = "utilityComp";
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
    
    public String getPropName() {
        return propName;
    }
    
    public Date getDate() {
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
    
    public Date getAvailability() {
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
