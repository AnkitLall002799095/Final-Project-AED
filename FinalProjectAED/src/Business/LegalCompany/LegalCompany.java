/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.LegalCompany;

/**
 *
 * @author hmitt
 */
public class LegalCompany {
    private int legalId;
    private String legalName;
    private String legalCity;
    private String legalState;
    String companyName;
    
    public LegalCompany() {
    }
    
    public LegalCompany(String name) {
        this.companyName = name;
    }

    public int getLegalId() {
        return legalId;
    }

    public void setLegalId(int legalId) {
        this.legalId = legalId;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalCity() {
        return legalCity;
    }

    public void setLegalCity(String legalCity) {
        this.legalCity = legalCity;
    }

    public String getLegalState() {
        return legalState;
    }

    public void setLegalState(String legalState) {
        this.legalState = legalState;
    }
    
    
    
    public void setCompanyName(String companyName) {
        this.companyName=companyName;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
}
