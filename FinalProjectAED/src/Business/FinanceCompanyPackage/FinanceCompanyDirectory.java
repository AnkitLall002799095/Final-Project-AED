/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FinanceCompanyPackage;

import Business.ManagementCompany.ManagementCompany;
import java.util.ArrayList;

/**
 *
 * @author ankitlall
 */
public class FinanceCompanyDirectory {
    private ArrayList<FinanceCompany> financeCompanyList;
    
    public FinanceCompanyDirectory() {
        this.financeCompanyList= new ArrayList<FinanceCompany>();
    }
    
    public void createNewCompany() {
        
    }
    
    public void addNewCompanyToList(FinanceCompany company) {
        financeCompanyList.add(company);
    }
    
    public ArrayList<FinanceCompany> getFinanceCompanyList() {
        return this.financeCompanyList;
    }
}
