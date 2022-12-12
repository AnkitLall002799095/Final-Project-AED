/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FinanceCompanyPackage;

/**
 *
 * @author hmitt
 */
public class FinanceCompany {
    private int financeId;
    private String financeName;
    private String financeCity;
    private String financeState;
    String companyName;
    int finId;
    
    public FinanceCompany() {
    }
    
    public FinanceCompany(String name) {
        this.companyName = name;
    }

    public int getFinanceId() {
        return financeId;
    }

    public void setFinanceId(int financeId) {
        this.financeId = financeId;
    }

    public String getFinanceName() {
        return financeName;
    }

    public void setFinanceName(String financeName) {
        this.financeName = financeName;
    }

    public String getFinanceCity() {
        return financeCity;
    }

    public void setFinanceCity(String financeCity) {
        this.financeCity = financeCity;
    }

    public String getFinanceState() {
        return financeState;
    }

    public void setFinanceState(String financeState) {
        this.financeState = financeState;
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
