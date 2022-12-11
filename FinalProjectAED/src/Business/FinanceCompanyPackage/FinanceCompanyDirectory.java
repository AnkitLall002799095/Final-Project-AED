/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FinanceCompanyPackage;

import java.util.ArrayList;

/**
 *
 * @author hmitt
 */
public class FinanceCompanyDirectory {
    
    private ArrayList<FinanceCompany> financeCompanyList;
    
    public FinanceCompanyDirectory(){
        this.financeCompanyList= new ArrayList<FinanceCompany>();
    }

    public ArrayList<FinanceCompany> getFinanceList() {
        return financeCompanyList;
    }

    public void setFinanceList(ArrayList<FinanceCompany> financeList) {
        this.financeCompanyList = financeList;
    }
    
    public FinanceCompany addNewProfile() {
        FinanceCompany newProfile = new FinanceCompany();
        financeCompanyList.add(newProfile);
        return newProfile;
    }

    public void deleteProfile(FinanceCompany finance) {
	financeCompanyList.remove(finance);
    }
    
    public void addNewCompanyToList(FinanceCompany company) {
        financeCompanyList.add(company);
    }
    
    public ArrayList<FinanceCompany> getFinanceCompanyList() {
        return this.financeCompanyList;
    }
    
}
