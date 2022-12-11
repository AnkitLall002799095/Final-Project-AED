/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.LegalCompany;

import Business.FinanceCompanyPackage.FinanceCompany;
import java.util.ArrayList;

/**
 *
 * @author hmitt
 */
public class LegalCompanyDirectory {
    
    private ArrayList<LegalCompany> legalList;
    
    public LegalCompanyDirectory(){
        this.legalList = new ArrayList<LegalCompany>();
    }

    public ArrayList<LegalCompany> getLegalList() {
        return legalList;
    }

    public void setLegalList(ArrayList<LegalCompany> legalList) {
        this.legalList = legalList;
    }
    
    public LegalCompany addNewProfile() {
        LegalCompany newProfile = new LegalCompany();
        legalList.add(newProfile);
        return newProfile;
    }

    public void deleteProfile(LegalCompany legal) {
	legalList.remove(legal);
    }

}