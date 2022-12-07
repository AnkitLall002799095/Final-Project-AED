/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ContractApplication;

import java.util.List;

/**
 *
 * @author ankitlall
 */
public class ContractApplicationCatalog {
    
    List<ContractApplication> contractApplicationCatalog;
    
    public void newContract(ContractApplication contract) {
        contractApplicationCatalog.add(contract);
    }
    
    public List<ContractApplication> getContractApplications() {
        
        return contractApplicationCatalog;
    }
    
    public List<ContractApplication> getContracts() {
        return contractApplicationCatalog;
    }
}
