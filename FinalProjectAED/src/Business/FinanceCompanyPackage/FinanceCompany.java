/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FinanceCompanyPackage;

/**
 *
 * @author ankitlall
 */
public class FinanceCompany {
    String companyName;
    int finId;
    
    public FinanceCompany(String name) {
        this.companyName = name;
    }
    
    public void setFinId(int finId) {
        this.finId=finId;
    }
    
    public int getFinId() {
        return this.finId;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName=companyName;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
}
