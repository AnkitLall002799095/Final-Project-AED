/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.LegalCompany;

/**
 *
 * @author ankitlall
 */
public class LegalCompany {
    String companyName;
    int legalId;
    
    public LegalCompany(String name) {
        this.companyName = name;
    }
    
    public void setLegalId(int legalId) {
        this.legalId=legalId;
    }
    
    public int getLegalId() {
        return this.legalId;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName=companyName;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
}
