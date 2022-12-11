/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.LegalCompany;

import Business.FinanceCompanyPackage.FinanceCompany;
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

}
