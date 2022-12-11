/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.LegalCompany;

import Business.FinanceCompanyPackage.FinanceCompany;
import java.util.ArrayList;

/**
 *
 * @author ankitlall
 */
public class LegalCompanyDirectory {
    private ArrayList<LegalCompany> legalCompanyList;
    
    public LegalCompanyDirectory() {
        this.legalCompanyList= new ArrayList<LegalCompany>();
    }
    
    public void createNewCompany() {
        
    }
    
    public void addNewCompanyToList(LegalCompany company) {
        legalCompanyList.add(company);
    }
    
    public ArrayList<LegalCompany> getLegalCompanyList() {
        return this.legalCompanyList;
    }
}
