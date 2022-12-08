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
            int managementCompanyId) 
    {
        this.aptId = aptId;
        this.propId = propId;
        this.managementCompanyId = managementCompanyId;
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
}
