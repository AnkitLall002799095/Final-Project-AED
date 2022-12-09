/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UtilityCompany;

import java.util.ArrayList;

/**
 *
 * @author hmitt
 */
public class WaterCompanyDirectory {
    
    private ArrayList<WaterCompany> waterList;
    
    public WaterCompanyDirectory(){
        this.waterList = new ArrayList<WaterCompany>();
    }

    public ArrayList<WaterCompany> getWaterList() {
        return waterList;
    }

    public void setWaterList(ArrayList<WaterCompany> waterList) {
        this.waterList = waterList;
    }
    
    public WaterCompany addNewProfile() {
        WaterCompany newProfile = new WaterCompany();
        waterList.add(newProfile);
        return newProfile;
    }
    
    public void deleteProfile(WaterCompany water) {
        waterList.remove(water);
    }
    
}
