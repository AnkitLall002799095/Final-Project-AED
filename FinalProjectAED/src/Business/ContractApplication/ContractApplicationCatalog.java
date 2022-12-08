/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ContractApplication;

import Application.Utils.DatabaseUtils;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ankitlall
 */
public class ContractApplicationCatalog {
    
    List<ContractApplication> contractApplicationCatalog;
    
    public void newContract(ContractApplication contract) {
        HashMap<String, Object> contractObj = new HashMap<>(){
            {
                put("aptNum", contract.aptNum);
                put("propName", contract.propName);
                put("date", contract.date);
                put("street", contract.street);
                put("community", contract.community);
                put("city", contract.city);
                put("state", contract.state);
                put("images", contract.images);
                put("type", contract.type);
                put("roomCount", contract.roomCount);
                put("bathCount", contract.bathCount);
                put("features", contract.features);
                put("availability", contract.availability);
                put("utilities", contract.utilities);
                put("managementCompany", contract.managementCompany);
                put("status", "pending");
                put("appOwner", "utility");
            }
        };
        
        DatabaseUtils.createNewContract(contractObj);
    }
    
    public List<ContractApplication> getContractApplications() {
        
        return contractApplicationCatalog;
    }
    
    public List<ContractApplication> getContracts(int id) {
        ArrayList<HashMap<String, Object>> results = DatabaseUtils.getContractApplications(id);
        
//        for(HashMap<String, Object> result : results) {
//            contractApplicationCatalog.add(new ContractApplication(
//                result.get("aptNUm"), 
//                result.get("propName"), 
//                result.get("propName")conDate, 
//                result.get("propName")street, 
//                result.get("propName")community, 
//                result.get("propName")city, 
//                result.get("propName")state, 
//                result.get("propName")aptType, 
//                result.get("propName")roomCount, 
//                result.get("propName")bathCount,
//                result.get("propName")features,
//                result.get("propName")sqft,
//                result.get("propName")availability,
//                result.get("propName")utilities, 
//                result.get("propName")filePaths,
//                "management company",
//                0,
//                0,
//                0
//            ));
//        }
        
        return contractApplicationCatalog;
    }
}
