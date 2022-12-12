/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ManagementCompanyPackage;

import Application.Utils.DatabaseUtils;
import java.util.ArrayList;

/**
 *
 * @author hmitt
 */
public class ManagementCompanyDirectory {
    private ArrayList<ManagementCompany> mgmtList;
    
    public ManagementCompanyDirectory(){
        this.mgmtList= new ArrayList<ManagementCompany>();
    }

    public ArrayList<ManagementCompany> getMgmtList() {
        return mgmtList;
    }

    public void setMgmtList(ArrayList<ManagementCompany> mgmtList) {
        this.mgmtList = mgmtList;
    }
    
    public ManagementCompany addNewProfile() {
        ManagementCompany newProfile = new ManagementCompany();
        mgmtList.add(newProfile);
        return newProfile;
    }

    public void deleteProfile(ManagementCompany mgmt) {
	mgmtList.remove(mgmt);
    }
    
    public ManagementCompany getCompanyDetails(int id) {
        ManagementCompanyDirectory dir = DatabaseUtils.getMgmtListFromDB();
        ManagementCompany resComp = null;
        for(ManagementCompany comp : dir.getMgmtList()) {
            if(comp.getMgmtId() == id) {
                resComp = comp;
            }
        }
        
        return resComp;
    }
    
    public void updateCompanyInfo(ManagementCompany comp) {
        DatabaseUtils.updateCompany("management_companies", comp.getMgmtId(), comp.getMgmtName(), comp.getCity(), comp.getState(), "mgt_comp_id", "mgt_comp_name", "mgt_city", "mgt_state");
    }
    
    public void deleteCompany(int id) {
        DatabaseUtils.deleteCompany("management_companies", id, "mgt_comp_id");
    }
}
