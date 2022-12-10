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
//import org.apache.commons.io.FileUtils;
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
import java.util.Date;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class Helper {
    
    public static String[] fileTypesAllowed = {"png", "jpg"};
    
   // public static void copyFile(File sourceFile, File destFile) {
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
    
    
     
    public static String validateInput(String value, String type) {   
        String msg = "";
    	switch(type) {
    		// First & last Name
    		case "name":
                            if(value.length() == 0)
                            {
                                msg="The field cannot be empty";
                            }
                    else if(value.length() < 3 || value.length() > 30) {
    				msg="This field must contain 3-30 letters.";
    			} else if(!value.matches("^[a-zA-Z \\-\\.\\']*$")) {
    				msg="This field must only contain letters (a-z).";
    			}
    			
    			break;
    		//  Age
    		case "age":
    			if(!value.matches("[0-9]+")) {
    				msg="This field must only contain digits (0-9).";
    				break;
    			} else if(value.length() > 3 || (Integer.parseInt(value) < 18 || Integer.parseInt(value) > 80)) {
    				msg="Age must be in the range of 18-80.";
    			}
    			break;
    		// Phone number
    		case "phNum":
    			if(!value.matches("\\d+")) {
    				msg="Phone Number field must only contain digits (0-9).";
    			} else if(value.length() != 10) {
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
    			} else if(!value.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,30}$")) {
    				msg="Password field must only contain at least 1 digit, atleast one upper case letter and atleast one special character.";
    			}
    			
    			break;
    		case "image":
    			if(value == "No file selected") {
    				msg="Profile picture not selected.";
    			} else if(!Arrays.asList(fileTypesAllowed).contains(new File(value).toString().substring(new File(value).toString().lastIndexOf('.') + 1))) {
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
    				msg="   This field must contain 3-40 letters.";
    			}else if(!value.matches("^[a-zA-Z[0-9] \\-\\.\\,\\']*$")) {
    				msg="This field must only contain letters (a-z) & some special characters.";
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
    public static Date getDate(String date) {
    	
//    	String dateInString = day+"-"+month+"-"+year;
//    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMMM-yyyy", Locale.ENGLISH);
//    	LocalDate date = LocalDate.parse(dateInString, formatter);
//    	String d = getFormattedDate(date);
    	return new Date();
    }
    
        // Convert date object to formatted string. 
    public static String getFormattedDate(LocalDate date) {
    	return date.format(DateTimeFormatter.ofPattern("d-MMMM-yy"));
    }
    
    public static int getCompIDfromCombo(javax.swing.JComboBox<String> comboBox){
        String a = (String) comboBox.getSelectedItem();
        String [] aSplit = a.split("-");
        return Integer.parseInt(aSplit[0]);
    }
    
}
