/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Users;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class Users extends Person {
    
  Users(int uid ,String userRole, String name, String dob, String gender, String email,String phoneNumber , String password, String street, String community, String city, String state ){
      super();
      setUid(uid);
      setUserRole(userRole);
      setName(name);
      setDob(dob);
      setGender(gender);
      setEmail(email);
      setPhoneNumber(phoneNumber);
      setPassword(password);
      setStreet(street);
      setCommunity(community);
      setCity(city);
      setState(state);
      
      
      
     }

    
    
    
}
