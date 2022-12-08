/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

import Business.Apartment.Apartment;
import Business.Apartment.ApartmentDirectory;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
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
import java.util.ArrayList;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class Helper {
        
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
    
}
