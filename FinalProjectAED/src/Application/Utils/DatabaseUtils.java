/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

import Business.ContractApplication.ContractApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
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
    
    public static ArrayList<HashMap<String, Object>> getContractApplications(int id) {
        ArrayList<HashMap<String, Object>> results = new ArrayList<>();
        try {
            Connection dbConn = (Connection) DriverManager.getConnection("jdbc:mysql://aeddatabase.cvxm5l9d0hm0.us-east-1.rds.amazonaws.com:3306/aedfinalproject", "admin", "password");
            Statement stmt = dbConn.createStatement();
            String query = "SELECT * FROM aedfinalproject.contract_application where mgt_comp_id="+id;
            ResultSet res = stmt.executeQuery(query);            
            while(res.next()) {
                 HashMap<String, Object> result = new HashMap<>(){
                     {                         
                        put("aptId", res.getInt("app_id"));
                        put("aptNum", res.getInt("apt_num"));
                        put("propId", res.getString("prop_id"));
                        put("propName", res.getString("prop_name"));
                        put("date", Helper.getDate(res.getString("start_date")));
                        put("street", res.getString("street"));
                        put("community", res.getString("community"));
                        put("city", res.getString("city"));
                        put("state", res.getString("state"));
                        put("images", Helper.convertStringToArr(res.getString("prop_images")));
                        put("type", res.getString("apt_type"));
                        put("roomCount", res.getInt("room_count"));
                        put("bathCount", res.getInt("bath_count"));
                        put("features", Helper.convertStringToArr(res.getString("features")));
                        put("availability", Helper.getDate(res.getString("avl_date")));
                        put("utilities", Helper.convertStringToArr(res.getString("utilities")));
                        put("managementCompanyId", res.getString("mgt_comp_id"));
                        put("managementCompany", res.getString("mgt_comp"));
                        put("status", res.getString("app_status"));
                        put("appOwner", res.getString("app_owner"));
                     }
                 };
                 
                 results.add(result);
            }              
        }catch(Exception exception) {
            System.out.println(exception);
        }
        
        return results;
    }
}
