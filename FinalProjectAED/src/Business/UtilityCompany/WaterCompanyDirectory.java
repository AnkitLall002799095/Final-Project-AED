/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UtilityCompany;

import Application.Utils.DatabaseUtils;
import Business.ManagementCompanyPackage.ManagementCompany;
import Business.ManagementCompanyPackage.ManagementCompanyDirectory;
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
    
    public WaterCompany getCompanyDetails(int id) {
        WaterCompanyDirectory dir = DatabaseUtils.getWaterListFromDB();
        WaterCompany resComp = null;
        for(WaterCompany comp : dir.getWaterList()) {
            if(comp.getWaterId()== id) {
                resComp = comp;
            }
        }
        
        return resComp;
    }
    
    public void updateCompanyInfo(WaterCompany comp) {
        DatabaseUtils.updateCompany("water_companies", comp.getWaterId(), comp.getWaterName(), comp.getWaterCity(), comp.getWaterState(), "water_comp_id", "water_comp_name", "water_city", "water_state");
    }
    
    public void deleteCompany(int id) {
        DatabaseUtils.deleteCompany("management_companies", id, "water_comp_id");
    }
}
