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
public class ElectricityCompanyDirectory {
    
    private ArrayList<ElectricityCompany> elecList;
    
    public ElectricityCompanyDirectory(){
        this.elecList = new ArrayList<ElectricityCompany>();
    }

    public ArrayList<ElectricityCompany> getElecList() {
        return elecList;
    }

    public void setElecList(ArrayList<ElectricityCompany> elecList) {
        this.elecList = elecList;
    }
    
    public ElectricityCompany addNewProfile() {
        ElectricityCompany newProfile = new ElectricityCompany();
        elecList.add(newProfile);
        return newProfile;
    }
    
    public void deleteProfile(ElectricityCompany elec) {
        elecList.remove(elec);
    }
    
    public ElectricityCompany getCompanyDetails(int id) {
        ElectricityCompanyDirectory dir = DatabaseUtils.getElecListFromDB();
        ElectricityCompany resComp = null;
        for(ElectricityCompany comp : dir.getElecList()) {
            if(comp.getElectricityId()== id) {
                resComp = comp;
            }
        }
        
        return resComp;
    }
    
    public void updateCompanyInfo(ElectricityCompany comp) {
        DatabaseUtils.updateCompany("electricity_companies", comp.getElectricityId(), comp.getElectricityName(), comp.getElectricityCity(), comp.getElectricityState(), "elec_comp_id", "elec_comp_name", "elec_city", "elec_state");
    }
    
    public void deleteCompany(int id) {
        DatabaseUtils.deleteCompany("management_companies", id, "elec_comp_id");
    }
}
