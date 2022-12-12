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
public class GasCompanyDirectory {
    
    private ArrayList<GasCompany> gasList;
    
    public GasCompanyDirectory(){
        this.gasList = new ArrayList<GasCompany>();
    }

    public ArrayList<GasCompany> getGasList() {
        return gasList;
    }

    public void setGasList(ArrayList<GasCompany> gasList) {
        this.gasList = gasList;
    }
    
    public GasCompany addNewProfile() {
        GasCompany newProfile = new GasCompany();
        gasList.add(newProfile);
        return newProfile;
    }
    
    public void deleteProfile(GasCompany gas) {
        gasList.remove(gas);
    }
    
    public GasCompany getCompanyDetails(int id) {
        GasCompanyDirectory dir = DatabaseUtils.getGasListFromDB();
        GasCompany resComp = null;
        for(GasCompany comp : dir.getGasList()) {
            if(comp.getGasId()== id) {
                resComp = comp;
            }
        }
        
        return resComp;
    }
    
    public void updateCompanyInfo(GasCompany comp) {
        DatabaseUtils.updateCompany("gas_companies", comp.getGasId(), comp.getGasName(), comp.getGasCity(), comp.getGasState(), "gas_comp_id", "gas_comp_name", "gas_city", "gas_state");
    }
    
    public void deleteCompany(int id) {
        DatabaseUtils.deleteCompany("management_companies", id, "gas_comp_id");
    }
}
