/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FinanceCompany;

import java.util.ArrayList;

/**
 *
 * @author hmitt
 */
public class FinanceCompanyDirectory {
    
    private ArrayList<FinanceCompany> financeList;
    
    public FinanceCompanyDirectory(){
        this.financeList= new ArrayList<FinanceCompany>();
    }

    public ArrayList<FinanceCompany> getFinanceList() {
        return financeList;
    }

    public void setFinanceList(ArrayList<FinanceCompany> financeList) {
        this.financeList = financeList;
    }
    
    public FinanceCompany addNewProfile() {
        FinanceCompany newProfile = new FinanceCompany();
        financeList.add(newProfile);
        return newProfile;
    }

    public void deleteProfile(FinanceCompany finance) {
	financeList.remove(finance);
    }
}
