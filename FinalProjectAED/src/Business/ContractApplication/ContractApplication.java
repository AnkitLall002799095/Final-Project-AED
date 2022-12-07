/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ContractApplication;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ankitlall
 */
public class ContractApplication {
    
    int aptNum;
    int propNum;
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
    String managementCompany;
    
    public ContractApplication(int aptNum, 
            int propNum, 
            Date date, 
            String street, 
            String community, 
            String city, 
            String state, 
            String type, 
            int roomCount, 
            int bathCount,
            List<String> features,
            Double sqft,
            Date availability,
            List<String> utilities,
            String managementCompany) 
    {
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
        this.propNum = propNum;
        this.managementCompany = managementCompany;
        
        this.appStatus = "utilityComp";
    }
}
