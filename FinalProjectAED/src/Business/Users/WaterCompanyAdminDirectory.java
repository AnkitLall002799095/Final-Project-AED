/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Users;

import Application.Utils.DatabaseUtils;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ankitlall
 */
public class WaterCompanyAdminDirectory {
    ArrayList<WaterCompanyAdmin> waterCompAdmin = new ArrayList<>();
    
    public WaterCompanyAdminDirectory() {}
    
    public void createNewUser(WaterCompanyAdmin compAdmin) {
        String userRole = compAdmin.getUserRole();
        String name = compAdmin.getName();
        LocalDate date = compAdmin.getDob();
        String gender = compAdmin.getGender();
        String email= compAdmin.getEmail();
        long phNum = compAdmin.getPhoneNumber();
        String password = compAdmin.getPassword();
        String street = compAdmin.getStreet();
        String comm = compAdmin.getCommunity();
        String city = compAdmin.getCity();
        String state = compAdmin.getState();
        int id=DatabaseUtils.createNewUser(userRole,name,date,gender,email,phNum,password,street,comm,city,state);
        
        int compId=compAdmin.getCompanyId();
        String compType="water";
        DatabaseUtils.addCompanyUsers(compId, compType, id);
    }
}
