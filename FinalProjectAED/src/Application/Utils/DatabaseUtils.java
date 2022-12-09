/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

import Business.Apartment.Apartment;
import Business.Apartment.ApartmentDirectory;
import Business.ContractApplication.ContractApplication;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.Request.UserRequest;
import Business.Request.UserRequestDirectory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
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
    
    public static ArrayList<ContractApplication> getContractApplications(int id, String col) {
        ArrayList<ContractApplication> contracts = new ArrayList<>();
        try {
            Connection dbConn = (Connection) DriverManager.getConnection("jdbc:mysql://aeddatabase.cvxm5l9d0hm0.us-east-1.rds.amazonaws.com:3306/aedfinalproject", "admin", "password");
            Statement stmt = dbConn.createStatement();
            String query = "SELECT * FROM aedfinalproject.contract_application where "+col+"="+id;
            ResultSet res = stmt.executeQuery(query);            
            while(res.next()) {
                ContractApplication contract = new ContractApplication(
                    res.getInt("apt_num"), 
                    res.getString("prop_name"), 
                    res.getDate("start_date").toLocalDate(), 
                    res.getString("street"), 
                    res.getString("community"), 
                    res.getString("city"), 
                    res.getString("state"), 
                    res.getString("apt_type"), 
                    res.getInt("room_count"), 
                    res.getInt("bath_count"),
                    Helper.convertStringToArr(res.getString("features")),
                    res.getDouble("sqft"),
                    res.getDate("avl_date").toLocalDate(),
                    Helper.convertStringToArr(res.getString("utilities")), 
                    Helper.convertStringToArr(res.getString("prop_images")),
                    res.getString("mgt_comp"),
                    res.getInt("app_id"),
                    res.getInt("prop_id"),
                    res.getInt("mgt_comp_id"),
                    res.getString("app_status"),
                    res.getString("app_owner"),
                        res.getString("app_owner_type"),
                    res.getInt("app_id"),
                    res.getInt("elec_comp_id"),
                    res.getInt("water_comp_id"),
                    res.getInt("gas_comp_id")
                );
                 
                 contracts.add(contract);
            }              
        }catch(Exception exception) {
            System.out.println(exception);
        }
        
        return contracts;
    }
    
        public static PropertyDirectory getPropListFromDB(){
        
        try{
            PropertyDirectory propListFromDB = new PropertyDirectory();
            Connection conn= Helper.getConnection();
            Statement st = conn.createStatement();
            ResultSet propRs = st.executeQuery("SELECT * FROM aedfinalproject.property_details");
            
            while (propRs.next()){
                Property prop= propListFromDB.addNewProfile();
                prop.setPropId(propRs.getInt(1));
                prop.setOwnerId(propRs.getInt(2));
                prop.setMgtComp(propRs.getInt(3));
                prop.setMgtBroker(propRs.getInt(4));
                prop.setStreet(propRs.getString(5));
                prop.setCommunity(propRs.getString(6));
                prop.setCity(propRs.getString(7));
                prop.setState(propRs.getString(8));
                prop.setPropName(propRs.getString(9));
            }
            return propListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }   
    
    public static ApartmentDirectory getAptListFromDB(){
        
        try{
            ApartmentDirectory aptListFromDB = new ApartmentDirectory();
            Connection conn= Helper.getConnection();
            Statement st = conn.createStatement();
            ResultSet aptRs = st.executeQuery("SELECT * FROM aedfinalproject.apartment_details");
            
            PropertyDirectory propList = DatabaseUtils.getPropListFromDB();
            
            while (aptRs.next()){
                Apartment apt= aptListFromDB.addNewProfile();
                apt.setAptId(aptRs.getInt(1));
                apt.setTenantId(aptRs.getInt(2));
                apt.setSize(aptRs.getInt(3));
                apt.setBedroom(aptRs.getInt(4));
                apt.setBathroom(aptRs.getInt(5));
                apt.setType(aptRs.getString(6));
                apt.setAvlblDate(aptRs.getDate(7));
                apt.setRent(aptRs.getInt(8));
                apt.setDetails(aptRs.getString(9));
                apt.setLattitude(aptRs.getString(10));
                apt.setLongitude(aptRs.getString(11));
                apt.setIsLeased(aptRs.getBoolean(12));
                apt.setAptPropId(aptRs.getInt(13));
                
                for (Property p : propList.getPropList()){
                    if (p.getPropId()==apt.getAptPropId())
                        apt.setProp(p);
                }
                
            }
            return aptListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static UserRequestDirectory getRequestListFromDB(){
        
        try{
            UserRequestDirectory reqListFromDB = new UserRequestDirectory();
            Connection conn= Helper.getConnection();
            Statement st = conn.createStatement();
            ResultSet reqRs = st.executeQuery("SELECT * FROM aedfinalproject.user_application_request");
            
            SimpleDateFormat dFormatView = new SimpleDateFormat("yyyy-MM-dd");
            
            while (reqRs.next()){
                UserRequest req = reqListFromDB.addNewProfile();
                req.setRequestId(reqRs.getInt(1));
                req.setPropId(reqRs.getInt(2));
                req.setAptId(reqRs.getInt(3));
                req.setMgmtId(reqRs.getInt(4));
                req.setRequestType(reqRs.getString(5));
                req.setStatus(reqRs.getString(6));
                req.setLastMdfdDate(dFormatView.format(reqRs.getDate(7)));
                
            }
            return reqListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static HashMap<String, Integer> getUtilityCompIds(int propId) {
        HashMap<String, Integer> result = new HashMap<>();
        try {
            Connection dbConn = (Connection) DriverManager.getConnection("jdbc:mysql://aeddatabase.cvxm5l9d0hm0.us-east-1.rds.amazonaws.com:3306/aedfinalproject", "admin", "password");
            Statement stmt = dbConn.createStatement();
            String query ="SELECT * FROM aedfinalproject.property_details where prop_id="+propId;
            ResultSet res = stmt.executeQuery(query);
            result.put("elecCompId", res.getInt("elec_comp_id"));
            result.put("waterCompId", res.getInt("water_comp_id"));
            result.put("gasCompId", res.getInt("gas_comp_id"));
        }catch(Exception e) {
            System.out.println(e);
        }
        
        return result;
    }
    
    public static HashMap<String, Integer> getPropInfo(int mgtId) {
        HashMap<String, Integer> result = new HashMap<>();
        try {
            Connection dbConn = (Connection) DriverManager.getConnection("jdbc:mysql://aeddatabase.cvxm5l9d0hm0.us-east-1.rds.amazonaws.com:3306/aedfinalproject", "admin", "password");
            Statement stmt = dbConn.createStatement();
            String query ="SELECT * FROM aedfinalproject.property_details where mgt_comp_id="+mgtId;
            ResultSet res = stmt.executeQuery(query);
            while(res.next()) {
                result.put(res.getString("prop_names"),res.getInt("prop_id"));
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        
        return result;
    }
    
}
