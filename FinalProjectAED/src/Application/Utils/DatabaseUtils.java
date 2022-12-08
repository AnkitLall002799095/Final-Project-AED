/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

import Business.ContractApplication.ContractApplication;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ankitlall
 */
public class DatabaseUtils {
    
    public static void createNewContract(HashMap<String, Object> contract) {
        try {
            Connection dbConn = (Connection) DriverManager.getConnection("jdbc:mysql://aeddatabase.cvxm5l9d0hm0.us-east-1.rds.amazonaws.com:3306/aedfinalproject", "admin", "password");
            Statement stmt = dbConn.createStatement();
            
            String query = "INSERT INTO contract_application values(Null," + contract.get("aptNum") + 
                    ",'" + contract.get("propName") + 
                    "','" + contract.get("date") + 
                    "','" + contract.get("street") + 
                    "','" + contract.get("community") + 
                    "','" + contract.get("city") + 
                    "','" + contract.get("state") + 
                    "','" + contract.get("images") + 
                    "','" + contract.get("type") + 
                    "'," + contract.get("roomCount") +
                    "," + contract.get("bathCount") +
                    ",'" + contract.get("features") + 
                    "','" + contract.get("availability") + 
                    "','" + contract.get("utilities") + 
                    "','" + contract.get("managementCompany") + 
                    "','" + contract.get("status") + 
                    "','" + contract.get("appOwner") + "')";
            int x = stmt.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(new JButton(), "This contract application alredy exist");
            } else {
                JOptionPane.showMessageDialog(new JButton(),"New contract application created");
            }
            dbConn.close();
        } catch(Exception exception) {
            System.out.println(exception);
        }
    }
    
    public static ArrayList<ContractApplication> getContractApplications(int id) {
        ArrayList<ContractApplication> contracts = new ArrayList<>();
        try {
            Connection dbConn = (Connection) DriverManager.getConnection("jdbc:mysql://aeddatabase.cvxm5l9d0hm0.us-east-1.rds.amazonaws.com:3306/aedfinalproject", "admin", "password");
            Statement stmt = dbConn.createStatement();
            String query = "SELECT * FROM aedfinalproject.contract_application where mgt_comp_id="+id;
            ResultSet res = stmt.executeQuery(query);            
            while(res.next()) {
                ContractApplication contract = new ContractApplication(
                    res.getInt("apt_num"), 
                    res.getString("prop_name"), 
                    Helper.getDate(res.getString("start_date")), 
                    res.getString("street"), 
                    res.getString("community"), 
                    res.getString("city"), 
                    res.getString("state"), 
                    res.getString("apt_type"), 
                    res.getInt("room_count"), 
                    res.getInt("bath_count"),
                    Helper.convertStringToArr(res.getString("features")),
                    res.getDouble("sqft"),
                    Helper.getDate(res.getString("avl_date")),
                    Helper.convertStringToArr(res.getString("utilities")), 
                    Helper.convertStringToArr(res.getString("prop_images")),
                    res.getString("mgt_comp"),
                    res.getInt("app_id"),
                    res.getInt("prop_id"),
                    res.getInt("mgt_comp_id"),
                    res.getString("app_status"),
                    res.getString("app_owner"),
                    res.getInt("app_id")
                );
                 
                 contracts.add(contract);
            }              
        }catch(Exception exception) {
            System.out.println(exception);
        }
        
        return contracts;
    }
}
