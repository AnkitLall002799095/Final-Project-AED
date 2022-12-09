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
}
