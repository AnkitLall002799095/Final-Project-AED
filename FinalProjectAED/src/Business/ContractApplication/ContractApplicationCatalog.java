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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

/**
 *
 * @author ankitlall
 */
public class ContractApplicationCatalog {
    
    ArrayList<ContractApplication> contractApplicationCatalog;
    
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
    
    public void getContracts(int id) {
        contractApplicationCatalog = DatabaseUtils.getContractApplications(id);
    }
    
    public ArrayList<ContractApplication> getContractApplicationCatalog() {
        return contractApplicationCatalog;
    }
}
