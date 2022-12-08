/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

import Business.Apartment.Apartment;
import Business.Apartment.ApartmentDirectory;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.Request.UserRequest;
import Business.Request.UserRequestDirectory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import org.apache.commons.io.FileUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class Helper {
    
    public static String[] fileTypesAllowed = {"png", "jpg"};
    
//    public static void copyFile(File sourceFile, File destFile) {
    public static String copyFile(String filePath) {
        String relFilePath = "";
        try{
            //absolute path for source file to be copied
            String source = filePath;
            //directory where file will be copied
            String target ="./assets/";

            //name of source file
            File sourceFile = new File(source);
            String name = sourceFile.getName();

            File targetFile = new File(target+name);
            System.out.println("Copying file : " + sourceFile.getName() +" from Java Program");

            //copy file from one location to other
            FileUtils.copyFile(sourceFile, targetFile);

            System.out.println("copying of file from Java program is completed"); 
            relFilePath = target.concat(sourceFile.getName());
        } catch(IOException e) {
            System.out.println(e);
        }
        
        return relFilePath;
    }
    
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
            
            PropertyDirectory propList = Helper.getPropListFromDB();
            
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
    public static String validateInput(String value, String type) {   
        String msg = "";
    	switch(type) {
    		// First & last Name
    		case "name":
    			if(value.length() < 3 || value.length() > 30) {
    				msg="This field must contain 3-30 letters.";
    			}
    			
    			if(!value.matches("^[a-zA-Z \\-\\.\\']*$")) {
    				msg="This field must only contain letters (a-z).";
    			}
    			
    			break;
    		//  Age
    		case "age":
    			if(!value.matches("[0-9]+")) {
    				msg="This field must only contain digits (0-9).";
    				break;
    			}
    			
    			if(value.length() > 3 || (Integer.parseInt(value) < 18 || Integer.parseInt(value) > 80)) {
    				msg="Age must be in the range of 18-80.";
    			}
    			break;
    		// Phone number
    		case "phNum":
    			if(!value.matches("[0-9]+")) {
    				msg="Phone Number field must only contain digits (0-9).";
    			}
    			
    			if(value.length() != 10) {
    				msg="Phone Number must have 10 digits.";
    			}
    			break;
    		// Email
    		case "email":   
    			String regex = "^(.+)@(.+)$";
    			 
    			Pattern pattern = Pattern.compile(regex);
    			Matcher matcher = pattern.matcher(value);
    			if(!matcher.matches()) {
    				msg="Incorrect email address.";
    			}
    			
    			break;
    		// Password
    		case "password":   
    			if(value.length() < 8 && value.length() > 30) {
    				msg="Password must be 8 characters long.";
    			}
    			
    			if(!value.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,30}$")) {
    				msg="Password field must only contain at least 1 digit, atleast one upper case letter and atleast one special character.";
    			}
    			
    			break;
    		case "image":
    			if(value == "No file selected") {
    				msg="Profile picture not selected.";
    			}
    			if(!Arrays.asList(fileTypesAllowed).contains(new File(value).toString().substring(new File(value).toString().lastIndexOf('.') + 1))) {
    				msg="Profile picture must be png, jpg format.";	
    			}
                case "aptNum":
                case "roomCount":
                case "bathCount":
                        if(!value.matches("[0-9]+")) {
    				msg="This field must only contain digits (0-9).";
    				break;
    			}
                case "propName":
                case "street":
                case "state":
                case "city":
                case "community":  
                case "aptType":
                        if(value.length() < 3 || value.length() > 40) {
    				msg="Street field must contain 10-30 letters.";
    			}
    			
    			if(!value.matches("^[a-zA-Z[0-9] \\-\\.\\,\\']*$")) {
    				msg="Street field must only contain letters (a-z) & some special characters.";
    			}
                        break;
                
    		default: 
    			System.out.println("Unmatched param: " + value);
    	}
        
        return msg;
    }
    
    public static ArrayList<String> convertStringToArr(String str) {
        String str1 = str.replace("[","");
        String str2 = str1.replace("]","");
        return new ArrayList<String>(Arrays.asList(str2.split(",")));
    }
    
        // Function to convert day, month, year values to Date Object.
    public static LocalDate getDate(String date) {
    	
//    	String dateInString = day+"-"+month+"-"+year;
//    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMMM-yyyy", Locale.ENGLISH);
//    	LocalDate date = LocalDate.parse(dateInString, formatter);
//    	String d = getFormattedDate(date);
    	return LocalDate.now();
    }
    
        // Convert date object to formatted string. 
    public static String getFormattedDate(LocalDate date) {
    	return date.format(DateTimeFormatter.ofPattern("d-MMMM-yy"));
    }
    
}
