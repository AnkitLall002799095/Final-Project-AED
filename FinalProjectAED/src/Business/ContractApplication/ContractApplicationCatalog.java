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
                put("aptId", contract.getAptId());
                put("propId", contract.getPropId());
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
                put("mgtCompanyId", contract.getManagementCompanyId());
                put("status", "pending");
                put("appOwner", "electricity");
                put("sqft", contract.getSqft());
                put("appOwnerType", "utility");
                put("elecCompId", contract.getElecCompId());
                put("waterCompId", contract.getWaterCompId());
                put("gasCompId", contract.getGasCompId());
                put("finId", contract.getFinCompId());
                put("legalId", contract.getLegalCompId());
            }
        };
        
        DatabaseUtils.createNewContract(contractObj);
    }
    
    public void getContracts(int id, String col) {
        contractApplicationCatalog = DatabaseUtils.getContractApplications(id, col);
    }
    
    public ArrayList<ContractApplication> getContractApplicationCatalog() {
        return contractApplicationCatalog;
    }
}
