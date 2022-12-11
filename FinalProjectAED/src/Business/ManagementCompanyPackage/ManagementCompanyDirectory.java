/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ManagementCompanyPackage;

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
}
