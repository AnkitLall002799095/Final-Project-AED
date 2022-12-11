/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class User extends Person {
    
  public User(String name, LocalDate dob, String gender, String email,long phoneNumber , String password, String street, String community, String city, String state ){
      super();
      setUserRole("consumer");
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
