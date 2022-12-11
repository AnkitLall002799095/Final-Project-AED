/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Users;

import Application.Utils.DatabaseUtils;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class UserDirectory {
   public ArrayList<User> userList;

    public UserDirectory() {
        this.userList = new ArrayList<User> ();
    }
   

    public ArrayList<User> getPersonList() {
        return userList;
    }

    public void setPersonList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public int createNewUser(User user) {
        String userRole = user.getUserRole();
        String name = user.getName();
        LocalDate date = user.getDob();
        String gender = user.getGender();
        String email= user.getEmail();
        long phNum = user.getPhoneNumber();
        String password = user.getPassword();
        String street = user.getStreet();
        String comm = user.getCommunity();
        String city = user.getCity();
        String state = user.getState();
        return DatabaseUtils.createNewUser(userRole,name,date,gender,email,phNum,password,street,comm,city,state);        
    }
   
    
    public void deleteUser(User user) {
//        userList.remove(user);
    }
}
