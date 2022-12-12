/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.LegalCompany;

import Application.Utils.DatabaseUtils;
import Business.FinanceCompanyPackage.FinanceCompany;
import Business.ManagementCompanyPackage.ManagementCompany;
import Business.ManagementCompanyPackage.ManagementCompanyDirectory;
import java.util.ArrayList;
import java.util.ArrayList;

/**
 *
 * @author hmitt
 */
public class LegalCompanyDirectory {
    
    private ArrayList<LegalCompany> legalCompanyList;
    
    public LegalCompanyDirectory(){
        this.legalCompanyList = new ArrayList<LegalCompany>();
    }

    public ArrayList<LegalCompany> getLegalList() {
        return legalCompanyList;
    }

    public void setLegalList(ArrayList<LegalCompany> legalList) {
        this.legalCompanyList = legalList;
    }
    
    public LegalCompany addNewProfile() {
        LegalCompany newProfile = new LegalCompany();
        legalCompanyList.add(newProfile);
        return newProfile;
    }

    public void deleteProfile(LegalCompany legal) {
	legalCompanyList.remove(legal);
    }
    
    public void addNewCompanyToList(LegalCompany company) {
        legalCompanyList.add(company);
    }
    
    public ArrayList<LegalCompany> getLegalCompanyList() {
        return this.legalCompanyList;
    }
    
    public LegalCompany getCompanyDetails(int id) {
        LegalCompanyDirectory dir = DatabaseUtils.getLegalListFromDB();
        LegalCompany resComp = null;
        for(LegalCompany comp : dir.getLegalList()) {
            if(comp.getLegalId()== id) {
                resComp = comp;
            }
        }
        
        return resComp;
    }
    
    public void updateCompanyInfo(LegalCompany comp) {
        DatabaseUtils.updateCompany("legal_companies", comp.getLegalId(), comp.getLegalName(), comp.getLegalCity(), comp.getLegalState(), "legal_comp_id", "legal_comp_name", "legal_city", "legal_state");
    }
    
    public void deleteCompany(int id) {
        DatabaseUtils.deleteCompany("management_companies", id, "legal_comp_id");
    }

}
