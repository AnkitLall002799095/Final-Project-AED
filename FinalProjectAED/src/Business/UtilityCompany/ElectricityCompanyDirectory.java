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
}
