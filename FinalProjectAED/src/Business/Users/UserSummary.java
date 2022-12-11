/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Users;

import Application.Utils.DatabaseUtils;
import Business.Apartment.ApartmentDirectory;

/**
 *
 * @author hmitt
 */
public class UserSummary {
    
    ApartmentDirectory aptList;
    
    public UserSummary(){
        aptList= DatabaseUtils.getAptListFromDB();
    }
    
    public static int totalApartments(){
        
    }
    
}
