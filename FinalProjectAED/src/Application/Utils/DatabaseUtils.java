/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

import static Application.Utils.AppSystem.currentUid;
import Business.Apartment.Apartment;
import Business.Apartment.ApartmentDirectory;
import Business.ContractApplication.ContractApplication;
import Business.FinanceCompanyPackage.FinanceCompany;
import Business.FinanceCompanyPackage.FinanceCompanyDirectory;
import Business.LegalCompany.LegalCompany;
import Business.LegalCompany.LegalCompanyDirectory;
import Business.ManagementCompanyPackage.ManagementCompany;
import Business.ManagementCompanyPackage.ManagementCompanyDirectory;
import Business.FinanceCompanyPackage.FinanceCompanyDirectory;
import Business.FinanceCompanyPackage.FinanceCompany;
import Business.LegalCompany.LegalCompany;
import Business.LegalCompany.LegalCompanyDirectory;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.Request.UserRequest;
import Business.Request.UserRequestDirectory;
import Business.Users.ManagementCompanyEmployeeDirectory;
import Business.Users.ManagementCompanyEmployee;
import Business.UtilityCompany.ElectricityCompany;
import Business.UtilityCompany.ElectricityCompanyDirectory;
import Business.UtilityCompany.GasCompany;
import Business.UtilityCompany.GasCompanyDirectory;
import Business.UtilityCompany.WaterCompany;
import Business.UtilityCompany.WaterCompanyDirectory;
import Business.Users.Person;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ankitlall
 */
public class DatabaseUtils {
    
    public static Connection getConnection(){
        try{
            Connection conn;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://aeddatabase.cvxm5l9d0hm0.us-east-1.rds.amazonaws.com:3306/aedfinalproject", "admin", "password");
            return conn;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    
    public static int createNewUser(String userRole, String name, LocalDate date, String gender, String email, long phNum, String password, String street, String comm, String city, String state){
        int id=0;
        try{

            Connection conn= getConnection();
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO `aedfinalproject`.`user_table` (`UserRole`, `Name`, `DOB`, `Gender`, `Email`, `PhoneNumber`, `Password` , `Street` , `Community` , `City` , `State`) "
                    + "VALUES ('" + userRole + "','" + name + "','" + date + "','" + gender + "','" + email + "','" 
                    + phNum
                    + "','" + password+ "','" + street+ "','" + comm+ "','" + city+ "','" + state+ "')", st.RETURN_GENERATED_KEYS);
            
            ResultSet rs=st.getGeneratedKeys();
            if(rs.next()){
                id=rs.getInt(1);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return id;
    }
    
    public static void addCompanyUsers(int companyId, String companyType, int uId) {                    
        try{

            Connection conn= getConnection();
            Statement st = conn.createStatement();
            String query="UPDATE aedfinalproject.user_table SET "+
                                                    " company_id="+ companyId + 
                                                    " ,company_type="+"'"+companyType+"'"+ " WHERE Uid="+uId;
            st.executeUpdate(query);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static boolean loginUser(String email, String password){
        
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://aeddatabase.cvxm5l9d0hm0.us-east-1.rds.amazonaws.com:3306/aedfinalproject", "admin", "password");
            
             Statement sta = connection.createStatement();
             String query = "select * from user_table where Email='"+email+"'and Password = '"+password+"'";
             ResultSet rs = sta.executeQuery(query);
             if(rs.next()){
               AppSystem.setCurrentUserRole(rs.getString("UserRole"));
               AppSystem.setCurrentUid(rs.getInt("Uid"));
               return true;
             }else{
                return false;
             }
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    
    
    
    
    public static void createNewContract(HashMap<String, Object> contract) {
        try {
            Connection dbConn = getConnection();
            Statement stmt = dbConn.createStatement();
            
            String query = "INSERT INTO contract_application (apt_id, prop_id, elec_comp_id, water_comp_id, gas_comp_id, fin_comp_id, legal_comp_id, prop_name, start_date, street, community, city, state, prop_images, apt_type, room_count, bath_count, features, avl_date, utilities, mgt_comp_id, app_status, sqft, app_owner_type, app_owner)"
                    + " values(" + contract.get("aptId") + 
                    "," + contract.get("propId") + 
                    "," + contract.get("elecCompId") + 
                    "," + contract.get("waterCompId") + 
                    "," + contract.get("gasCompId") + 
                    "," + contract.get("finId") + 
                    "," + contract.get("legalId") + 
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
                    "','" + contract.get("mgtCompanyId") + 
                    "','" + contract.get("status") +
                    "','" + contract.get("sqft") +
                    "','" + contract.get("appOwnerType") +
                    "','" + contract.get("appOwner") + "')";
            int x = stmt.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(new JButton(), "This contract application alredy exist");
            } else {
                JOptionPane.showMessageDialog(new JButton(),"New contract application created");
            }
//            dbConn.close();
        } catch(Exception exception) {
            System.out.println(exception);
        }
    }
    
    public static ArrayList<ContractApplication> getContractApplications(int id, String col) {
        ArrayList<ContractApplication> contracts = new ArrayList<>();
        try {
            Connection dbConn = getConnection();
            Statement stmt = dbConn.createStatement();
            String query = "SELECT * FROM aedfinalproject.contract_application where "+col+"="+id;
            System.out.println(query);
            ResultSet res = stmt.executeQuery(query);            
            while(res.next()) {
                ContractApplication contract = new ContractApplication(
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
                    res.getInt("apt_Id"),
                    res.getInt("prop_id"),
                    res.getInt("mgt_comp_id"),
                    res.getString("app_status"),
                    res.getString("app_owner"),
                        res.getString("app_owner_type"),
                    res.getInt("app_id"),
                    res.getInt("elec_comp_id"),
                    res.getInt("water_comp_id"),
                    res.getInt("gas_comp_id"),
                    res.getInt("fin_comp_id"),
                    res.getInt("legal_comp_id")
                );
                
                contract.setElecAccNum(res.getLong("elec_acc_num"));
                String elecBillingDate = res.getString("elec_bill_date");
                contract.setElecBillingDate(elecBillingDate);
                contract.setElecContactNum(res.getLong("elec_contact"));
                
                contract.setWaterAccNum(res.getLong("water_acc_num"));
                String waterBillingDate = res.getString("water_bill_date");
                contract.setWaterBillingDate(waterBillingDate);
                contract.setWaterContactNum(res.getLong("water_contact"));
                
                contract.setGasAccNum(res.getLong("gas_acc_num"));
                String gasBillingDate =res.getString("gas_bill_date");
                contract.setGasBillingDate(gasBillingDate);
                contract.setGasContactNum(res.getLong("gas_contact"));
                
                contract.setLeaseCost(res.getInt("fin_lease_cost"));
                String aptBillingDate = res.getString("fin_bill_date");
                contract.setAptBillingDate(gasBillingDate);
                contract.setMaintanenceCost(res.getInt("fin_maint_cost"));
                contract.setUtilitiesCost(res.getInt("fin_utility_cost"));
                contract.setDeposit(res.getInt("fin_comp_deposit"));
                
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
            Connection conn= getConnection();
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
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            ResultSet aptRs = st.executeQuery("SELECT * FROM aedfinalproject.apartment_details");
            
            PropertyDirectory propList = getPropListFromDB();
            
            while (aptRs.next()){
                Apartment apt= aptListFromDB.addNewProfile();
                apt.setAptId(aptRs.getInt(1));
                apt.setTenantId(aptRs.getInt(2));
                apt.setIsLeased(aptRs.getBoolean(3));
                apt.setAptPropId(aptRs.getInt(4));
                                
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
    
    public static ManagementCompanyDirectory getMgmtListFromDB(){
        
        try{
            ManagementCompanyDirectory mgmtListFromDB = new ManagementCompanyDirectory();
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            ResultSet mgmtRs = st.executeQuery("SELECT * FROM aedfinalproject.management_companies");
            
            while (mgmtRs.next()){
                ManagementCompany mgmt = mgmtListFromDB.addNewProfile();
                mgmt.setMgmtId(mgmtRs.getInt(1));
                mgmt.setMgmtName(mgmtRs.getString(2));
                mgmt.setCity(mgmtRs.getString(3));
                mgmt.setState(mgmtRs.getString(4));
            }
            return mgmtListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static UserRequestDirectory getRequestListFromDB(){
        
        try{
            UserRequestDirectory reqListFromDB = new UserRequestDirectory();
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            ResultSet reqRs = st.executeQuery("SELECT * FROM aedfinalproject.user_application_request WHERE User_Id = " + currentUid );
            
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
                req.setUserId(reqRs.getInt(8));
            }
            return reqListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static UserRequestDirectory getMgmtRequestListFromDB(){
        
        try{
            UserRequestDirectory reqMgmtListFromDB = new UserRequestDirectory();
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            int mgmtID= getCompanyId(currentUid);
            ResultSet reqRs = st.executeQuery("SELECT * FROM aedfinalproject.user_application_request WHERE Mgmt_Comp_Id = " + mgmtID );
            
            SimpleDateFormat dFormatView = new SimpleDateFormat("yyyy-MM-dd");
            
            while (reqRs.next()){
                UserRequest req = reqMgmtListFromDB.addNewProfile();
                req.setRequestId(reqRs.getInt(1));
                req.setPropId(reqRs.getInt(2));
                req.setAptId(reqRs.getInt(3));
                req.setMgmtId(reqRs.getInt(4));
                req.setRequestType(reqRs.getString(5));
                req.setStatus(reqRs.getString(6));
                req.setLastMdfdDate(dFormatView.format(reqRs.getDate(7)));
                req.setUserId(reqRs.getInt(8));
            }
            return reqMgmtListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static HashMap<String, Integer> getUtilityCompIds(int propId) {
        HashMap<String, Integer> result = new HashMap<>();
        try {
            Connection dbConn =getConnection();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT * FROM aedfinalproject.property_details where prop_id="+propId;
            ResultSet res = stmt.executeQuery(query);
            while(res.next()) {
                result.put("elecCompId", res.getInt("elec_comp_id"));
                result.put("waterCompId", res.getInt("water_comp_id"));
                result.put("gasCompId", res.getInt("gas_comp_id"));
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        
        return result;
    }
    
    public static HashMap<String, Integer> getPropInfo(int mgtEmpId) {
        HashMap<String, Integer> result = new HashMap<>();
        try {
            Connection dbConn = getConnection();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT * FROM aedfinalproject.property_details where mgt_broker_id="+mgtEmpId;
            ResultSet res = stmt.executeQuery(query);
            while(res.next()) {
                result.put(res.getString("prop_names"),res.getInt("prop_id"));
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        
        return result;
    }
    
    public static GasCompanyDirectory getGasListFromDB(){
        
        try{
            GasCompanyDirectory gasListFromDB = new GasCompanyDirectory();
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            ResultSet gasRs = st.executeQuery("SELECT * FROM aedfinalproject.gas_companies");
            
            while (gasRs.next()){
                GasCompany gas= gasListFromDB.addNewProfile();
                gas.setGasId(gasRs.getInt(1));
                gas.setGasName(gasRs.getString(2));
                gas.setGasCity(gasRs.getString(3));
                gas.setGasState(gasRs.getString(4));
            }
            return gasListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    } 
    
    public static WaterCompanyDirectory getWaterListFromDB(){
        
        try{
            WaterCompanyDirectory waterListFromDB = new WaterCompanyDirectory();
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            ResultSet waterRs = st.executeQuery("SELECT * FROM aedfinalproject.water_companies");
            
            while (waterRs.next()){
                WaterCompany water= waterListFromDB.addNewProfile();
                water.setWaterId(waterRs.getInt(1));
                water.setWaterName(waterRs.getString(2));
                water.setWaterCity(waterRs.getString(3));
                water.setWaterState(waterRs.getString(4));
            }
            return waterListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static ElectricityCompanyDirectory getElecListFromDB(){
        
        try{
            ElectricityCompanyDirectory elecListFromDB = new ElectricityCompanyDirectory();
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            ResultSet elecRs = st.executeQuery("SELECT * FROM aedfinalproject.electricity_companies");
            
            while (elecRs.next()){
                ElectricityCompany elec= elecListFromDB.addNewProfile();
                elec.setElectricityId(elecRs.getInt(1));
                elec.setElectricityName(elecRs.getString(2));
                elec.setElectricityCity(elecRs.getString(3));
                elec.setElectricityState(elecRs.getString(4));
            }
            return elecListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static FinanceCompanyDirectory getFinanceListFromDB(){
        
        try{
            FinanceCompanyDirectory financeListFromDB = new FinanceCompanyDirectory();
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            ResultSet finRs = st.executeQuery("SELECT * FROM aedfinalproject.fin_companies");
            
            while (finRs.next()){
                FinanceCompany finance = financeListFromDB.addNewProfile();
                finance.setFinanceId(finRs.getInt(1));
                finance.setFinanceName(finRs.getString(2));
                finance.setFinanceCity(finRs.getString(3));
                finance.setFinanceState(finRs.getString(4));
            }
            return financeListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static LegalCompanyDirectory getLegalListFromDB(){
        
        try{
            LegalCompanyDirectory legalListFromDB = new LegalCompanyDirectory();
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            ResultSet legalRs = st.executeQuery("SELECT * FROM aedfinalproject.legal_companies");
            
            while (legalRs.next()){
                LegalCompany legal= legalListFromDB.addNewProfile();
                legal.setLegalId(legalRs.getInt(1));
                legal.setLegalName(legalRs.getString(2));
                legal.setLegalCity(legalRs.getString(3));
                legal.setLegalState(legalRs.getString(4));
            }
            return legalListFromDB;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static void updateContractElec(ContractApplication contract) {
        try{
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            String query="UPDATE aedfinalproject.contract_application SET elec_acc_num= "+contract.getElecAccNum() +
                                                    " ,elec_bill_date="+ "'"+contract.getElecBillingDate()+"'" + 
                                                    " ,elec_contact="+ contract.getElecContactNum()+ ",app_owner='water' WHERE app_id="+contract.getAppId();
            int x = st.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(new JButton(), "Incorrect Id");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void updateContractWater(ContractApplication contract) {
        try{
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            String query="UPDATE aedfinalproject.contract_application SET water_acc_num= "+contract.getWaterAccNum()+
                                                    " ,water_bill_date="+ "'"+contract.getWaterBillingDate()+"'" + 
                                                    " ,water_contact="+ contract.getWaterContactNum()+ ",app_owner='gas' WHERE app_id="+contract.getAppId();
            int x = st.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(new JButton(), "Incorrect Id");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void updateContractGas(ContractApplication contract) {
        try{
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            String query="UPDATE aedfinalproject.contract_application SET gas_acc_num= "+contract.getGasAccNum()+
                                                    " ,gas_bill_date="+ "'"+contract.getGasBillingDate()+"'" + 
                                                    " ,gas_contact="+ contract.getGasContactNum()+ ",app_owner='finance' WHERE app_id="+contract.getAppId();
            int x = st.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(new JButton(), "Incorrect Id");
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void updateContractFinance(ContractApplication contract) {
        try{
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            String query="UPDATE aedfinalproject.contract_application SET fin_lease_cost= "+contract.getLeaseCost()+
                                                    " ,fin_bill_date="+ "'"+contract.getAptBillingDate()+"'" + 
                                                    " ,fin_utility_cost="+ "'"+contract.getUtilitiesCost()+"'" +
                                                    " ,fin_comp_deposit="+ "'"+contract.getDeposit()+"'" +
                                                    " ,fin_maint_cost="+ contract.getMaintanenceCost()+ ",app_owner='legal' WHERE app_id="+contract.getAppId();
            int x = st.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(new JButton(), "Incorrect Id");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void updateContractLegal(ContractApplication contract) {
        try{
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            String query="UPDATE aedfinalproject.contract_application SET fin_lease_cost= "+contract.getLeaseCost()+
                                                    " ,lease_end_date="+ "'"+contract.getLeaseEndDate()+"'" + 
                                                    ",app_status='approved', app_owner='management' WHERE app_id="+contract.getAppId();
            int x = st.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(new JButton(), "Incorrect Id");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void createNewApartment(int aptId, int propId) {
        try{
            Connection conn= getConnection();
            Statement st = conn.createStatement();
            String query = "INSERT INTO apartment_details values(" + aptId + 
                    ",null" +   
                    "," + 0 + 
                    "," + propId + ")";
            int x = st.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(new JButton(), "This contract application alredy exist");
            } else {
                JOptionPane.showMessageDialog(new JButton(),"New contract application created");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static FinanceCompanyDirectory getFinComps() {
        FinanceCompanyDirectory finDir = new FinanceCompanyDirectory();
        try {
            Connection dbConn = getConnection();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT * FROM aedfinalproject.fin_companies";
            ResultSet res = stmt.executeQuery(query);
            while(res.next()) {
                FinanceCompany finComp = new FinanceCompany(res.getString("fin_name"));
                finComp.setFinId(res.getInt("fin_id"));
                finDir.addNewCompanyToList(finComp);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        
        return finDir;
    }
    
    public static LegalCompanyDirectory getLegalComps() {
        LegalCompanyDirectory legalDir = new LegalCompanyDirectory();
        try {
            Connection dbConn = getConnection();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT * FROM aedfinalproject.legal_companies";
            ResultSet res = stmt.executeQuery(query);
            while(res.next()) {
                LegalCompany legalComp = new LegalCompany(res.getString("legal_comp_name"));
                legalComp.setLegalId(res.getInt("legal_comp_id"));
                legalDir.addNewCompanyToList(legalComp);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        
        return legalDir;
    }
    
    public static ArrayList<HashMap<String, Object>> getAdminUsers() {
        ArrayList<HashMap<String, Object>> result = new ArrayList<HashMap<String, Object>>();
        try {
            Connection dbConn = getConnection();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT * FROM aedfinalproject.user_table where UserRole <> 'consumer'";
            ResultSet res = stmt.executeQuery(query);
            while(res.next()) {
                HashMap<String, Object> obj = new HashMap<String, Object>();
                obj.put("userId", res.getInt("Uid"));
                obj.put("name", res.getString("Name"));
                obj.put("role", res.getString("UserRole"));
                
                result.add(obj);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        
        return result;
    }
    
    public static ArrayList<HashMap<String, Object>> getMgtEmps() {
        ArrayList<HashMap<String, Object>> result = new ArrayList<HashMap<String, Object>>();
        try {
            Connection dbConn = getConnection();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT * FROM aedfinalproject.user_table where UserRole = 'mgtEmployee'";
            ResultSet res = stmt.executeQuery(query);
            while(res.next()) {
                HashMap<String, Object> obj = new HashMap<String, Object>();
                obj.put("userId", res.getInt("Uid"));
                obj.put("name", res.getString("Name"));
                
                result.add(obj);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        
        return result;
    }
    
    public static int getCompanyId(int id) {
        int result = 0;
        try {
            Connection dbConn = getConnection();
            Statement stmt = dbConn.createStatement();
            String query ="SELECT * FROM aedfinalproject.user_table where Uid="+id;
            ResultSet res = stmt.executeQuery(query);
            while(res.next()) {
                
                result=res.getInt("company_id");
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        
        return result;
    }
    
    public static void updateCompany(String tableName, int id, String name, String city, String state, String idLabel, String nameLabel,String cityLabel,String stateLabel) {                    
        try{

            Connection conn= getConnection();
            Statement st = conn.createStatement();
            String query="UPDATE aedfinalproject."+tableName+ " SET "+
                                                    idLabel+"="+ id + 
                                                    " ,"+nameLabel+"="+"'"+name+"'"+
                                                    " ,"+cityLabel+"="+"'"+city+"'"+
                                                    " ,"+stateLabel+"="+"'"+state+"'"+
                                                    " WHERE "+idLabel+"="+id;
            st.executeUpdate(query);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void deleteCompany(String tableName, int id,  String idLabel) {                    
        try{

            Connection conn= getConnection();
            Statement st = conn.createStatement();
            String query="DELETE from aedfinalproject."+tableName+" WHERE "+idLabel+"="+id;
            st.executeUpdate(query);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
